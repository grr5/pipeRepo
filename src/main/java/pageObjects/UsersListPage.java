package pageObjects;

import helpers.AlertHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersListPage extends BasePage {

    public UsersListPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div/div/div[1]/div/div/h4")
    static WebElement usersHeader;

    @FindBy(xpath = "//*[@id=\"datatable-buttons_filter\"]/label/input")
    static WebElement search;

    @FindBy(xpath = "//*[@id=\"datatable-buttons\"]/tbody/tr/td[7]/div/button")
    static WebElement activeType;

    @FindBy(xpath = "//*[@id=\"datatable-buttons\"]/tbody/tr/td[7]/div/ul/li[2]/a")
    static WebElement inActive;

    @FindBy(xpath = "//*[@id=\"datatable-buttons\"]/tbody/tr/td[6]/span")
    static WebElement statusResult;

    public static String verifyUsersPage(){
        return usersHeader.getText();
    }

    public static void searchField(String text){
        search.clear();
        search.sendKeys(text);
    }

    public static void choseActiveType(){
        activeType.click();
        inActive.click();
        AlertHelper.closeAlertAndGetItsText();
    }

    public static String verifyStatusChanged(String text){
        searchField(text);
        return statusResult.getText();
    }
}
