package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.UploadPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UploadTestPage extends TestBase {
    UploadPage uploadPage;
    @BeforeEach
    public void before(){
        driver.navigate().to("https://the-internet.herokuapp.com/upload");
    }
    @Test
    public void UploadTest(){
        uploadPage = new UploadPage(driver);
        uploadPage.uploadFileInPage("C:/Users/Ifbefine/Downloads/arbuz.jpg");
        uploadPage.FileUploaded();

    }
}
