package base;

import actions.LoginActions;

public class EFinProBaseTest extends BaseTest {
	
	protected LoginActions loginActions = null;	
	
	protected LoginActions launchLoginPage() {
		return new LoginActions(getDriver());
	}

}
