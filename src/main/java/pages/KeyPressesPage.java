package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver;
    private By inputField = By.id("target");
    private By resultField = By.id("result");
    public KeyPressesPage(WebDriver driver){
        this.driver = driver;
    }
    public void enterText(String text){
        driver.findElement(inputField).sendKeys(text);
    }
    public void enterPi(){
        enterText(Keys.chord(Keys.SHIFT,"6") + "=&");
        // it helps you to press multiple keys simultaneously
    }
    public String getResult(){
        return driver.findElement(resultField).getText();
    }

}
