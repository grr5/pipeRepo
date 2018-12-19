package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.BasePage;

public class Waits extends BasePage {

    static WebDriverWait wait = new WebDriverWait(driver, 10);
    public static void explicitWaits(WebElement element){

        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void isElementToBeClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
