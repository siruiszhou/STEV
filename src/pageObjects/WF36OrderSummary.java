package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class WF36OrderSummary {
	private static WebElement element = null;
	
	public static class button{
		
		public static WebElement get_button_ContinueToPayment(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='continue_to_payment_btn']"));
			Log.info("ContinueToPayment button found on WF36OrderSummary");
			return element;
		}

	}
	public static class field{
		
		public static WebElement get_field_AgreeToTandC(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='term_condition_box']/label/input"));
			Log.info("AgreeToTandC Checkbox found on WF36OrderSummary");
			return element;
		}

	}
}
