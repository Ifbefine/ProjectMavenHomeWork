package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.DropDownListPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DropDownListTest extends TestBase {
    DropDownListPage dropDown;

    @BeforeEach
    public void dropdownLink() {
        dropDown = new DropDownListPage(driver);
        driver.navigate().to("https://the-internet.herokuapp.com/dropdown");
    }

    @Test
    public void testElementDropDown() {
        dropDown.clickOnElement("Option 1");


    }

    @Test
    public void testElementDropDown2() {
        dropDown.clickOnElement("Option 2");
    }
}
