package horizontal;
import base.BaseTests;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

import static org.testng.Assert.*;
public class HorizontalSliderTests extends BaseTests {

    @Test
    public void clickHorizontalSlider(){
        String value = "4";
        HorizontalSliderPage horizontalSlider = homePage.clickHorizontalSlider();
        horizontalSlider.enterKeys(value);
        assertEquals(horizontalSlider.getRangeText(),value,"Incorrent range text");
    }
}
