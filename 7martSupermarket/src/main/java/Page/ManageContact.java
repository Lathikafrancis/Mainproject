package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageContact {
	public WebDriver driver;

	public ManageContact(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@role='button']")
	WebElement actionbutton;
	@FindBy(xpath = "//input[@name='phone']")
	WebElement phone;
	@FindBy(xpath = "//input[@name='email']")
	WebElement email;
	@FindBy(xpath = "//input[@name='address']")
	WebElement address;
	@FindBy(xpath = "//input[@name='del_time']")
	WebElement delverytime;
	@FindBy(xpath = "//input[@name='del_limit']")
	WebElement dellimit;
	@FindBy(xpath = "//input[@name='Update']")
	WebElement updates;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement updatemessage;

	public ManageContact actionbutton() {
		actionbutton.click();
		return this;
	}

	public ManageContact phone() {
		phone.clear();
		phone.sendKeys("123456789");
		return this;
	}

	public ManageContact email() {
		email.clear();
		email.sendKeys("lathika@gmail.com");
		return this;
	}

	public ManageContact address() {
		address.clear();
		address.sendKeys("kerala");
		return this;
	}

	public ManageContact delverytime() {
		delverytime.clear();
		delverytime.sendKeys("2pm to 4pm");
		return this;
	}

	public ManageContact dellimit() {
		dellimit.clear();
		dellimit.sendKeys("100");
		return this;
	}

	public ManageContact updates() {
		updates.click();
		return this;
	}

	public boolean iscontactupdateddisplayed() {
		return updatemessage.isDisplayed();
	}
}
