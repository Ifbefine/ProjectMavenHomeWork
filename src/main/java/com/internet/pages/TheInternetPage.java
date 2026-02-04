package com.internet.pages;

import com.internet.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TheInternetPage extends BasePage {
    public TheInternetPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "a[href='/windows/new']")
    WebElement clickHereLink;


    public TheInternetPage clickOnClickHereButton() {
        clickHereLink.click();
        Object[] windowsHandles = driver.getWindowHandles().toArray();
        driver.switchTo().window(windowsHandles[1].toString());
        return this;
    }






}
