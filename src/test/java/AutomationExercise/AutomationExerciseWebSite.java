package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert.*;

public class AutomationExerciseWebSite {
    private static int number = 14;
    public AutomationExerciseWebSite(){
        number++;
    }
    private WebDriver driver;
    private By loginButton = By.cssSelector("a[href='/login']");
    private By newUserSignupText = By.cssSelector("div.signup-form h2");
    private By name = By.cssSelector("input[data-qa='signup-name']");
    private By emailAddress = By.cssSelector("input[data-qa='signup-email']");
    private By signupButton = By.cssSelector("button[data-qa='signup-button']");
    private By enterAccountInformation = By.cssSelector("div.login-form h2");
    private By radioButtonForGender = By.id("id_gender1");
    private By passwordForInformation = By.xpath("//input[@id='password']");
    private By selectDropdownForDay = By.cssSelector("select[data-qa='days']");
    private By selectDropdownForMonth = By.cssSelector("select[data-qa='months']");
    private By selectDropdownForYear = By.cssSelector("select[data-qa='years']");
    private By signUpforNewsletter = By.id("newsletter");
    private By receiveSpecialOffer = By.id("optin");

    // address information

    private By firstName = By.cssSelector("input[data-qa='first_name']");

    private By lastName = By.cssSelector("input[data-qa='last_name']");

    private By company = By.cssSelector("input[data-qa='company']");

    private By address = By.cssSelector("input[data-qa='address']");

    private By address2 = By.cssSelector("input[data-qa='address2']");

    private By country = By.cssSelector("select#country");

    private By state = By.cssSelector("input[data-qa='state']");

    private By city = By.cssSelector("input[data-qa='city']");

    private By zipcode = By.cssSelector("input[data-qa='zipcode']");
    private By mobileNum = By.cssSelector("input[data-qa='mobile_number']");

    private By createAccountButton = By.cssSelector("button[data-qa='create-account']");

    private By accountCreatedText = By.cssSelector("div[class='container'] h2");

    private By continueButton = By.cssSelector("a[data-qa='continue-button']");

    private By verifyLoggedUsername = By.xpath("//div[@class='container']//ul//li[10]//a//b");

//    private By deleteAccount = By.xpath("//div[@class='container']//ul//li[5]//a");
//      these functions not working so I will just omit them
//    private By deleteButton = By.cssSelector("button[class='btn btn-danger']");
    private By logoutButton = By.xpath("//div[@class='container']//ul//li[4]//a");
    @BeforeClass
    void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://automationexercise.com");
        driver.manage().window().maximize();
    }

    @AfterClass
    void tearDown(){
        driver.quit();
    }
    public void sendKeysPasswordForInfo(String password){
        driver.findElement(passwordForInformation).sendKeys(password);
    }
    @Test
    void testCase1RegisterUser() throws InterruptedException {
        System.out.println(number);
        new AutomationExerciseWebSite(); // For incrementing the static variable
        System.out.println("number again: "+number);
        driver.findElement(loginButton).click();
        Assert.assertEquals(driver.findElement(newUserSignupText).getText(),"New User Signup!","Messages are not the same");

        String username = "bulent emre"+number;
        String email = "bulentmmo"+number+"@hotmail.com";
        System.out.println(username);
        System.out.println(email);
        driver.findElement(name).sendKeys(username);
        driver.findElement(emailAddress).sendKeys(email);
        driver.findElement(signupButton).click();
        //Thread.sleep(3000);
        Assert.assertEquals(driver.findElement(enterAccountInformation).getText(),"ENTER ACCOUNT INFORMATION","Account message is not visible");

        driver.findElement(radioButtonForGender).click();
        //driver.findElement(passwordForInformation).sendKeys("12345"); I will use the method I wrote
        sendKeysPasswordForInfo("12345");

        // for dropdown menu items
        Select dropdownElementsForDays = new Select(driver.findElement(selectDropdownForDay));
        dropdownElementsForDays.selectByIndex(3); // Index starts with 1 but she said these indexes zero based. So first one is day maybe because of that
        Select dropdownElementsForMonth = new Select(driver.findElement(selectDropdownForMonth));
        dropdownElementsForMonth.selectByIndex(8); // yeah it runs with the 0 based indexes
        Select dropdownElementsForYear = new Select(driver.findElement(selectDropdownForYear));
        dropdownElementsForYear.selectByVisibleText("2000");
        driver.findElement(signUpforNewsletter).click();
        driver.findElement(receiveSpecialOffer).click();

        // do it with for loop

        driver.findElement(firstName).sendKeys("bulent emre");
        driver.findElement(lastName).sendKeys("mmo");
        driver.findElement(company).sendKeys("ktu");
        driver.findElement(address).sendKeys("ankara");
        driver.findElement(address2).sendKeys("turkiye");

        Select dropdownElementsForCountry = new Select(driver.findElement(country));
        dropdownElementsForCountry.selectByVisibleText("Canada");

        driver.findElement(state).sendKeys("besirli");
        driver.findElement(city).sendKeys("dog");
        driver.findElement(zipcode).sendKeys("1234");
        driver.findElement(mobileNum).sendKeys("0123456789");

        driver.findElement(createAccountButton).click();

        Assert.assertEquals(driver.findElement(accountCreatedText).getText(),"ACCOUNT CREATED!","Corresponding texts are not matching");

        driver.findElement(continueButton).click();

        Assert.assertEquals(driver.findElement(verifyLoggedUsername).getText(),username);
        //driver.findElement(loginButton).click();
        //driver.findElement(deleteAccount).click(); delete is just not working




    }

}
