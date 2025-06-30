package Mainproject;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Page.Admin;
import Page.HomePage;
import Page.Loginpage;
import utilities.FakerUtility;

public class AdminTest extends Base {
	HomePage home;
	Admin admin;
	FakerUtility faker = new FakerUtility();

	@Test
	public void varifyifadmincanadduser() throws IOException {
		Loginpage login = new Loginpage(driver);
		// String username=Excelutility.readStringData(1, 0, "HomePageTest");
		// String password =Excelutility.readStringData(1, 1, "HomePageTest");
		login.enterUsernameandPassword("admin", "admin");
		home = login.signin();
		admin = home.addmoreinfo();
		String usernameadmin = faker.getFakeFirstName();
		String passwordadmin = faker.getPassword();
		admin.newicon().enterusernameAndpassword(usernameadmin, passwordadmin).selectdrop().save();
		/*
		 * String title = driver.getTitle(); System.out.println(title);
		 */
		String expectedtitle = "Admin Users | 7rmart supermarket";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(expectedtitle, actualtitle, "not equal");
		/*
		 * Admin admin = new Admin(driver); admin.addmoreinfo(); admin.newicon();
		 * admin.enterusernameAndpassword("Lathika", "112233"); admin.selectdrop();
		 * admin.save();
		 */
	}
}
