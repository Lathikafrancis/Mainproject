package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Managenews 
{
	public WebDriver driver;
	
 public Managenews(WebDriver driver)
 {
	 this.driver= driver;
	 PageFactory.initElements(driver, this);
 }
	
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")WebElement newtab;
	@FindBy(xpath="//textarea[@id='news']")WebElement enternews;
	@FindBy(xpath="//button[@name='create']")WebElement save;
	public Managenews newtab()
	{
		newtab.click();
		return this;
	}
	
	public Managenews enternews()
	{
		enternews.sendKeys("Heavy rainfall in the city");
		return this;
	}
	public Managenews save()
	{
		save.click();
		return this;
	}
	
}
