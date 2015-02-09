package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class WF03GuestRegisterOrLogin {
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
		public static WebElement get_button_ContinueAsGuest(WebDriver driver){
			element = driver.findElement(By.xpath("//a[contains(text(), 'Continue as Guest')]"));
			Log.info("ContinueAsGuest button found on WF03GuestRegisterOrLogin");
			return element;
		}
		public static WebElement get_button_Register(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[contains(@id, 'WC_AccountDisplay')]//a[contains(text(), 'Register')]"));
			Log.info("Register button found on WF03GuestRegisterOrLogin");
			return element;
		}
		public static WebElement get_button_Login(WebDriver driver){
			element = driver.findElement(By.xpath("//button[contains(text(), 'Log in')]"));
			Log.info("Login button found on WF03GuestRegisterOrLogin");
			return element;
		}
		public static WebElement get_button_forgotpassword(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='loginForm']/div[3]/div/a"));
			Log.info("Forgot Password button found on WF03GuestRegisterOrLogin");
			return element;
		}
}

}
