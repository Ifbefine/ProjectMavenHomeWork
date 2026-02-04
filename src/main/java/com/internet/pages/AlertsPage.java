package com.internet.pages;

import com.internet.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsPage extends BasePage {

    public AlertsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "button[onclick='jsAlert()']")
    WebElement clickForJsAlert;
    public AlertsPage clickForJsAlert(){
        clickForJsAlert.click();
        return this;
    }
    public AlertsPage acceptAlert(){
        driver.switchTo().alert().accept();
        return this;
    }
    @FindBy(css = "button[onclick='jsConfirm()']")
    WebElement clickForJsConfirm;
    public AlertsPage clickForJsConfirm(){
        clickForJsConfirm.click();
        return this;
    }
    public AlertsPage dismissConfirm(){
        driver.switchTo().alert().dismiss();
        return this;
    }
    @FindBy(css = "button[onclick='jsPrompt()']")
    WebElement clickForJsPrompt;
    public AlertsPage clickForJsPrompt(){
        clickForJsPrompt.click();
        return this;
    }
    public AlertsPage writeInJsPrompt(String text){
        driver.switchTo().alert().sendKeys(text);
        return this;
    }

}
