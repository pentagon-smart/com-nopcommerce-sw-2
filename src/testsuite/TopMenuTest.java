package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
//        click on the ‘Computers’Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile'] //a[@href='/computers']")).click();

//        Verify the text ‘Computers’
        String expectedText = "Computers";
        String actualText = driver.findElement(By.xpath("//h1[text()='Computers']")).getText();
        Assert.assertEquals("Text is not displayed", expectedText, actualText);


    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {

//    click on the ‘Electronics’Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/electronics']")).click();

//    Verify the text ‘Electronics’
        String expectedText = "Electronics";
        String actualText = driver.findElement(By.xpath("//h1[text()='Electronics']")).getText();
        Assert.assertEquals("Text is not displayed", expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {

//  click on the ‘Apparel’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/apparel']")).click();

//  Verify the text ‘Apparel’
        String expectedText = "Apparel";
        String actualText = driver.findElement(By.xpath("//h1[text()='Apparel']")).getText();
        Assert.assertEquals("Text is not displayed", expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
// click on the ‘Digital downloads’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/digital-downloads']")).click();
// Verify the text ‘Digital downloads’
        String expectedText = "Digital downloads";
        String actualText = driver.findElement(By.xpath("//h1[text()='Digital downloads']")).getText();
        Assert.assertEquals("Text is not displayed", expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
//         click on the ‘Books’Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/books']")).click();
//      Verify the text ‘Digital downloads’
        String expectedText = "Books";
        String actualText = driver.findElement(By.xpath("//h1[text()='Books']")).getText();
        Assert.assertEquals("Text is not displayed", expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
//       click on the ‘Jewelry’Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/jewelry']")).click();
//      Verify the text ‘Jewelry’
        String expectedText = "Jewelry";
        String actualText = driver.findElement(By.xpath("//h1[text()='Jewelry']")).getText();
        Assert.assertEquals("Text is not displayed", expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
//       click on the ‘Gift Cards’Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/gift-cards']")).click();
//      Verify the text ‘Gift Cards’
        String expectedText = "Gift Cards";
        String actualText = driver.findElement(By.xpath("//h1[text()='Gift Cards']")).getText();
        Assert.assertEquals("Text is not displayed", expectedText, actualText);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
