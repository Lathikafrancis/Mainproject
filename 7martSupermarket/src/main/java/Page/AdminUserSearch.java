package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUserSearch {
	public WebDriver driver;

	public AdminUserSearch(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	WebElement search;
	@FindBy(xpath = "//input[@id='un']")
	WebElement username;
	@FindBy(xpath = "//select[@id='ut']")
	WebElement selectusertype;
	@FindBy(xpath = "//button[@name='Search']")
	WebElement searching;

	public AdminUserSearch search() {
		search.click();
		return this;
	}

	public AdminUserSearch enterusername(String usernamefield) {
		username.sendKeys("Lathika");
		return this;
	}

	public AdminUserSearch selectusertype() {
		Select select = new Select(selectusertype);
		select.selectByIndex(1);
		return this;
	}

	public AdminUserSearch searching() {
		searching.click();
		return this;
	}
}