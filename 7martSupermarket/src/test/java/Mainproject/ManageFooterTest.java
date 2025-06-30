package Mainproject;

import org.testng.Assert;
import org.testng.annotations.Test;

import Page.HomePage;
import Page.Loginpage;
import Page.ManageFooter;

public class ManageFooterTest extends Base {
	HomePage home;
	ManageFooter manage;

	@Test
	public void updateManageFooter() {
		Loginpage login = new Loginpage(driver);
		login.enterUsernameandPassword("admin", "admin");
		home = login.signin();
		manage = home.managefootermoreinfo();
		manage.address().email().phone().update();
		boolean isAlertMessageDisplayed = manage.isfooteralertmessagedisplayed();
		Assert.assertTrue(isAlertMessageDisplayed, "Alert message is Displayed");
	}
}
