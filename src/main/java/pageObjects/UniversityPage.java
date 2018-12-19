package pageObjects;

import helpers.AlertHelper;
import helpers.DropDownHelper;
import helpers.HoverOverHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UniversityPage extends BasePage {

    public UniversityPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "page-title")
    static WebElement pageTitle;

    @FindBy(xpath = "//*[@id=\"form_sample_1\"]/div/div/div/a")
    static WebElement registerUniversityLink;

    @FindBy(xpath = "//*[@id=\"datatable-buttons_filter\"]/label/input")
    static WebElement searchField;

    @FindBy(xpath = "//*[@id=\"datatable-buttons\"]/tbody/tr/td[1]")
    static WebElement newUni;

    @FindBy(xpath = "//*[@id=\"datatable-buttons\"]/tbody/tr[1]/td[7]/div/button")
    static WebElement activationDropDown;

    @FindBy(xpath = "//*[@id=\"datatable-buttons\"]/tbody/tr/td[7]/div/ul/li[2]/a")
    static WebElement inActive;

    @FindBy(xpath = "//*[@id=\"datatable-buttons\"]/tbody/tr/td[7]/div/ul/li[1]/a")
    static WebElement active;

    @FindBy(xpath = "//*[@id=\"datatable-buttons\"]/tbody/tr/td[8]/a")
    static WebElement edit;

    public static String verifyUniversityListPage(){
        return pageTitle.getText();
    }

    public static void clickOnRegisterUniversity(){
        registerUniversityLink.click();
    }

    public static void search(String text){
        searchField.clear();
        searchField.sendKeys(text);
    }

    public static String verifyNewUni(){
        System.out.println("this is the new added university " + newUni.getText());
        return newUni.getText().toString();
    }

    public static void choseActiveType(String type){
        DropDownHelper.selectByVisible(activationDropDown, type);
//        activationDropDown.click();
//        inActive.click();
        AlertHelper.closeAlertAndGetItsText();
    }

    public static void selectEdit(){
        edit.click();
    }
}
