package browserFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import pageObjects.BasePage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.remote.CapabilityType.BROWSER_NAME;

public class BrowserFactory extends BasePage {

    public static Properties properties = new Properties();

    public BrowserFactory(){
        try {
            FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/config.properties");
            properties.load(ip);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }


//    @Parameters("BROWSER_NAME")
//    public static void setUp(){
//        openBrowser(BROWSER_NAME);
//    }




    @Parameters("BROWSER_NAME")
    public static void openBrowser(){
        String BROWSER_NAME = properties.getProperty("browser");

        String REMOTE_BROWSER = properties.getProperty("remote");
        if (REMOTE_BROWSER.equalsIgnoreCase("false")){
            try {
                System.out.println("Grid started in SauceLabs");
                DesiredCapabilities capabilities = new DesiredCapabilities();
                if (System.getProperty("Browser").equalsIgnoreCase("firefox")){
                    capabilities = DesiredCapabilities.firefox();
                    capabilities.setVersion("47");
                } else if (System.getProperty("Browser").equalsIgnoreCase("chrome")){
                    capabilities = DesiredCapabilities.chrome();
                    capabilities.setVersion("54");
                }
                capabilities.setPlatform(Platform.WIN10);
                capabilities.setCapability("SauceLabs.debug", "true");

                URL url = new URL(properties.getProperty("SELENIUM_GRID_URL"));
                driver = new RemoteWebDriver(url, capabilities);
                driver.get(properties.getProperty("URL"));
                System.out.println("Title is " + driver.getTitle());
            } catch (Exception e){
//                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        } else {
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
            driver.get(properties.getProperty("URL"));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
    }


    public static void closeBrowser(){
        driver.quit();
    }
}
