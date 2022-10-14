package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    private WebDriver driver;
    //There is no method to hover of any element on the page but there is an action which is class.
    private By figureBox = By.className("figure");
    private By boxCaption = By.className("figcaption");
    public HoversPage(WebDriver driver){
        this.driver = driver;
    }
    //Web element doesnt have a method to do a hover
    //action class
    public FigureCaption hoverOverFigure(int index){ // if they passed in 1 so the list indexes should start with 0 then we're gonna start the indexes with 0
        WebElement figure = driver.findElements(figureBox).get(index-1);
        System.out.println(figure);
        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform(); // this is the method that we are using as well so there are other methods to be used in different type of scenarios
        // line 22 --> it performs the moveToElement method
        return new FigureCaption(figure.findElement(boxCaption)); // it returns child element
    }
    public class FigureCaption{
        private WebElement caption;
        private By header = By.tagName("h5");
        private By link = By.tagName("a");
        public FigureCaption(WebElement caption){
            this.caption = caption;
        }
        public boolean isCaptionDisplayed(){
            return caption.isDisplayed();
        }

        public String getTitle(){
            return caption.findElement(header).getText();
        }
        public String getLink(){
            return caption.findElement(link).getAttribute("href"); // it returns the whole link
            // begins with www.blabla
        }
        public String getLinkText(){
            return caption.findElement(link).getText();
        }
    }
}
