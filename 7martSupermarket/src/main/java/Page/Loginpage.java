package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public WebDriver driver;

	public Loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement username;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement signin;
	@FindBy(xpath = "//p[text()='Dashboard']")
	WebElement dashboard;

	public Loginpage enterUsernameandPassword(String usernamefield, String passwordfield) {
		username.sendKeys(usernamefield);
		password.sendKeys(passwordfield);
		return this;
	}

	public HomePage signin() {
		signin.click();
		return new HomePage(driver);
	}

	public boolean isDashboardisDisplayed() {
		return dashboard.isDisplayed();
	}

}
