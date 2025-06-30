package Mainproject;

import org.testng.Assert;
import org.testng.annotations.Test;
import Page.HomePage;
import Page.Loginpage;
import Page.ManageNewsSearch;

public class ManageNewsSearchTest extends Base {

	HomePage home;
	ManageNewsSearch managenewssearch;

	@Test(retryAnalyzer = retry.Retry.class)
	public void manageNewsSearch() {
		Loginpage login = new Loginpage(driver);
		login.enterUsernameandPassword("admin", "admin");
		home = login.signin();
		managenewssearch = home.moreinfonewsSearch().clickonSearch().entertitle().clickonsearchtab();
		/*
		 * String title = driver.getTitle(); System.out.println(title);
		 */
		String expectedtitle = "Add News | 7rmart supermarket";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(expectedtitle, actualtitle, "not equal");

	}
}
