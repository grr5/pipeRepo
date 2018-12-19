package pageObjects;

import helpers.DropDownHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddServiceSubCategory extends BasePage {
    public AddServiceSubCategory(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "page-title")
    static WebElement pageTitle;

    @FindBy(id = "SerCatList")
    static WebElement serviceCategory;

    @FindBy(id = "Ser_SubCat_Name")
    static WebElement ser_sub_cat_name;

    @FindBy(id = "Ser_Sub_Cat_Image")
    static WebElement ser_sub_cat_img;

    @FindBy(xpath = "//*[@id=\"form_sample_12\"]/div/div/div/div[2]/button")
    static WebElement submit;

    public static String verifyAddServiceSubCategoryPage(){
        return pageTitle.getText();
    }

    public static void selectServiceCategory(String service_Cat_Name){
        DropDownHelper.selectByVisible(serviceCategory, service_Cat_Name);
    }

    public static void enterServiceSubCategoryDetails(String service_Sub_Category_Name, String service_Sub_Category_img){
        ser_sub_cat_name.sendKeys(service_Sub_Category_Name);
        ser_sub_cat_img.sendKeys(service_Sub_Category_img);
        submit.click();
    }
}
