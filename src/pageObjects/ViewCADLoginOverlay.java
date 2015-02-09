package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class ViewCADLoginOverlay {
	private static WebElement element = null;

	public static class field{
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
			element = driver.findElement(By.xpath(".//div[@class='popupModal']//button[@class='close']"));
			Log.info("request quote button found");
			return element;
		}
	}
	}