package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventsList extends BasePage{

    public EventsList(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(className = "page-title")
    static WebElement pageTitle;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/form/div/div[1]/div/a")
    static WebElement addEventLink;

    @FindBy(xpath = "//*[@id=\"datatable-buttons_filter\"]/label/input")
    static WebElement searchField;

    @FindBy(xpath = "//*[@id=\"datatable-buttons\"]/tbody/tr/td[1]")
    static WebElement eventName;

    public static String verifyEventsListPage(){
        return pageTitle.getText();
    }

    public static String getEventName(){
        return eventName.getText();
    }

    public static void search(String eventName){
        searchField.clear();
        searchField.sendKeys(eventName);
    }

    public static void clickOnAddEvent(){
        addEventLink.click();
    }

}
