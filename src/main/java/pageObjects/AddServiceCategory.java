package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddServiceCategory extends BasePage {

    public AddServiceCategory(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "page-title")
    static WebElement pageTitle;

    @FindBy(id = "SerCat_Name")
    static WebElement c_Name;

    @FindBy(id = "SerCat_Description")
    static WebElement c_Description;

    @FindBy(id = "SerCat_Image")
    static WebElement c_image;

    @FindBy(id = "SerCat_Cover_Image")
    static WebElement c_CoverImage;

    @FindBy(id = "SerCat_Video")
    static WebElement c_VideoLink;

    @FindBy(xpath = "//*[@id=\"form_sample_12\"]/div/div/div/div[2]/button")
    static WebElement submitButton;


    public static String verifyAddServiceCategoryPage(){
        return pageTitle.getText();
    }

    public static void enterServiceCategoryDetails(String category_Name, String category_description, String category_image, String category_cover_image, String category_video_link){
        c_Name.sendKeys(category_Name);
        c_Description.sendKeys(category_description);
        c_image.sendKeys(category_image);
        c_CoverImage.sendKeys(category_cover_image);
        c_VideoLink.sendKeys(category_video_link);
    }

    public static void clickOnSubmit(){
        submitButton.click();
    }
}
