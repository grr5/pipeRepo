package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServiceSubCategory extends BasePage {
    public ServiceSubCategory(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "page-title")
    static WebElement pageTitle;

    @FindBy(xpath = "//*[@id=\"form_sample_1\"]/div/div[1]/div/a")
    static WebElement addServiceSubCategoryLink;

    @FindBy(xpath = "//*[@id=\"datatable-buttons_filter\"]/label/input")
    static WebElement searchField;

    public static String verifyServiceSubCategoryPage(){
        return pageTitle.getText();
    }

    public static void search(String sub_cat_name){
        searchField.clear();
        searchField.sendKeys(sub_cat_name);
    }

    public static void addServiceSubCategory(){
        addServiceSubCategoryLink.click();
    }
}
