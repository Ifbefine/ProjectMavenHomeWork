package com.internet.pages;

import com.internet.core.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HorizontalSliderPage extends BasePage {
    public HorizontalSliderPage(WebDriver driver) {
        super(driver);
    }
@FindBy(xpath = "//input[@type='range']")
    WebElement slider;
    public HorizontalSliderPage sliderSwitch(int steps) {
        for(int i=0; i<steps;i++){
            slider.sendKeys(Keys.ARROW_RIGHT);
        }
        return this;
    }
@FindBy(id = "range")
WebElement rangeValue;
    public String getSliderValue() {
        return rangeValue.getText();
    }
}
