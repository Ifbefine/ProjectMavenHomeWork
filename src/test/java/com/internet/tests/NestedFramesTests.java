package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.NestedFramesPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NestedFramesTests extends TestBase {
    NestedFramesPage nestedFrames;
    @BeforeEach
    public void navigateToNestedFramesPage(){
        nestedFrames=new NestedFramesPage(driver);
driver.navigate().to("https://the-internet.herokuapp.com/nested_frames");


    }
    @Test
    public void TestFrames(){

        nestedFrames.getLeftFrameText().getBottomFrameText().getMiddleFrameText().getRightFrameText();


    }
}
