package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.DataLoader;
import utility.Log;

public class WF37PaymentCreditCard {
	private static WebElement element = null;
	
	public static class button{
		
		public static WebElement get_button_ConfirmAddress(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='checkoutPaymentForm']/div[2]/div[2]/div[1]/div/button"));
			Log.info("ConfirmAddress button found on WF37PaymentCreditAccount");
			return element;
		}
		
		public static WebElement get_button_ConfirmAddressForLogin(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='checkoutPaymentForm']/div[2]/div[3]/div[1]/div/button"));
													
			Log.info("ConfirmAddress button found on WF37PaymentCreditAccount");
			return element;
		}

	}
	public static class field{
		public static WebElement get_field_Address1(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='street_address_1']"));
			Log.info("Address1 field found on WF37PaymentCreditCard");
			return element;
		}
		public static WebElement get_field_Address2(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='street_address_2']"));
			Log.info("Address2 field found on WF37PaymentCreditCard");
			return element;
		}
		public static WebElement get_field_City(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='city_or_town']"));
			Log.info("City field found on WF37PaymentCreditCard");
			return element;
		}
		public static WebElement get_field_PostCode(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='postcode']"));
			Log.info("PostCode field found on WF37PaymentCreditCard");
			return element;
		}
		public static WebElement get_field_Country(WebDriver driver){
			DataLoader Constant =new DataLoader();
			element = driver.findElement(By.xpath(Constant.get_Country()));
			Log.info("Country field found on WF37PaymentCreditCard");
			return element;
		}
		public static WebElement get_field_Country_UK(WebDriver driver){
			element = driver.findElement(By.xpath(".//option[@value='GB']"));
			Log.info("Country UK found on WF37PaymentCreditCard");
			return element;
			
		}
		public static WebElement get_field_Country_US(WebDriver driver){
			element = driver.findElement(By.xpath(".//option[@value='US']"));
			Log.info("Country UK found on WF37PaymentCreditCard");
			return element;
			
		}
		public static WebElement get_field_UseDeliveryAddr(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='checkoutPaymentForm']/div[2]/div[2]/div[1]/div/div[1]/div[1]/label/input"));
			Log.info("Country UK found on WF37PaymentCreditCard");
			return element;
		}
		
	}
	public static class DataCashElements{
		public static WebElement get_field_CardNum(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='cardnumber']"));
			Log.info("CardNum field found on datacash Iframe");
			return element;
		}
		public static WebElement get_field_ExpMonth(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='exp_month']"));
			Log.info("ExpMonth field found on datacash Iframe");
			return element;
		}
		public static WebElement get_field_ExpMonthJan(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='exp_month']/option[@value='01']"));
			Log.info("ExpMonthJan field found on datacash Iframe");
			return element;
		}
		public static WebElement get_field_ExpYear(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='exp_year']"));
			Log.info("ExpYear field found on datacash Iframe");
			return element;
		}
		public static WebElement get_field_ExpYearFirst(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='exp_year']/option[@value='2020']"));
			Log.info("ExpYear2015 field found on datacash Iframe");
			return element;
		}
		public static WebElement get_field_CVNum(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='cv2_number']"));
			Log.info("CVNum field found on datacash Iframe");
			return element;
		}
		public static WebElement get_button_Continue(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='continue']"));
			Log.info("continue button found on datacash Iframe");
			return element;
		}
		
	}
	
}
