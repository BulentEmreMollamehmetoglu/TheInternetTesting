package context;

import AutomationExercise.base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {
    @Test
    public void testRightClick(){
        var menuPage = homePage.clickContextMenuPage();
        menuPage.rightClickInBox();
        String message = menuPage.getPopUpText();
        menuPage.acceptPopUp();
        assertEquals(message,"You selected a context menu","Popup message incorrect");
    }
}
