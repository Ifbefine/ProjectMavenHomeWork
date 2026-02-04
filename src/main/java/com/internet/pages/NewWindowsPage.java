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
    WebElement newWindowHeader; // Переименовал в Header, так как это заголовок, а не ссылка

    // Убрали static, добавили проверку
    public NewWindowsPage verifyHeaderText(String expectedText) {
        // Используем твой метод ожидания текста из BasePage
        Assertions.assertTrue(shouldHaveText(newWindowHeader, expectedText, 5));
        return this;
    }
}
