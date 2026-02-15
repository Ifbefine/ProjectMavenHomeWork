package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.BrokenImagesPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BrokenImagesTest extends TestBase {
    @BeforeEach
    public void before(){
        driver.get("https://the-internet.herokuapp.com/broken_images");

    }
    @Test
    public void testBrokenImages() {
        BrokenImagesPage brokenPage = new BrokenImagesPage(driver);
        brokenPage.checkBrokenImages();


    }
}