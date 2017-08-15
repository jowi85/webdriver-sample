package helpers;

import maps.LoginMap;
import maps.zzMapBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    public void imgurLogin(WebDriver driver, String url, String username, String password) {
        driver.get(url);

        LoginMap loginMap = zzMapBuilder.getInstance(driver, LoginMap.class);

        loginMap.getUsernameField().sendKeys(username);
        loginMap.getPasswordField().sendKeys(password);
        loginMap.getSignInButton().click();

        driver.findElement(By.xpath("//*[@id=\"signin-form\"]/div[2]/button")).click();
    }

}
