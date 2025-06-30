package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

public class Admin {
	public WebDriver driver;
	PageUtility page = new PageUtility();

	public Admin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	WebElement newtab;
	@FindBy(xpath = "//input[@id='username']")
	WebElement username;
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	@FindBy(xpath = "//select[@id='user_type']")
	WebElement selecttab;
	@FindBy(xpath = "//button[@name='Create']")
	WebElement save;

	public Admin newicon() {
		newtab.click();
		return this;
	}

	public Admin enterusernameAndpassword(String userfield, String passfield) {
		username.sendKeys(userfield);
		password.sendKeys(passfield);
		return this;
	}

	public Admin selectdrop() {
		Select select = new Select(selecttab);
		select.selectByIndex(1);
		return this;
	}

	public Admin save() {
		save.click();
		return this;
	}
}
