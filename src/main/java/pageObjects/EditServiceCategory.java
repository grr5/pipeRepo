package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditServiceCategory extends BasePage {

    public EditServiceCategory(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "SerCat_Name")
    static WebElement service_c_Name;

    @FindBy(id = "SerCat_Description")
    static WebElement service_c_Description;

    @FindBy(id = "SerCat_Image_Edit")
    static WebElement c_image_edit;

    @FindBy(id = "SerCat_Cover_Image_Edit")
    static WebElement c_CoverImage_edit;

    @FindBy(id = "SerCat_Video")
    static WebElement c_VideoLink_edit;

    @FindBy(xpath = "//*[@id=\"form_sample_12\"]/div/div/div/div[2]/button")
    static WebElement submitButton;

    public static void enterEditedCategoryyDetails(String category_Name, String category_description, String category_image, String category_cover_image, String category_video_link){
        service_c_Name.clear();
        service_c_Name.sendKeys(category_Name);
        service_c_Description.clear();
        service_c_Description.sendKeys(category_description);
        c_image_edit.clear();
        c_image_edit.sendKeys(category_image);
        c_CoverImage_edit.clear();
        c_CoverImage_edit.sendKeys(category_cover_image);
        c_VideoLink_edit.clear();
        c_VideoLink_edit.sendKeys(category_video_link);
    }

    public static void clickOnSubmit(){
        submitButton.click();
    }
}
