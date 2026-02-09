package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.ContextMenuPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContextMenuTest extends TestBase {
    ContextMenuPage contextMenuPage;

    @BeforeEach
    public void before(){
        driver.get("https://the-internet.herokuapp.com/context_menu");


    }
    @Test
    public void TestContextMenu(){
        contextMenuPage = new ContextMenuPage(driver);
        contextMenuPage.clickOnBoard().clickOk().clickBtnDown().
    checkHomePage();


    }
}
