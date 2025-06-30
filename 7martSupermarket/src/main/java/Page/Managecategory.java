package Page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;
import utilities.FileUploadUtility;

public class Managecategory {
	WebDriver driver;
	FileUploadUtility file = new FileUploadUtility();

	public Managecategory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	WebElement newtab;
	@FindBy(xpath = "//input[@placeholder='Enter the Category']")
	WebElement samplecategory;
	@FindBy(xpath = "(//ul[@tabindex='-1'])[1]")
	WebElement discount;
	@FindBy(xpath = "//input[@name='main_img']")
	WebElement choosefile;
	@FindBy(xpath = "(//label[@for='status'])[1]")
	WebElement topmenu;
	@FindBy(xpath = "(//label[@for='status'])[2]")
	WebElement leftmenu;
	@FindBy(xpath = "//button[@name='create']")
	WebElement save;

	public Managecategory newtab() {
		newtab.click();
		return this;
	}

	public Managecategory samplecategory(String categoryname) {
		samplecategory.sendKeys(categoryname);
		return this;
	}

	public Managecategory discout() {
		discount.click();
		return this;
	}

	public Managecategory scroll() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;// driver initialisation for interface
		executor.executeScript("window.scrollBy(0,2000)", "");
		return this;
	}

	public Managecategory choose(String filename) {
		file.sendkeysForFileUpload(choosefile, Constants.PATHMAIN);
		return this;
		// choosefile.sendKeys("C:\\Users\\LENOVO\\Downloads\\20191117_001348.jpg");
	}

	public Managecategory topmenu() {

		topmenu.click();
		return this;

	}

	public Managecategory leftmenu() {

		leftmenu.click();
		return this;
	}

	public Managecategory save() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", save);
		return this;
	}

}
