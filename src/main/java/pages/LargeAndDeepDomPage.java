package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeAndDeepDomPage {
    private WebDriver driver;
    private By table = By.id("large-table");
    private By textBlocks = By.className("jscroll-added");
    public LargeAndDeepDomPage(WebDriver driver){
        this.driver = driver;
    }
    public void scrolltoTable(){
        WebElement tableElement = driver.findElement(table);
        String script = "argument[0].scrollIntoView();";
        ((JavascriptExecutor) driver).executeScript(script,tableElement);
        //niye calismiyor burası
    }
    public void scrollToParagraph(int index){
        String script = "window.scrollTo(0,document.body.scrollHeight)";
        var jsExecutor = (JavascriptExecutor)driver;
        while(getNumberOfParagraphsPresent() < index){
            jsExecutor.executeScript(script);
        }
    }
    private int getNumberOfParagraphsPresent(){
        return driver.findElements(textBlocks).size();
    }
}
