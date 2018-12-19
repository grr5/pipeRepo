package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorList extends BasePage {
    public VendorList(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "page-title")
    static WebElement pageTitle;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/form/div/div[2]/div[2]/label/input")
    static WebElement searchField;

    @FindBy(xpath = "//*[@id=\"datatable-buttons\"]/tbody/tr/td[18]/a")
    static WebElement addEventLink;


    public static String verifyVendorListPage(){
        return pageTitle.getText();
    }

    public static void search(String vendor){
        searchField.clear();
        searchField.sendKeys(vendor);
    }

    public static void addEvent(){
        addEventLink.click();
    }
}
