package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class WF34ShippingMethod {
	private static WebElement element = null;
	
	public static class button{
		
		public static WebElement get_button_ContinueToOrderReference(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='continue_to_order_references_btn']"));
			Log.info("ContinueToOrderReference button found on WF34ShippingMethod");
			return element;
		}

	}
}
