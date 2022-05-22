package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By inputField = By.xpath("//input[@type=\'range\']");
    private By spanRange = By.id("range");
    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }
    public void enterKeys(String value){
        while(!getRangeText().equals(value)){
            driver.findElement(inputField).sendKeys(Keys.ARROW_RIGHT);
        }

    }
    public String getRangeText(){
        return driver.findElement(spanRange).getText();
    }
}
