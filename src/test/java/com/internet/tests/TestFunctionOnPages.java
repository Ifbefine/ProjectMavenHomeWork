package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.DragAndDropPage;
import com.internet.pages.HorizontalSliderPage;
import com.internet.pages.HoversPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFunctionOnPages extends TestBase {
    DragAndDropPage dragAndDropPage;
HorizontalSliderPage sliderSwitch;


    @Test
    public void SwitchElements(){
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");

dragAndDropPage=new DragAndDropPage(driver);
dragAndDropPage.dragAndDropSquares();
    }
    @Test
    public void sliderSwitchOnPage(){
        driver.get("https://the-internet.herokuapp.com/horizontal_slider");
        sliderSwitch=new HorizontalSliderPage(driver);
        sliderSwitch.sliderSwitch(5);
        String finalValue = sliderSwitch.getSliderValue();
        Assertions.assertEquals("2.5",finalValue);


    }
    HoversPage hoversPage;
    @Test
    public void hoversPageTest(){
        driver.get("https://the-internet.herokuapp.com/hovers");
        hoversPage=new HoversPage(driver);
        hoversPage.moveToElement().getUserName();

    }
}
