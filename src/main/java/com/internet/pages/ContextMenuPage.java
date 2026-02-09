package com.internet.pages;

import com.internet.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ContextMenuPage extends BasePage {
    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }
@FindBy(id = "hot-spot")
WebElement hotSpot;
    public ContextMenuPage clickOnBoard() {
        Actions actions = new Actions(driver);
        actions.contextClick(hotSpot).perform();
        return this;
    }

    public ContextMenuPage clickOk() {
        driver.switchTo().alert().accept();
        return this;
    }

    public ContextMenuPage clickBtnDown() {
        driver.navigate().back();
        return this;
    }

    public void checkHomePage() {
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals("https://the-internet.herokuapp.com/", currentUrl);
        System.out.println("Current URL: " + currentUrl);
    }
    }

