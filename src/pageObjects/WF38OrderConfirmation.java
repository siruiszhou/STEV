package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class WF38OrderConfirmation {
	private static WebElement element = null;
	public static WebElement get_element_OrderComplete(WebDriver driver){
		element = driver.findElement(By.xpath(".//h3[@class='order_complete']"));
		Log.info("Order complete ");
		return element;
	}
	public static WebElement get_element_PromotionDiscount(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='WC_SingleShipmentOrderTotalsSummary_td_4_2']"));
		Log.info("Order complete ");
		return element;
	}
	
	public static String get_value_OrderID(WebDriver driver){

		return driver.findElement(By.xpath("//form[@id ='shareOrder']/input[@name='orderId']")).getAttribute("value");
	}
	
	
	
}
