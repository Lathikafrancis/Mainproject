package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtility 
{
	public void selectByIndex(WebElement element,int index)
	{
	 Select select = new Select(element);
	  select.selectByIndex(index);
}
	
}