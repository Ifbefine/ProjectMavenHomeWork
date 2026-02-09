package com.internet.core;

import org.jspecify.annotations.NonNull;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected Actions actions;
    protected WebDriver driver;
    public static JavascriptExecutor js;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        js = (JavascriptExecutor) driver;
    }

    public void scrollWithJS(int x, int y) {
        js.executeScript("window.scrollBy(" + x + "," + y + ")");
    }

    public void clickWithJS(WebElement element, int x, int y) {
        scrollWithJS(x,y);
        click(element);
    }

    public void typeWithJS(WebElement element, String text, int x, int y) {
        scrollWithJS(x,y);
        type(element,text);
    }

    public void click(WebElement element) {
        element.click();
    }

    public void type(WebElement element, String text) {
        if (text != null) {
            click(element);
            element.clear();
            element.sendKeys(text);
        }
    }
    public boolean isAlertPresent(int time){
        Alert alert= getwait(time)
                .until(ExpectedConditions.alertIsPresent());
        if (alert==null) {
            return false;

        }
        else {
            driver.switchTo().alert();
            return true;
        }

    }

    public @NonNull WebDriverWait getwait(int time) {
        return new WebDriverWait(driver, Duration.ofSeconds(time));
    }

    public boolean isContainsText(String text, WebElement element) {
        return element.getText().contains(text);
    }
    public boolean shouldHaveText(WebElement element, String text, int time) {
        return getwait(time).until(ExpectedConditions.textToBePresentInElement(element,text));
    }

}
