package com.internet.pages;

import com.internet.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewWindowsPage extends BasePage {
    public NewWindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h3[contains(text(),'New Window')]")
    WebElement newWindowHeader;

    // Убрали static, добавили проверку
    public NewWindowsPage verifyHeaderText(String expectedText) {

        Assertions.assertTrue(shouldHaveText(newWindowHeader, expectedText, 5));
        return this;
    }
}
