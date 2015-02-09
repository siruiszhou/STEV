package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class WF03ForgotPassword {
	private static WebElement element = null;
//	public static class field{
//		public static WebElement get_field_quantity(WebDriver driver){
//			element = driver.findElement(By.xpath(".//*[contains(@id,'SKUForm')]/div/div/input"));
//			Log.info("quantity field found");
//			return element;
//		}
//
//	}
	public static class button{
		public static WebElement get_button_back(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='site_bd']/div[1]/div/a"));
			Log.info("Back button found on WF03ForgotPassword");
			return element;
		}
		public static WebElement get_button_SendPassword(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='forgottenPasswordForm']/fieldset/div[2]/div/button"));
			Log.info("Send me my password button found on WF03ForgotPassword");
			return element;
		}
		public static WebElement get_button_ContinueShopping(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='row']/div/div/a"));
			Log.info("Continue Shopping button found on WF03ForgotPassword");
			return element;
		}

}

	
	public static class field{
		public static WebElement get_button_email(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='forgottenPasswordForm']/fieldset/div[1]/div/input"));
			Log.info("Email field found on WF03ForgotPassword");
			return element;
		}
		public static WebElement get_button_RetrievalText(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='row']/div/div/h1"));
			Log.info("Password Retrieval field on WF03ForgotPassword");
			return element;
		}

}
}
