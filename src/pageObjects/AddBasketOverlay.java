package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class AddBasketOverlay {
	private static WebElement element = null;
	
	public static class button{
		public static WebElement get_button_ViewBasket(WebDriver driver){
			element = driver.findElement(By.xpath(".//span[text()='View Basket']"));
			Log.info("ViewBasket button found on add basket overlay");
			return element;
		}
		public static WebElement get_button_ContinueShipping(WebDriver driver){
			element = driver.findElement(By.xpath(".//span[contains(text(),'Continue')]"));
			Log.info("ContinueShipping button found on add basket overlay");
			return element;
		}
		public static WebElement get_button_ReturnToMyAccount(WebDriver driver){
			element = driver.findElement(By.xpath(".//span[text()='Return to My Account']"));
			Log.info("ReturnToMyAccount button found on add basket overlay");
			return element;
		}
		
	}
	
	public static class values{
		public static List<WebElement> get_values_SKUName(WebDriver driver){
			return driver.findElements(By.xpath(".//div[@class='popupModal productsConfirm']//div[@class='productTitle']/p"));
		}
		
		public static WebElement get_value_SKUName(WebDriver driver, int index){
			return AddBasketOverlay.values.get_values_SKUName(driver).get(index);
		}		
		
	}
	
}
