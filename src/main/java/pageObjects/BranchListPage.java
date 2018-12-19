package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BranchListPage extends BasePage {

    public BranchListPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "page-title")
    static WebElement pageTitle;

    @FindBy(xpath = "//*[@id=\"form_sample_1\"]/div/div/div/a")
    static WebElement registerBranchLink;

    @FindBy(xpath = "//*[@id=\"datatable-buttons_filter\"]/label/input")
    static WebElement searchField;

    @FindBy(linkText = "Edit")
    static WebElement edit;

    public static String verifyBranchListPage(){
        return pageTitle.getText().toString();
    }

    public static void clickOnregisterBranch(){
        registerBranchLink.click();
    }

    public static void search(String text){
        searchField.clear();
        searchField.sendKeys(text);
    }

    public static void clickOnEdit(){
        edit.click();
    }
}
