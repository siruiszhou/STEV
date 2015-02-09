package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class AccountDetailsUpdatedOverlay {
private static WebElement element = null;
	
	public static class button{
		public static WebElement get_button_Close(WebDriver driver){
			element = driver.findElement(By.xpath(".//div[contains(@class ,'popupModal ') ]//a[@class='close']"));
			Log.info("Close button found on AccountDetailsUpdatedOverlay");
			return element;
		}
		
		public static WebElement get_button_OK(WebDriver driver){
			element = driver.findElement(By.xpath(".//div[contains(@class ,'popupModal ') ]//span[text()='OK']"));
			Log.info("OK button found on add AccountDetailsUpdatedOverlay");
			return element;
		}
		
	}
}
