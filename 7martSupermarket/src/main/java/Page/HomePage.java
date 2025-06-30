package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class HomePage {
	public WebDriver driver;
	WaitUtility wait = new WaitUtility();

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	WebElement admin;
	@FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
	WebElement logout;
	@FindBy(xpath = "(//a[@class='small-box-footer'])[1]")
	WebElement moreinfo;
	@FindBy(xpath = "(//a[@class='small-box-footer'])[7]")
	WebElement moreinfonews;
	@FindBy(xpath = "(//a[@class='small-box-footer'])[3]")
	WebElement moreinfocontact;
	@FindBy(xpath = "(//a[@class='small-box-footer'])[9]")
	WebElement moreinfomanagecategory;
	@FindBy(xpath = "(//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext'])[2])")
	WebElement managefootermoreinfo;

	public HomePage admin() {
		admin.click();
		return this;
	}

	public ManageFooter managefootermoreinfo() {

		managefootermoreinfo.click();
		return new ManageFooter(driver);
	}

	public Admin addmoreinfo() {
		moreinfo.click();
		return new Admin(driver);
	}

	public Managenews moreinfonews() {
		moreinfonews.click();
		return new Managenews(driver);

	}

	public ManageNewsSearch moreinfonewsSearch() {
		moreinfonews.click();
		return new ManageNewsSearch(driver);

	}

	public AdminUserSearch moreinfo()

	{
		moreinfo.click();
		return new AdminUserSearch(driver);
	}

	public ManageCategorySearch moreinfomanagecategorysearch() {
		moreinfomanagecategory.click();
		return new ManageCategorySearch(driver);
	}

	public ManageContact moreinfocontact() {
		moreinfocontact.click();
		return new ManageContact(driver);
	}

	public Managecategory moreinfomanagecategory() {
		moreinfomanagecategory.click();
		return new Managecategory(driver);
	}

	public HomePage logout() {
		wait.waitForElementToClick(driver, logout);// for adding wait
		logout.click();
		return this;
	}
}