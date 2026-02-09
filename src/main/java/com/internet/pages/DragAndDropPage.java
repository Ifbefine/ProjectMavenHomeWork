package com.internet.pages;

import com.internet.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends BasePage {
    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }
@FindBy(id = "column-a")
    WebElement squareA;
    @FindBy(id = "column-b")
    WebElement squareB;
    public DragAndDropPage dragAndDropSquares() {
        // Создаем объект Actions прямо здесь, передавая ему драйвер
        Actions actions = new Actions(driver);
        actions.dragAndDrop(squareA, squareB).perform();
        return this;
    }
}
