package pageObjects;

import helpers.DropDownHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddVendorBranch extends BasePage {

    public AddVendorBranch(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "page-title")
    static WebElement pageTitle;

    @FindBy(id = "VendorList")
    static WebElement vendorList;

    @FindBy(id = "Branch_Name")
    static WebElement branch_Name;

    @FindBy(id = "Branch_Email")
    static WebElement branch_Email;

    @FindBy(id = "Branch_Password")
    static WebElement branch_PWD;

    @FindBy(id = "Branch_Address1")
    static WebElement address1;

    @FindBy(id = "Branch_Address2")
    static WebElement address2;

    @FindBy(id = "Branch_Latitude")
    static WebElement latitude;

    @FindBy(id = "Branch_Longitude")
    static WebElement longitude;

    @FindBy(id = "Branch_State")
    static WebElement area;

    @FindBy(id = "Branch_City")
    static WebElement branch_City;

    @FindBy(id = "Branch_Number")
    static WebElement branch_Phone;

    @FindBy(xpath = "//*[@id=\"form_sample_12\"]/div/div/div[2]/div/div[6]/button")
    static WebElement addButton;

    public static String verifyAddVendorBranchPage(){
        return pageTitle.getText().toString();
    }

    public static void enterVendorBranchMandatoryDetails(String vendorName, String b_Name, String b_email, String password, String b_address1, String b_latitude, String b_longitude, String b_city, String b_phone_number){
        DropDownHelper.selectByVisible(vendorList, vendorName);
        branch_Name.sendKeys(b_Name);
        branch_Email.sendKeys(b_email);
        branch_PWD.sendKeys(password);
        address1.sendKeys(b_address1);
        latitude.sendKeys(b_latitude);
        longitude.sendKeys(b_longitude);
        branch_City.sendKeys(b_city);
        branch_Phone.sendKeys(b_phone_number);
    }

    public static void enterVendorBranchAllDetails(String vendorName, String b_Name, String b_email, String password, String b_address1, String b_address2, String b_latitude, String b_longitude, String b_area, String b_city, String b_phone_number){
        DropDownHelper.selectByVisible(vendorList, vendorName);
        branch_Name.sendKeys(b_Name);
        branch_Email.sendKeys(b_email);
        branch_PWD.sendKeys(password);
        address1.sendKeys(b_address1);
        address2.sendKeys(b_address2);
        latitude.sendKeys(b_latitude);
        longitude.sendKeys(b_longitude);
        area.sendKeys(b_area);
        branch_City.sendKeys(b_city);
        branch_Phone.sendKeys(b_phone_number);
    }

    public static void clickOnAddButton(){
        addButton.click();
    }
}
