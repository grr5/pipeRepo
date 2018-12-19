package pageObjects;

import helpers.DropDownHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEvent extends BasePage {

    public AddEvent(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "List of Events ")
    static WebElement pageTitle;

    @FindBy(id = "Offers_Name")
    static WebElement eventName;

    @FindBy(id = "Offers_Description")
    static WebElement eventDescription;

    @FindBy(id = "Offers_Start__Time")
    static WebElement eventStartTime;

    @FindBy(name = "Offers_End_Time")
    static WebElement eventEndTime;

    @FindBy(name = "EventLongitude")
    static WebElement longitude;

    @FindBy(id = "datepicker-autoclose")
    static WebElement eventStartDate;

    @FindBy(id = "datepicker")
    static WebElement eventEndDate;

    @FindBy(id = "CategoryTypeList")
    static WebElement selectCategory;

    @FindBy(name = "EventAddress1")
    static WebElement address1;

    @FindBy(name = "EventCity")
    static WebElement eventCity;

    @FindBy(name = "EventLatitude")
    static WebElement eventLatitude;

    @FindBy(name = "Terms")
    static WebElement terms;

    @FindBy(id = "Event_Cover_Img")
    static WebElement eventImg;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/form/div/div/div[2]/div/div[9]/button")
    static WebElement submit;

    public static String verifyAddEventPage(){
        return pageTitle.getText();
    }

    public static void setSelectCategory(String category){
        DropDownHelper.selectByVisible(selectCategory, category);
    }

    public static void enterEventDetails(String e_Name, String e_Description, String e_StartTime, String e_EndTime, String e_Longitude,
                                         String e_StartDate, String e_EndDate,
                                         String address, String e_City, String e_Latitude, String e_Terms, String img){
        eventName.sendKeys(e_Name);
        eventDescription.sendKeys(e_Description);
        eventStartTime.sendKeys(e_StartTime);
        eventEndTime.sendKeys(e_EndTime);
        longitude.sendKeys(e_Longitude);
        eventStartDate.sendKeys(e_StartDate);
        eventEndDate.sendKeys(e_EndDate);
        address1.sendKeys(address);
        eventCity.sendKeys(e_City);
        eventLatitude.sendKeys(e_Latitude);
        terms.sendKeys(e_Terms);
        eventImg.sendKeys(img);
        submit.click();
    }
}
