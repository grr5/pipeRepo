package pageObjects;

import helpers.AlertHelper;
import helpers.DropDownHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServiceVendorList extends BasePage {

    public ServiceVendorList(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "page-title")
    static WebElement pageTitle;

    @FindBy(xpath = "//*[@id=\"datatable-buttons_filter\"]/label/input")
    static WebElement searchField;

    @FindBy(xpath = "//*[@id=\"datatable-buttons\"]/tbody/tr[1]/td[1]")
    static WebElement vendorName;

    @FindBy(xpath = "//*[@id=\"datatable-buttons\"]/tbody/tr[2]/td/ul/li[1]/span[1]")
    static WebElement vendorDetails;

    @FindBy(xpath = "//*[@id=\"datatable-buttons\"]/tbody/tr/td")
    static WebElement errorMsg;

    @FindBy(xpath = "//*[@id=\"datatable-buttons\"]/tbody/tr[1]/td[14]/div/button")
    static WebElement activeType;

    @FindBy(xpath = "//*[@id=\"datatable-buttons\"]/tbody/tr[1]/td[14]/div/ul/li[1]/a")
    static WebElement active;

    @FindBy(xpath = "//*[@id=\"datatable-buttons\"]/tbody/tr[1]/td[14]/div/ul/li[2]/a")
    static WebElement inActive;

    @FindBy(xpath = "//*[@id=\"datatable-buttons\"]/tbody/tr[1]/td[15]/a")
    static WebElement vendorServices;

    public static String verifyServiceVendorListPage(){
        return pageTitle.getText();
    }

    public static void search(String vendorName){
        searchField.clear();
        searchField.sendKeys(vendorName);
    }

    public static void selectVendor(){
        vendorName.click();
    }

    public static String verifySelectedVendor(){
        return vendorName.getText();
    }

    public static String verifyVendorDetails(){
        return vendorDetails.getText();
    }

    public static String errorMessage(){
        return errorMsg.getText();
    }

    public static void choseActiveType(){
//        DropDownHelper.selectByVisible(activeType, text);
        activeType.click();
        active.click();
        AlertHelper.closeAlertAndGetItsText();
    }

    public static void choseInActive(){
        activeType.click();
        inActive.click();
        AlertHelper.closeAlertAndGetItsText();
    }

    public static String verifyActiveType(){
        System.out.println("selected active type is " + active.getText());
        return active.getText();
    }

    public static String verifyInActiveType(){
        System.out.println("selected active type is " + active.getText());
        return inActive.getText();
    }

    public static void selectVendorServices(){
        vendorServices.click();
    }
}
