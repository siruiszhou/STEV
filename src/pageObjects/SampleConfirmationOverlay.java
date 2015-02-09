package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class SampleConfirmationOverlay {
	private static WebElement element = null;
	
	public static class button{
		public static WebElement get_button_ViewBasket(WebDriver driver){
			element = driver.findElement(By.xpath(".//span[text()='View Basket']"));
			Log.info("ViewBasket button found on sample Confirmation overlay");
			return element;
		}
		public static WebElement get_button_ContinueShipping(WebDriver driver){
			element = driver.findElement(By.xpath(".//span[contains(text(),'Continue')]"));
			Log.info("ContinueShipping button foundon sample Confirmation overlay");
			return element;
		}
	}
	public static class values{
		
		public static String get_value_overlayTitle(WebDriver driver){

			return driver.findElement(By.xpath(".//div[@class='modal-header withsub']/h3")).getText();
		}
		
		
		public static List<String> get_value_SKUName(WebDriver driver){
			List<String> SKUNames = new ArrayList<>();
			List<WebElement> titleElements= driver.findElements(By.xpath(".//div[contains(@class, 'productsConfirm')]//div[@class='productTitle']/p"));
			for(int i =0; i<titleElements.size();i++){
				SKUNames.add(titleElements.get(i).getText());
			}
			return SKUNames;
		}
	}
}
