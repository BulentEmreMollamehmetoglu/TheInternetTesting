package login;

import AutomationExercise.base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {
    @Test
    public void testSuccessfullLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickButton();
//        assertEquals(secureAreaPage.getAlertText(),
//                "You logged into a secure area!",
//                "Alert text is incorrect");
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),
                "Alert text is incorrect");
        // expected string and message
        // selenium doesn't have assertions so we're gonna import testng

        //Dropdown menus are not represented by the WebElement class
    }
}
