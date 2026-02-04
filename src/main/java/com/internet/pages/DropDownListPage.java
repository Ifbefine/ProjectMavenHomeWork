package com.internet.pages;

import com.internet.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DropDownListPage extends BasePage {
    public DropDownListPage(WebDriver driver) {
        super(driver);
    }
@FindBy(id = "dropdown")
WebElement dropDown;
    public DropDownListPage clickOnElement(String optionName) {
        Select select=new Select(dropDown);
        select.selectByVisibleText(optionName);

        return this;
    }

}
