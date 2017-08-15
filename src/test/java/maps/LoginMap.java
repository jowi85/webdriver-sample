package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMap extends zzMap {

    @FindBy(id = "username")
    private WebElement usernameField;
    @FindBy(id = "password")
    private WebElement passwordField;
    @FindBy(xpath = "//*[@id=\"signin-form\"]/div[2]/button")
    private WebElement signInButton;

    public WebElement getUsernameField() {return usernameField;}
    public WebElement getPasswordField() {return passwordField;}
    public WebElement getSignInButton() {return signInButton;}
}
