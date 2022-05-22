package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AlertsPage;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {
    @Test
    public void testAcceptAlert(){
        AlertsPage alertspage = homePage.clickJavaScriptAlerts();
        //var alertspage1 = homePage.clickJavaScriptAlerts();
        alertspage.triggerAlert();
        alertspage.alert_clickToAccept();
        assertEquals(alertspage.getResult(),"You successfully clicked an alert","Results text is incorrect");
    }
    @Test
    public void testGetTextFromAlert(){
        var alertspage = homePage.clickJavaScriptAlerts();
        alertspage.triggerConfirm();
        String text = alertspage.alert_getText();
        alertspage.alert_clickToDismiss();
        assertEquals(text,"I am a JS Confirm","Alert text is incorrect");
    }
    @Test
    public void testSetInputInAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();
        String text = "TAU rocks!";
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(),"You entered: "+text,"Result text is incorrect");

    }
}
