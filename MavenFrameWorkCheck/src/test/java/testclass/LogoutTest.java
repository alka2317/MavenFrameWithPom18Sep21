package testclass;

import org.testng.annotations.Test;

public class LogoutTest extends BaseTest{

	@Test(priority=2)
	public void verifyLogout() throws InterruptedException {
		logout.logout();	
	}
}
