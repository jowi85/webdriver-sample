package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {

    private WebDriver driver = null;

    @Before
    public void setupTest() {
        /*
         First we need to open an instance of the web browser.
         */
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/geckodriver");
        driver = new FirefoxDriver();
    }

    @Test
    public void imgurLogin() {
        /*
         Now that the browser is open, we need to tell it what web page to go to.  Using .get allows us
         to input a URL.
         */
        driver.get("https://imgur.com/signin");
        /*
         When you first arrive to the login screen, you need to input your username and password.
         Use the source's id tags to get WebDriver to find the username and password fields.
         Use sendKeys to type characters into these fields once they've been located.
         */
        driver.findElement(By.id("username")).sendKeys("TestAccountJoey");
        driver.findElement(By.id("password")).sendKeys("P@$$w0rd");
        /*
         Then we need to click the "sign in" button on the login page after the credentials have been entered.
         Use a similar strategy to how we found the "Ok" button on the web page warning.
         */
        driver.findElement(By.xpath("//*[@id=\"signin-form\"]/div[2]/button")).click();
    }

    @After
    public void teardownTest() {
        /*
        Close the browser window to end the test.
         */
        driver.close();
    }
}
