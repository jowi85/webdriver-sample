package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SecondTest {

    /**
     Here we'll declare some variables to replace strings we previously typed out within the @Test section.  This is
     just to illustrate how to declare and use variables.
     */

    protected WebDriver driver = null;

    @Before
    public void setupTest() {
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/geckodriver");
        driver = new FirefoxDriver();
    }

    @Test
    public void imgurLogin() {

        String url = "https://imgur.com/signin";
        String username = "TestAccountJoey";
        String password = "P@$$w0rd";
        String signInButton = "//*[@id=\"signin-form\"]/div[2]/button";

        driver.get(url);

        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath(signInButton)).click();
    }

    @After
    public void teardownTest() {
        driver.close();
    }
}
