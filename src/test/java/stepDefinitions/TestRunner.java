package stepDefinitions;

import browserFactory.BrowserFactory;
import com.aventstack.extentreports.ExtentTest;
import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utils.MyUtilites;

import java.io.File;

@CucumberOptions(
        features = "src\\test\\resources\\features",
//        glue = "src\\test\\java\\stepDefinitions",
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:reports/report.html",
                "html:target/cucumber-reports",
                "json:target/cucumber-reports/Cucumber.json"},
        tags = {"@login"},
        dryRun = false,
        monochrome = true,

        strict = true
)
public class TestRunner extends AbstractTestNGCucumberTests {

    @BeforeClass
    public static void setUp(){
        ExtentProperties extentProperties = ExtentProperties.INSTANCE;
        extentProperties.getProjectName();
    }

    @AfterClass
    public static void writeExtentReport() throws Exception{
        ExtentTest logger;
//        com.cucumber.listener.Reporter.loadXMLConfig(new File("src\\main\\resources\\extent-config.xml"));
        Reporter.loadXMLConfig(new File("src\\main\\resources\\extent-config.xml"));
        Reporter.setSystemInfo("User Name ", System.getProperty("user.name"));
        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        Reporter.setSystemInfo("Machine", 	"Windows 10, " + "64 Bit");
        Reporter.setSystemInfo("Selenium", "3.14.0");
        Reporter.setSystemInfo("Maven", "3.5.4");
        Reporter.setSystemInfo("Java Version", "1.8.0_181");
//        Reporter.addScreenCast(MyUtilites.getScreenhot());
//        Reporter.addScreenCaptureFromPath(MyUtilites.src, "this is title");
//        Reporter.addScreenCaptureFromPath(MyUtilites.destination);
        Reporter.addScenarioLog("this is scenario log");
        Reporter.addStepLog("this is step log");

    }
}
