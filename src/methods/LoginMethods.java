package methods;

import org.openqa.selenium.support.PageFactory;

import main.Constant;
import main.Logger;
import main.Setup;
import main.Utils;
import pageobjects.LoginPage;
import pageobjects.MainPage;

/**
 * Methods for Login Scenarios
 * 
 * @author jctjavier
 *
 */
public class LoginMethods {

	public static LoginPage loginPage = PageFactory.initElements(Setup.driver, LoginPage.class);
	public static MainPage mainPage = PageFactory.initElements(Setup.driver, MainPage.class);

	/**
	 * Method to initialize Login Page Elements
	 */
	public static void initializeLoginPage() {
		loginPage = PageFactory.initElements(Setup.driver, LoginPage.class);
	}
	
	/**
	 * Method to initialize Login Page Elements
	 */
	public static void initializeMainPage() {
		mainPage = PageFactory.initElements(Setup.driver, MainPage.class);
	}
	
	/**
	 * Method to open login page
	 * 
	 * @param url
	 */
	public static void openLoginPage(String url) {
		Setup.driver.get(url);
		Utils.explicitWait(5);
		verifyLoginPageDisplayed();
	}

	/**
	 * Method to verify that the Login Page is displayed
	 */
	public static void verifyLoginPageDisplayed() {
		initializeLoginPage();
		String text = "";

		if (loginPage.usernameInput.isEnabled() && loginPage.usernameInput.isDisplayed()) {
			Logger.logTestScript("Verify that the username input field is displayed.",
					"Username input should be successfully displayed.", "Username input was successfully displayed.",
					Constant.PASSED);
		} else {
			Logger.logTestScript("Verify that the username input field is displayed.",
					"Username input should be successfully displayed.", "Username input was NOT displayed.",
					Constant.FAILED);
			text = text + "Username Input field,";
		}

		if (loginPage.passwordInput.isEnabled() && loginPage.usernameInput.isDisplayed()) {
			Logger.logTestScript("Verify that the password input field is displayed.",
					"Password input should be successfully displayed.", "Password input was successfully displayed.",
					Constant.PASSED);
		} else {
			Logger.logTestScript("Verify that the password input field is displayed.",
					"Password input should be successfully displayed.", "Password input was NOT displayed.",
					Constant.FAILED);
			text = text + " Password Input field,";
		}

		if (loginPage.submitBtn.isEnabled() && loginPage.usernameInput.isDisplayed()) {
			Logger.logTestScript("Verify that the submit button is displayed.",
					"Submit button should be successfully displayed.", "Password input was successfully displayed.",
					Constant.PASSED);
		} else {
			Logger.logTestScript("Verify that the password input field is displayed.",
					"Password input should be successfully displayed.", "Password input was NOT displayed.",
					Constant.FAILED);
			text = text + " Submit button.";
		}

		if (text.equals("")) {
			Logger.logTestScript("Verify that the login page is displayed.",
					"Login page should be successfully displayed.", "Login page was successfully displayed.",
					Constant.PASSED);
		} else {
			Logger.logTestScript("Verify that the login page is displayed.",
					"Login page should be successfully displayed.",
					"Login page was not properly displayed. The following elements were missing: " + text.trim(),
					Constant.FAILED);
		}
	}

	/**
	 * Method to log user in
	 * 
	 * @param username
	 * @param password
	 */
	public static void logUserIn(String username, String password) {
		loginPage.usernameInput.click();
		loginPage.usernameInput.sendKeys(username);
		loginPage.passwordInput.click();
		loginPage.passwordInput.sendKeys(password);
		loginPage.submitBtn.click();
		Logger.logTestScript("Verify that the user is able to submit credentials.",
				"User should be able to submit credentials.", 
				"User " + username + " was able to submit credentials.",
				Constant.INFO);
	}

	/**
	 * Method to verify that the user is logged in
	 * 
	 * @param username
	 */
	public static void verifyUserLoggedIn(String username) {
		if (mainPage.greetingsTxt.getText().trim().equals("Hello " + username)) {
			Logger.logTestScript("Verify that the user is successfully logged in.",
					"User should be successfully logged in.", "User " + username + " was successfully logged in.",
					Constant.PASSED);
		} else {
			Logger.logTestScript("Verify that the user is successfully logged in.",
					"User should be successfully logged in.",
					"User was NOT logged in. Greetings Text displays: " + mainPage.greetingsTxt.getText(),
					Constant.FAILED);
		}
	}
	
	/**
	 * Method to verify that the error message is displayed when incorrect credentials are submitted
	 */
	public static void verifyErrorMessageDisplayed(String errorMsgTxt) {
		if (loginPage.errorMsg.getText().trim().equals(errorMsgTxt)) {
			Logger.logTestScript("Verify that the error message is displayed when attempting to log in with incorrect credentials.",
					"Error message should be displayed.", 
					"Error message was successfully displayed: " + loginPage.errorMsg.getText(),
					Constant.PASSED);
		} else {
			Logger.logTestScript("Verify that the error message is displayed when attempting to log in with incorrect credentials.",
					"Error message should be displayed.", 
					"Error message was NOT displayed.",
					Constant.FAILED);
		}
	}

}
