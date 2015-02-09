package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class SampleAmendQuantityOverlay {
	private static WebElement element = null;
	
	public static class button{
		public static WebElement get_button_ViewBasket(WebDriver driver){
			element = driver.findElement(By.xpath(".//span[text()='View Basket']"));
			Log.info("ViewBasket button found on add basket overlay");
			return element;
		}
		public static WebElement get_button_OrderSample(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='amendQuantityForm']//span[text()='Order Sample']"));
			Log.info("OrderSample button found on add basket overlay");
			return element;
		}
		public static WebElement get_button_Cancel(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='amendQuantityForm']//span[text()='Cancel']"));
			Log.info("OrderSample button found on add basket overlay");
			return element;
		}
	}
	public static class fields{
		public static WebElement get_field_Quantity(WebDriver driver, String quantity){
			element = driver.findElement(By.xpath(".//*[@id='amendQuantityForm']//option[@value='"+quantity+"']"));
			Log.info("option is found on confirm sample quantiry overlay");
			return element;
		}
	}
	public static class values{
		
		public static String get_value_overlayTitle(WebDriver driver){

			return driver.findElement(By.xpath(".//div[@class='modal-header withsub']/h3")).getText();
		}
		

	}
}
