package test;

import org.testng.annotations.Test;

import main.BaseClass;
import main.Logger;


public class S02_Logout extends BaseClass {
	
	@Test (groups = { "Logout" }, description = "Verify that the user is able to successfully log out to the website")
	public void S02_01_SuccessfulLogout() {
		// 
		//
		
		Logger.validateTestCase();
	}
}
