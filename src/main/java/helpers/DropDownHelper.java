package helpers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pageObjects.BasePage;

public class DropDownHelper extends BasePage {
    public static Select select;

    public static void selectByVisible(WebElement element, String text){
        select = new Select(element);
        select.selectByVisibleText(text);
    }
}
