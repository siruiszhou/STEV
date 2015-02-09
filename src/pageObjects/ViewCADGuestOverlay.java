package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.DataLoader;
import utility.Log;

public class ViewCADGuestOverlay {
	private static WebElement element = null;

	public static class field{
		public static WebElement get_field_title(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='guestInfo_title']/option[2]"));
			Log.info("title field found");
			return element;
		}
		public static WebElement get_field_firstname(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='guestInfo_firstName']"));
			Log.info("first name field found");
			return element;
		}
		public static WebElement get_field_lastname(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='guestInfo_lastName']"));
			Log.info("last name field found");
			return element;
		}
		public static WebElement get_field_phonenumber(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='guestInfoForm']/form/div[2]/div[2]/ul/li[4]/div[2]/input"));
			Log.info("phone number field found");
			return element;
		}
		public static WebElement get_field_emailaddress(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='guestInfo_email']"));
			Log.info("email field found");
			return element;
		}
		public static WebElement get_field_city(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='guestInfo_town']"));
			Log.info("city field found");
			return element;
		}
		public static WebElement get_field_country(WebDriver driver){
			DataLoader Constant =new DataLoader();
			element = driver.findElement(By.xpath(Constant.get_Country()));
			Log.info("contry field found");
			return element;
		}
		public static WebElement get_field_county(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='guestInfoForm']/form/div[2]/div[2]/ul/li[8]/select/option[2]"));
			Log.info("county field found");
			return element;
		}
		public static WebElement get_field_jobtitle(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='guestInfo_jobtitle']"));
			Log.info("jobtitle field found");
			return element;
		}
		public static WebElement get_field_confimterm(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='guestInfoForm']/form/div[2]/ul/li/label/input"));
			Log.info("Confirm Term field found");
			return element;
		}
	}
	public static class button{
		public static WebElement get_field_ViewCAD(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='guestInfoForm']/form/div[3]/button[2]"));
			Log.info("View CAD button found");
			return element;
		}
		public static WebElement get_field_Close(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[contains(@id,'modal')]/div/div[1]/button"));
			Log.info("request quote button found");
			return element;
		}
	}
	}