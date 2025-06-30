package Mainproject;

import org.testng.Assert;
import org.testng.annotations.Test;

import Page.HomePage;
import Page.Loginpage;
import Page.ManageCategorySearch;

public class ManageCategorySearchTest extends Base {
	HomePage home;
	ManageCategorySearch managecategory;

	@Test
	public void manageCategorySearchTest() {
		Loginpage login = new Loginpage(driver);
		login.enterUsernameandPassword("admin", "admin");
		home = login.signin();
		managecategory = home.moreinfomanagecategorysearch();
		managecategory.search().searchcategory().searching();
		String title = driver.getTitle();
		System.out.println(title);
		/*
		 * String title1=driver.getTitle(); System.out.println(title1);
		 */

		String expectedtitle = "List Categories | 7rmart supermarket";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(expectedtitle, actualtitle, "not equal");

	}
}
