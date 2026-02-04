package com.internet.pages;

import com.internet.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NestedFramesPage extends BasePage {
    public NestedFramesPage(WebDriver driver) {
        super(driver);
    }
@FindBy(css = "body")
    WebElement body;
    public NestedFramesPage getLeftFrameText() {
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        Assertions.assertTrue(body.getText().contains("LEFT"));
        driver.switchTo().defaultContent();
        return this;
    }

    public NestedFramesPage getMiddleFrameText() {
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        Assertions.assertTrue(body.getText().contains("MIDDLE"));
        driver.switchTo().defaultContent();
        return this;
    }

    public NestedFramesPage getRightFrameText() {
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-right");
        Assertions.assertTrue(body.getText().contains("RIGHT"));
        driver.switchTo().defaultContent();
        return this;
    }

    public NestedFramesPage getBottomFrameText() {
        driver.switchTo().frame("frame-bottom");
        Assertions.assertTrue(body.getText().contains("BOTTOM"));
        driver.switchTo().defaultContent();
        return this;
    }
}
