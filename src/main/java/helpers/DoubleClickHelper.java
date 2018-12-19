package helpers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pageObjects.BasePage;

public class DoubleClickHelper extends BasePage {
    public static void doubleClick(WebElement element){
        Actions actions = new Actions(driver);
        actions.doubleClick(element).perform();

    }
}
