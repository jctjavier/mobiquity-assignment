package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Class that contains elements and their locators for Login Page
 * @author jctjavier
 *
 */
public class LoginPage {	
	
	@FindBy(how = How.XPATH, using="//*[@ng-model='user.name']")
	public WebElement usernameInput;
	
	@FindBy(how = How.XPATH, using="//*[@ng-model='user.password']")
	public WebElement passwordInput;
	
	@FindBy(how = How.CSS, using="#login-form > fieldset > button")
	public WebElement submitBtn;
	
	@FindBy(how = How.XPATH, using="//*[@class='error-message ng-binding']")
	public WebElement errorMsg;
}
