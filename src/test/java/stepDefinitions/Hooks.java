package stepDefinitions;

import browserFactory.BrowserFactory;
import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.testng.annotations.Parameters;
import utils.MyUtilites;

public class Hooks {
    BrowserFactory browserFactory;

    @Before
    public void beforeScenario(Scenario scenario){
        browserFactory = new BrowserFactory();
        BrowserFactory.openBrowser();
//        BrowserFactory.setUp();

        if (scenario.getName().equals("admin  should be able to add  an event with mantatory field")){
            Reporter.assignAuthor("Ravinder");
        } else if (scenario.getName().equals("admin should be able to activate or de-activate a user")){
            Reporter.assignAuthor("Ravi Reddy");
        } else {
            Reporter.assignAuthor("Ravi");
        }
    }

//    @Parameters("BROWSER_NAME1")
//    @Before
//    public void beforeScenario(){
//        browserFactory = new BrowserFactory();
////        BrowserFactory.openBrowser(BROWSER_NAME1);
//        BrowserFactory.setUp();
//
//
//    }

    @After
    public void afterScenario(Scenario scenario) throws Exception{
//        MyUtilites.captureScreenshot(scenario);
//        MyUtilites.getScreenshot();
//        BrowserFactory.closeBrowser();
        MyUtilites.captureScreenshot(scenario);
        Reporter.addScreenCaptureFromPath(MyUtilites.destination.toString());
    }

}
