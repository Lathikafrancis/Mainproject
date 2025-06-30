package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsSearch {
	public WebDriver driver;

	public ManageNewsSearch(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	WebElement searchtab;
	@FindBy(xpath = "//input[@placeholder='Title']")
	WebElement entertitle;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement searchresult;

	public ManageNewsSearch clickonsearchtab() {
		searchtab.click();
		return this;
	}

	public ManageNewsSearch entertitle() {
		entertitle.sendKeys("heavy rain");
		return this;
	}

	public ManageNewsSearch clickonSearch() {
		searchresult.click();
		return this;
	}
}