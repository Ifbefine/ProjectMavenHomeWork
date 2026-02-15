package com.internet.pages;

import com.internet.core.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

// ПРАВИЛЬНЫЕ ИМПОРТЫ
import java.util.List; // Именно этот List нужен для коллекций
import java.util.ArrayList;

public class BrokenImagesPage extends BasePage {
    public BrokenImagesPage(WebDriver driver) {
        super(driver);

    }@FindBy(tagName = "img")
    List<WebElement> allImages;

    public BrokenImagesPage checkBrokenImages() {
        System.out.println("Total images: " + allImages.size());
        for (WebElement img : allImages) {
            // Проверяем через JavaScript, загрузилась ли картинка в реальности
            boolean isDisplayed = (Boolean) ((org.openqa.selenium.JavascriptExecutor) driver)
                    .executeScript("return (typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0);", img);

            if (!isDisplayed) {
                System.out.println("URL: " + img.getAttribute("src") + " is BROKEN");
            } else {
                System.out.println("URL: " + img.getAttribute("src") + " is OK");
            }
        }
        return this;
    }
}
