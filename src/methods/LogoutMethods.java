package methods;

import org.openqa.selenium.support.PageFactory;

import main.Setup;
import pageobjects.LoginPage;
import pageobjects.MainPage;

/**
 * Methods for Log out Scenarios
 * @author jctjavier
 *
 */
public class LogoutMethods {
	
	public static MainPage mainPage = PageFactory.initElements(Setup.driver, MainPage.class); 
	public static LoginPage loginPage = PageFactory.initElements(Setup.driver, LoginPage.class); 
	
	/**
	 * Method to log user out
	 */
	public static void logoutUser() {
		mainPage.logoutBtn.click();
		LoginMethods.verifyLoginPageDisplayed();
	}
}
