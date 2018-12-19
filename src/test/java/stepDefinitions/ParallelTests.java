package stepDefinitions;

import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.BasePage;

import java.util.concurrent.TimeUnit;

public class ParallelTests extends BasePage {
    @Parameters("BROWSER")
    @BeforeTest
    public void setUp(String BROWSER_NAME){
        if (BROWSER_NAME.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (BROWSER_NAME.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (BROWSER_NAME.equalsIgnoreCase("edge")){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else if (BROWSER_NAME.equalsIgnoreCase("opera")){
            WebDriverManager.operadriver().setup();
            driver = new OperaDriver();
        }

        driver.manage().deleteAllCookies();
        driver.get("https://www.seleniumeasy.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testing(){
        Assert.assertEquals(driver.getTitle(), "Selenium Easy Tutorials | Selenium Easy");
    }
}
