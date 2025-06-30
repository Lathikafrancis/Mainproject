package Page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageCategorySearch {
	public WebDriver driver;

	public ManageCategorySearch(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	WebElement search;
	@FindBy(xpath = "//input[@class='form-control']")
	WebElement searchcategory;
	@FindBy(xpath = "//button[@name='Search']")
	WebElement searching;

	public ManageCategorySearch search() {
		search.click();
		return this;
	}

	public ManageCategorySearch searchcategory() {
		searchcategory.sendKeys("supermarket");
		return this;
	}

	public ManageCategorySearch searching() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", searching);
		return this;
	}
}
