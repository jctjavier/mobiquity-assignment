package test;

import org.testng.annotations.Test;

import data.S01_Login_Data;
import main.BaseClass;
import main.Logger;
import methods.LoginMethods;
import methods.LogoutMethods;
import utils.ProjectConstant;

/**
 * Test Cases for Log Out Scenarios
 * 
 * @author jctjavier
 *
 */
public class S02_Logout extends BaseClass {

	@Test(groups = { "Logout" }, description = "Verify that the user is able to successfully log out to the website")
	public void S02_01_SuccessfulLogout() {
		LoginMethods.initializeLoginPage();
		LoginMethods.initializeMainPage();
		LoginMethods.openLoginPage(ProjectConstant.SITE_URL);
		LoginMethods.logUserIn(S01_Login_Data.valid_username, S01_Login_Data.valid_password);
		LoginMethods.verifyUserLoggedIn(S01_Login_Data.valid_username);
		LogoutMethods.logoutUser();

		Logger.validateTestCase();
	}
}
