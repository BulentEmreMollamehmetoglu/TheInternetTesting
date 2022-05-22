package hover;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoverTests extends BaseTests {
    @Test
    public void testHoverUser1(){
        var hoversPage = homePage.clickHovers(); // if you look at the top you would see the
        // extends BaseTests if you go deeper you'll protected HomePage variable since you could use
        // the refrerence
        var caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(),"Caption not displayed");
        assertEquals(caption.getTitle(),"name: user1","Caption title is incorrect");
        assertEquals(caption.getLinkText(),"View profile","Caption link text is incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"),"Link incorrect");
    }

}
