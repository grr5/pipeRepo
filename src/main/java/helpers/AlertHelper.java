package helpers;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import pageObjects.BasePage;

public class AlertHelper extends BasePage {
    private static boolean acceptNextAlert = true;
    //Verifying an Alert on the Page
    public static boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public static String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
