package stepDefinitions;

import cucumber.api.java.Before;
import helpers.DoubleClickHelper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.BasePage;
import pageObjects.DashBoard;

import java.util.concurrent.TimeUnit;

public class CrossBrowserTests extends BasePage {

    public WebDriver driver;
    Actions actions;
    String BROWSER_NAME="chrome";



//    @Parameters("BROWSER")
//    @BeforeTest
    @BeforeMethod
    public void setUp(){
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
        driver.get("http://javatutorialhq.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test(priority = 2, description = "this is last test")
    public void testing(){
        Assert.assertEquals(driver.getTitle(), "Java Tutorial HQ");
    }

    @Test(priority = 1, description = "this is second test")
    public void dbleClick(){
        actions=new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"post-4156\"]/div/div/div/div[1]/div/div[1]/div/h2"));
        actions.doubleClick(element).build().perform();

    }

    @Test(priority = 0, description = "this is first test")
    public void rightClick(){
        actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"post-4156\"]/div/div/div/div[1]/div/div[1]/div/h2"));
        actions.contextClick(element).perform();
    }
}
