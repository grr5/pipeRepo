package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Waits;

public class LoginPage extends BasePage {
    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "Email")
    static WebElement eMail;

    @FindBy(id = "password")
    static WebElement password;

    @FindBy(xpath = "//input[@type=\"submit\"]")
    static WebElement loginButton;

    public static String verifyHomepage(){
        return driver.getCurrentUrl();
    }

    public static void login(String admEmail, String admPWD){
        eMail.sendKeys(admEmail);
        password.sendKeys(admPWD);
    }

    public static void enterEmail(String adminEmail){
        eMail.sendKeys(adminEmail);
    }

    public static void enterPassword(String pwd){
        password.sendKeys(pwd);
    }

    public static void clickOnLogin(){
        loginButton.click();
    }
}
