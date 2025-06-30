package Mainproject;

import org.testng.Assert;
import org.testng.annotations.Test;

import Page.HomePage;
import Page.Loginpage;
import Page.Managenews;

public class ManagenewsTest extends Base {
	HomePage home;
	Managenews managenews;

	@Test
	public void addnews() {
		Loginpage login = new Loginpage(driver);
		login.enterUsernameandPassword("admin", "admin");
		home = login.signin();
		managenews = home.moreinfonews();
		managenews.newtab().enternews().save();
		/*
		 * String title = driver.getTitle(); System.out.println(title);
		 */
		String expectedtitle = "Add News | 7rmart supermarket";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(expectedtitle, actualtitle, "not equal");
	}
}