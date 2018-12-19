package helpers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pageObjects.BasePage;

public class HoverOverHelper extends BasePage {
    public static void hoverOver(WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }
}
