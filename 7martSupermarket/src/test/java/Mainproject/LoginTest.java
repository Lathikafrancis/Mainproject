package Mainproject;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Page.HomePage;
import Page.Loginpage;
import constants.Constants;

public class LoginTest extends Base {
	HomePage home;

	@Test(groups = {"smoke"}, dataProvider = "credentials")
	public void login(String username, String password) {
		Loginpage log = new Loginpage(driver);
		log.enterUsernameandPassword("username", "password");
		log.signin();

	}

	@Test(groups = {"smoke"})
	@Parameters({"username","password"})
	public void correctusernameAndincorrectpassword(String username, String password) {
		Loginpage log = new Loginpage(driver);
		log.enterUsernameandPassword(username, password);
		home = log.signin();
		boolean isHomepageisDisplayed = log.isDashboardisDisplayed();
		Assert.assertTrue(isHomepageisDisplayed, Constants.ERRORMESSAGE);
	}

	@Test
	public void incorrectusernameAndcorrectpassword() {
		Loginpage log = new Loginpage(driver);
		log.enterUsernameandPassword("username", "admin");
		home = log.signin();
	}

	@Test
	public void incorrectusernameandpassword() {
		Loginpage log = new Loginpage(driver);
		log.enterUsernameandPassword("username", "password");
		home = log.signin();
	}

	@DataProvider(name = "credentials")
	public Object[][] testData() {
		Object data[][] = { { "admin", "admin" }, { "admin", "1q2w3e4r" }, { "carol", "admin" },
				{ "carol", "123456" } };
		return data;
	}
}
