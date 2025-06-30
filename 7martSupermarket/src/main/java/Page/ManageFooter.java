package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooter {
	public WebDriver driver;

	public ManageFooter(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@role='button'])[1]")
	WebElement actionbutton;
	@FindBy(xpath = "//textarea[@name='address']")
	WebElement address;
	@FindBy(xpath = "//input[@name='email']")
	WebElement email;
	@FindBy(xpath = "//input[@id='phone']")
	WebElement phone;
	@FindBy(xpath = "//button[@name='Update']")
	WebElement update;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement footeralertmessage;

	public ManageFooter address() {
		address.clear();
		address.sendKeys("Kerala");
		return this;
	}

	public ManageFooter email() {
		email.clear();
		email.sendKeys("abc@gmail.com");
		return this;
	}

	public ManageFooter phone() {
		phone.clear();
		phone.sendKeys("112233");
		return this;

	}

	public ManageFooter update() {
		update.click();
		return this;
	}

	public boolean isfooteralertmessagedisplayed() {
		return footeralertmessage.isDisplayed();
	}
}
