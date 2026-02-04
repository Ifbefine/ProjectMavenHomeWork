package com.internet.tests;

import ch.qos.logback.core.joran.conditional.ThenAction;
import com.internet.core.TestBase;
import com.internet.pages.*;
import com.internet.pages.TheInternetPage;
import org.junit.jupiter.api.Test;

public class TestsJsAlerts  extends TestBase {

    @Test
    public void  JavaScriptAlertsButton(){
        HomePage homePage = new HomePage(driver);
        homePage.clickOnJavascriptAlertsLink();
        AlertsPage alertsPage=new AlertsPage(driver);
        alertsPage.clickForJsAlert();
        alertsPage.acceptAlert();
        alertsPage.clickForJsConfirm();
        alertsPage.dismissConfirm();
        alertsPage.clickForJsPrompt();
        alertsPage.writeInJsPrompt("Hello Teacher!").acceptAlert();



    }
    @Test
    public void WindowsLink(){
        HomePage homePage = new HomePage(driver);
        homePage.clickOnWindowsLink();
        TheInternetPage internetPage=new TheInternetPage(driver);
        internetPage.clickOnClickHereButton();
        NewWindowsPage newWindowsPage=new NewWindowsPage(driver);
        newWindowsPage.verifyHeaderText("New Window");
    }


}
