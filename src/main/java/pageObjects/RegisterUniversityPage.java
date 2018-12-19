package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterUniversityPage extends BasePage {

    public RegisterUniversityPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class=\"container\"]/div/div/div/h4")
    static WebElement header;

    @FindBy(id = "Uni_Name")
    static WebElement uniName;

    @FindBy(id = "Uni_Domain")
    static WebElement domainName;

    @FindBy(id = "Uni_Description")
    static WebElement uniDescription;

    @FindBy(id = "Uni_Address")
    static WebElement uniAddress;

    @FindBy(id = "Uni_Phone")
    static WebElement uniPhone;

    @FindBy(id = "Uni_Logo")
    static WebElement uniLogo;

    @FindBy(xpath = "//*[@id=\"form_sample_12\"]/div/div/div[2]/div/div[4]/button")
    static WebElement addButton;

    @FindBy(xpath = "//*[@id=\"form_sample_12\"]/div[1]")
    static WebElement errorMessage;

    public static String verifyRegisterPage(){
        return header.getText().toString();
    }

    public static void enterUniDetailsRequired(String name, String domain){
        uniName.clear();
        uniName.sendKeys(name);
        domainName.clear();
        domainName.sendKeys(domain);

    }

    public static void uploadLogo(String logo){
//        uniLogo.click();
        uniLogo.clear();
        uniLogo.sendKeys("C:/Users/Ravi/Desktop/images/a1.jpg");
    }

    public static void clickOnAdd(){
        addButton.click();
    }

    public static void printErrorMessage(){
        System.out.println(errorMessage.getText().toString());
    }
}
