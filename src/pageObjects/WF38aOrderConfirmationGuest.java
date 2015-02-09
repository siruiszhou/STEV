package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class WF38aOrderConfirmationGuest {
	private static WebElement element = null;
	public static WebElement get_element_OrderComplete(WebDriver driver){
		element = driver.findElement(By.xpath(".//h3[@class='order_complete']"));
		Log.info("Order complete ");
		return element;
	}
}
