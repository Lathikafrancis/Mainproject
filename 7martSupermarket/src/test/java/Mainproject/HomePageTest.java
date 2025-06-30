package Mainproject;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Page.Loginpage;
import utilities.Excelutility;
import Page.HomePage;

public class HomePageTest extends Base {
	HomePage home;

	@Test
	public void logout() throws IOException {
		Loginpage login = new Loginpage(driver);
		String username = Excelutility.readStringData(1, 0, "HomePageTest");
		String password = Excelutility.readStringData(1, 1, "HomePageTest");
		login.enterUsernameandPassword(username, password);
		home = login.signin();
		home.admin().logout();
		String expected = "Login | 7rmart supermarket";
		String actual = driver.getTitle();
		Assert.assertEquals(expected, actual, "not equal");
		/*
		 * HomePage logout = new HomePage(driver); logout.admin(); logout.logout();
		 */
	}
}
