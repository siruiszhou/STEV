package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class SaveBasketOverlay {
private static WebElement element = null;
	
	public static class button{
		public static WebElement get_button_Close(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='sBasketForm']//button[@class='close']"));
			Log.info("Close button found on SaveBasketOverlay");
			return element;
		}
		
		public static WebElement get_button_Save(WebDriver driver){
			element = driver.findElement(By.xpath(".//body/div[contains(@id,'modal')]//button[contains(@class, 'yes')]"));
			Log.info("Save button found on add SaveBasketOverlay");
			return element;
		}
		
		
		public static WebElement get_button_Cancel(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='sBasketForm']//span[text()='Cancel']"));
			Log.info("Save button found on add SaveBasketOverlay");
			return element;
		}
		
	}
	
	public static class field{	
		public static WebElement get_field_Reference(WebDriver driver){
			element = driver.findElement(By.xpath(".//input[@id='basketreference']"));
			Log.info("Reference field found on add SaveBasketOverlay");
			return element;
		}
	}
}
