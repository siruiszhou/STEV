package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class AccountCreatedOverlay {
private static WebElement element = null;
	
	public static class button{
		public static WebElement get_button_ContinueShopping(WebDriver driver){
			element = driver.findElement(By.xpath("//body/div[contains(@id,'modal')]/form/div[3]/a/span"));
			Log.info("ContinueShopping button found on AccountCreatedOverlay");
			return element;
		}
		

		
	}
}
