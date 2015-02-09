package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class SaveBasketConfirmationOverlay {
private static WebElement element = null;
	
	public static class button{
		public static WebElement get_button_Close(WebDriver driver){
			element = driver.findElement(By.xpath("//h3[text()='Saved Basket']/preceding-sibling::a"));
			Log.info("Close button found on SaveBasketConfirmationOverlay");
			return element;
		}
		
		public static WebElement get_button_OK(WebDriver driver){
			element = driver.findElement(By.xpath(".//span[text()='OK']"));
			Log.info("OK button found on add SaveBasketConfirmationOverlay");
			return element;
		}		
		
	}
	

}
