package ui.utilities;

import org.openqa.selenium.JavascriptExecutor;

public class ReusableMethods {

    public static void scrollDown() {
        JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
}
