package test;

import org.testng.annotations.Test;

import data.S01_Login_Data;
import main.BaseClass;
import main.Logger;
import main.Utils;
import methods.LoginMethods;
import utils.ProjectConstant;


public class S01_Login extends BaseClass {
	
	
	@Test (groups = { "Login" }, description = "Verify that the user is able to successfully log in to the website")
	public void S01_01_SuccessfulLogin() {
		LoginMethods.initializeLoginPage();
		LoginMethods.openLoginPage(ProjectConstant.SITE_URL);
		LoginMethods.logUserIn(S01_Login_Data.valid_username, S01_Login_Data.valid_password);
		LoginMethods.verifyUserLoggedIn(S01_Login_Data.valid_username);
		
		Logger.validateTestCase();
	}
	
	@Test (groups = { "Login" }, description = "Verify that the user is unable to log in to the website with invalid username")
	public void S01_02_InvalidUsername() {
		Utils.explicitWait(10);
		LoginMethods.initializeLoginPage();
		LoginMethods.openLoginPage(ProjectConstant.SITE_URL);
		LoginMethods.logUserIn(S01_Login_Data.invalid_username, S01_Login_Data.valid_password);
		LoginMethods.verifyErrorMessageDisplayed(S01_Login_Data.ERROR_MSG);
		
		Logger.validateTestCase();
	}
	
	@Test (groups = { "Login" }, description = "Verify that the user is unable to log in to the website with invalid password")
	public void S01_03_InvalidPassword() {
		Utils.explicitWait(10);
		LoginMethods.initializeLoginPage();
		LoginMethods.openLoginPage(ProjectConstant.SITE_URL);
		LoginMethods.logUserIn(S01_Login_Data.valid_username, S01_Login_Data.invalid_password);
		LoginMethods.verifyErrorMessageDisplayed(S01_Login_Data.ERROR_MSG);
		
		Logger.validateTestCase();
	}
}
