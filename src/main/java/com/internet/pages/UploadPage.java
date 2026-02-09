package com.internet.pages;

import com.internet.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadPage extends BasePage {
    public UploadPage(WebDriver driver) {
        super(driver);
    }

@FindBy(id = "file-upload")
    WebElement fileUpload;
    @FindBy(id = "file-submit")
    WebElement uploadButton;
    public Object uploadFileInPage(String path) {
        fileUpload.sendKeys(path);
        clickWithJS(uploadButton,0,200);

        return  this;
    }
@FindBy(id = "uploaded-files")
WebElement uploadedFiles;
    public void FileUploaded() {
        // Используем .getText() вместо .toString()
        Assertions.assertEquals("arbuz.jpg", uploadedFiles.getText().trim());
        System.out.println(uploadedFiles.getText().trim());
    }
}
