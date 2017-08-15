package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetupAndTeardown {

    public WebDriver driver = null;

    public void setup() {
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/geckodriver");
        driver = new FirefoxDriver();
    }

    public void teardown() {
        driver.close();
    }

}
