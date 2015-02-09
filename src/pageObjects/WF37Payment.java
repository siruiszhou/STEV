package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class WF37Payment {
	private static WebElement element = null;
	
	public static class button{
		
		public static WebElement get_button_PlaceOrder(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='payment_place_order_btn']"));
			Log.info("ContinueToPayment button found on WF36OrderSummary");
			return element;
		}
		
		

	}
	public static class field{
		
		public static WebElement get_field_Proforma(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='checkoutPaymentForm']//input[@value='ProformaInvoice']"));
			Log.info("ProformaInvoice option found");
			return element;
		}
		public static WebElement get_field_Card(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='checkoutPaymentForm']//input[@value='Card']"));
			Log.info("ProformaInvoice option found");
			return element;
		}
		public static WebElement get_field_Account(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='checkoutPaymentForm']//input[@value='CreditAccount']"));
			Log.info("ProformaInvoice option found");
			return element;
		}

	}
}
