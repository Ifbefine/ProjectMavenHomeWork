package com.internet.pages;

import com.internet.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HoversPage  extends BasePage {
    public HoversPage(WebDriver driver) {
        super(driver);
    }
@FindBy(xpath = "(//div[@class='figure'])[2]")
WebElement figure1;
    public HoversPage moveToElement() {
        new Actions(driver).moveToElement(figure1).perform();
        return this;

    }
    public String getUserName(){
        return figure1.getText();
    }
}
