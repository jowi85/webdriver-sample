package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import maps.LoginMap;
import maps.zzMapBuilder;

public class FirstTestWithMap {

    /**
     Now we'll take the same code from FirstTestWithVariables.java and add the idea of a map to replace the 'driver.findElement's
     from the previous step.
     */

    protected WebDriver driver = null;

    @Before
    public void setupTest() {
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/geckodriver");
        driver = new FirefoxDriver();
    }

    @Test
    public void imgurLogin() {

        LoginMap loginMap;
        String url = "https://imgur.com/signin";
        String username = "TestAccountJoey";
        String password = "P@$$w0rd";

        driver.get(url);

        loginMap = zzMapBuilder.getInstance(driver, LoginMap.class);
        loginMap.getUsernameField().sendKeys(username);
        loginMap.getPasswordField().sendKeys(password);
        loginMap.getSignInButton().click();
    }

    @After
    public void teardownTest() {
        driver.close();
    }

}
