package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServiceCategoryListPage extends BasePage {

    public ServiceCategoryListPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "page-title")
    static WebElement pageTitle;

    @FindBy(xpath = "//*[@id=\"form_sample_1\"]/div/div/div/a")
    static WebElement addServiceCategoryLink;

    @FindBy(xpath = "//*[@id=\"datatable-buttons_filter\"]/label/input")
    static WebElement searchField;

    @FindBy(xpath = "//*[@id=\"datatable-buttons\"]/tbody/tr/td[1]")
    static WebElement categoryName;

    @FindBy(xpath = "//*[@id=\"datatable-buttons\"]/tbody/tr/td[8]/a")
    static WebElement editButton;

//    @FindBy(xpath = "//*[@id=\"datatable-buttons\"]/tbody/tr/td[1]")
//    static WebElement filteredCategory;

    public static String verifyServiceCategoryListPage(){
        return pageTitle.getText();
    }

    public static void clickOnAddServiceCategory(){
        addServiceCategoryLink.click();
    }

    public static void search(String text){
        searchField.sendKeys(text);
    }

    public static String verifyAddedCategory(){
        return categoryName.getText();
    }

    public static void selectEdit(){
        editButton.click();
    }

//    public static String verifyServiceCategory(){
//        return filteredCategory.getText();
//    }
}
