package methods;

import org.openqa.selenium.support.PageFactory;

import main.Constant;
import main.Logger;
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
			mainPage = PageFactory.initElements(Setup.driver, MainPage.class); 
			try {
				mainPage.logoutBtn.click();
				LoginMethods.verifyLoginPageDisplayed();
				Logger.logTestScript("Verify that the user is able to click logout.",
						"User should be able to click logout.", 
						"User was able to click logout.",
						Constant.PASSED);
			} catch (Exception e) {
				Logger.logTestScript("Verify that the user is able to click logout.",
						"User should be able to click logout.", 
						"User was NOT able to click logout. Error message: " + e.getMessage(),
						Constant.FAILED);
			}
	}
}
