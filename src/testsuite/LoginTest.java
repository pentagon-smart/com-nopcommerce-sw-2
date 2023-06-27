package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {

//        click on the ‘Login’ link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

//        Verify the text Welcome, Please Sign In!

        String expectedText = "Welcome, Please Sign In!";
        String actualText = driver.findElement(By.xpath("//div[@class='page-title']")).getText();
        Assert.assertEquals("Welcome text is not displayed in login page", expectedText, actualText);

    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
// click on the ‘Login’ link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

// Enter valid username
        driver.findElement(By.id("Email")).sendKeys("pentagonsmart26@gmail.com");

// Enter valid password
        driver.findElement(By.id("Password")).sendKeys("Poonam1234");

// Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[text() = 'Log in']")).click();

// Verify the ‘Log out’ text is display
        String expectedLogoutText ="Log out";
        String actualLogoutText = driver.findElement(By.linkText("Log out")).getText();
        Assert.assertEquals("Log out text is not displayed in page",expectedLogoutText,actualLogoutText);
    }

    @Test
    public void verifyTheErrorMessage() {

//        click on the ‘Login’ link
        driver.findElement(By.linkText("Log in")).click();

//        Enter invalid username
        driver.findElement(By.id("Email")).sendKeys("Prime123@gmail.com");

//        Enter invalid password
        driver.findElement(By.id("Password")).sendKeys("Prime123");

//        Click on Login button
        driver.findElement(By.xpath("//button[text() = 'Log in']")).click();

//        Verify the error message ‘Login was unsuccessful.Please correct the errors and try again. No customer account found’
        String expectedMessage ="Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        Assert.assertEquals("Error message not displayed",expectedMessage,actualMessage);


//        .............

        String expectedMessage1 = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualMessage1 = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        Assert.assertEquals("Error Message is not displayed",expectedMessage1,actualMessage1);


    }

    @After
    public void tearDown() {
         closeBrowser();
    }
}
