package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class RegisterTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
//        click on the ‘Register’ link
        driver.findElement(By.xpath("//a[text()='Register']")).click();

//    Verify the text ‘Register’
        String expectedText = "Register";
        String actualText = driver.findElement(By.xpath("//h1[text()='Register']")).getText();
        Assert.assertEquals("Text is not displayed", expectedText, actualText);
    }

    @Test
    public void userSholdRegisterAccountSuccessfully(){

//        click on the ‘Register’ link
        driver.findElement(By.xpath("//a[text()='Register']")).click();

//        Select gender radio button
        driver.findElement(By.xpath("//input[@id='gender-female']")).click();
//        Enter First name

        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Poonam");
//        Enter Last name
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Ramavat");
//        Select Day Month and Year
        driver .findElement(By.xpath("//select[@name='DateOfBirthDay']")).sendKeys("25");
        driver .findElement(By.xpath("//select[@name='DateOfBirthMonth']")).sendKeys("06");
        driver .findElement(By.xpath("//select[@name='DateOfBirthYear']")).sendKeys("2023");

//        Enter Email address
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Poonam@gmail.com");
//        Enter Password
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Poonam123");
//        Enter Confirm password
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Poonam123");
//        Click on REGISTER button
        driver.findElement(By.xpath("//button[@id='register-button']")).click();
//        Verify the text 'Your registration completed’
        String expectedText = "Your registration completed";
        String actualText = driver.findElement(By.xpath("//div[@class='result']")).getText();
        Assert.assertEquals("Message is not displayed", expectedText, actualText);

    }
    @After
    public void tearDown() {
        closeBrowser();
    }
}
