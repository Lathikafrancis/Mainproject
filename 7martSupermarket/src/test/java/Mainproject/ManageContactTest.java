package Mainproject;

import org.testng.Assert;
import org.testng.annotations.Test;

import Page.HomePage;
import Page.Loginpage;
import Page.ManageContact;

public class ManageContactTest extends Base {
	HomePage home;
	ManageContact managecontact;

	@Test
	public void manageContact() {
		Loginpage login = new Loginpage(driver);
		login.enterUsernameandPassword("admin", "admin");
		login.signin();
		managecontact = home.moreinfocontact();
		managecontact.actionbutton().phone().address().delverytime().dellimit().updates();
		boolean isAlertMessageDisplayed = managecontact.iscontactupdateddisplayed();
		Assert.assertTrue(isAlertMessageDisplayed, "Alert message is Displayed");
	}
}
