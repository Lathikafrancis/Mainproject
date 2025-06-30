package Mainproject;

import org.testng.Assert;
import org.testng.annotations.Test;

import Page.AdminUserSearch;
import Page.HomePage;
import Page.Loginpage;

public class AdminUserSearchTest extends Base

{
	HomePage home;
	AdminUserSearch adminsearch;

	@Test
	public void varifyifUserCanSearchExcistingUsers() {
		Loginpage login = new Loginpage(driver);
		login.enterUsernameandPassword("admin", "admin");
		home = login.signin();
		adminsearch = home.moreinfo();
		adminsearch.search().enterusername("Lathika").selectusertype().searching();
		/*
		 * String title = driver.getTitle(); System.out.println(title);
		 */
		String expectedtitle = "Admin Users | 7rmart supermarket";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(expectedtitle, actualtitle, "not equal");
		/*
		 * AdminUserSearch search = new AdminUserSearch(driver); search.moreinfo();
		 * search.enterusername("lathika"); search.selectusertype(); search.searching();
		 */
	}
}
