package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;

public class FileUploadUtility
{
	public void sendkeysForFileUpload(WebElement element, String path)
	{
		element.sendKeys(path);
	}
 public void robotClassforFileUploads(WebElement element, String path) throws AWTException
 {
	 StringSelection selection = new StringSelection(path);
     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
     Robot robo = new Robot();
     robo.keyPress(KeyEvent.VK_CONTROL);
     robo.keyPress(KeyEvent.VK_V);
     robo.keyRelease(KeyEvent.VK_CONTROL);
     robo.keyRelease(KeyEvent.VK_V);
     robo.keyPress(KeyEvent.VK_ENTER);
     robo.keyRelease(KeyEvent.VK_ENTER);
 }
}
