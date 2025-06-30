package Mainproject;

import org.testng.Assert;
import org.testng.annotations.Test;

import Page.HomePage;
import Page.Loginpage;
import Page.Managecategory;
import constants.Constants;
import utilities.FileUploadUtility;

public class ManagecategoryTest extends Base {
	HomePage home;
	Managecategory managecategory;
	FileUploadUtility fileupload;

	@Test
	public void managecategory() {
		Loginpage login = new Loginpage(driver);
		login.enterUsernameandPassword("admin", "admin");
		home = login.signin();
		managecategory = home.moreinfomanagecategory();
		managecategory.newtab().samplecategory("demo").discout().scroll().choose(Constants.PATHMAIN).topmenu()
				.leftmenu().save();
		// String title=driver.getTitle();
		// System.out.println(title);
		String expectedtitle = "Footer Text | 7rmart supermarket";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(expectedtitle, actualtitle, "not equal");

		/*
		 * category.newtab(); category.category("sample"); category.discout();
		 * category.scroll();
		 * category.choose("C:\\Users\\LENOVO\\Downloads\\20191117_001348 (1).jpg");
		 * category.topmenu(); category.leftmenu(); category.save();
		 */
	}
}
