package keys;

import AutomationExercise.base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeysTests extends BaseTests {
    @Test
    public void testBackspace(){
        var keyPage = homePage.clickKeyPresses();
        keyPage.enterText("A" + Keys.BACK_SPACE);// so you can't just do backspace but why we added extra letter which is "A" on it
        // you can use Keys classes this class has so many key presses I mean there is all keyboards letters in there
        assertEquals(keyPage.getResult(),"You entered: BACK_SPACE");
    }
    @Test
    public void testPi(){
        var keyPage = homePage.clickKeyPresses();
        keyPage.enterPi();
    }

}
