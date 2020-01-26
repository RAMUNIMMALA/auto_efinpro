package HomeTest;

import org.testng.annotations.Test;

import base.EFinProBaseTest;

public class LoginTest extends EFinProBaseTest {
	
	@Test
	public void validateUserLoginWithValidCredentials() {
		loginActions = launchLoginPage();
	}

}
