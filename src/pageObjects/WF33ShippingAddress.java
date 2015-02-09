package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.DataLoader;
import utility.Log;

public class WF33ShippingAddress {
	private static WebElement element = null;

	public static class field{
		public static WebElement get_field_Title(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='site_bd']/form/div[1]/div[2]/div[1]/div/select"));
			Log.info("title field found on WF33aShippingAddressGuest");
			return element;
		}
		public static WebElement get_field_Firstname(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='inputFirstName']"));
			Log.info("first name field found on WF33aShippingAddressGuest");
			return element;
		}
		public static WebElement get_field_Lastname(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='inputLastName']"));
			Log.info("last name field found on WF33aShippingAddressGuest");
			return element;
		}
		public static WebElement get_field_Jobtitle(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='inputJobTitle']"));
			Log.info("Job title field found on WF33aShippingAddressGuest");
			return element;
		}
		public static WebElement get_field_Emailadderss(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='inputEmail1']"));
			Log.info("Email address field found on WF33aShippingAddressGuest");
			return element;
		}
		
		public static WebElement get_field_CountryCode(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='site_bd']/form/div[1]/div[2]/div[6]/div/select"));
			Log.info("Country code field found on WF33aShippingAddressGuest");
			return element;
		}
		public static WebElement get_field_phone(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='phone1']"));
			Log.info("Phone field found on WF33aShippingAddressGuest");
			return element;
		}
		public static WebElement get_field_CompanyName(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='inputCompanyName']"));
			Log.info("Company Name field found on WF33aShippingAddressGuest");
			return element;
		}
		public static WebElement get_field_Country(WebDriver driver){
			DataLoader Constant =new DataLoader();
			element = driver.findElement(By.xpath(Constant.get_Country()));
			Log.info("Country field found on WF33aShippingAddressGuest");
			return element;
		}
		public static WebElement get_field_Country_UK(WebDriver driver){
			element = driver.findElement(By.xpath(".//option[@value='GB']"));
			Log.info("Country UK found on WF33aShippingAddressGuest");
			return element;
		}
		public static WebElement get_field_Address1(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='inputAddressLine1']"));
			Log.info("Address1 field found on WF33aShippingAddressGuest");
			return element;
		}
		public static WebElement get_field_Address2(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='addinputAddressLine2']"));
			Log.info("Address2 field found on WF33aShippingAddressGuest");
			return element;
		}
		public static WebElement get_field_City(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='city']"));
			Log.info("City field found on WF33aShippingAddressGuest");
			return element;
		}
		public static WebElement get_field_County(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='inputCounty']"));
			Log.info("County field found on WF33aShippingAddressGuest");
			return element;
		}
		public static WebElement get_field_PostCode(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='postcode']"));
			Log.info("PostCode field found on WF33aShippingAddressGuest");
			return element;
		}

	}
	public static class button{
		public static WebElement get_button_ContinueToShipping(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='continue_to_shipping_method_btn']"));
			Log.info("Continue shipping method button found on WF33ShippingAddress");
			return element;
		}

	}
}
