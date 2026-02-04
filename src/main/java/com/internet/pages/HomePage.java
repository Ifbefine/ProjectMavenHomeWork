package com.internet.pages;

import com.internet.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "a[href='/javascript_alerts']")
    WebElement javascriptAlerts;


    public void clickOnJavascriptAlertsLink() {

        clickWithJS(javascriptAlerts, 0, 300);
    }
    @FindBy(css = "a[href='/windows']")
    WebElement windowsButton;
    public void clickOnWindowsLink() {
        clickWithJS(windowsButton, 0, 300);
    }
}