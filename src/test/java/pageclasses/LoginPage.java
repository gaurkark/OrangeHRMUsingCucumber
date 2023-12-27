package pageclasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(name="username")
    public WebElement username;
    @FindBy(name="password")
    public WebElement password;
    @FindBy(xpath="//*[@type='submit']")
    public WebElement loginButton;
    @FindBy(xpath="//*[@class='oxd-userdropdown-tab']")
    public WebElement profile;
    @FindBy(tagName="a")
    public List<WebElement> links;
    @FindBy(xpath="//*[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
    public WebElement forgotPassword;
    @FindBy(xpath="(//*[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message'])[1]")
    public WebElement requiredMessage;
    @FindBy(xpath="//*[@class='oxd-text oxd-text--p oxd-alert-content-text']")
    public WebElement invalidCredential;
    @FindBy(xpath="//*[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")
    public WebElement message;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);}
	
    
}
