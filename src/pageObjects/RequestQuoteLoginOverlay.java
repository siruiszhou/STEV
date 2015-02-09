package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class RequestQuoteLoginOverlay {
	private static WebElement element = null;

	public static class field{
		public static WebElement get_field_quantity(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='amendQuantityForm']/form/div[2]/ul/li/div[3]/div/div/input"));
			Log.info("quantity field found");
			return element;
		}

	}
	public static class button{
		public static WebElement get_field_RequestQuote(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='amendQuantityForm']/form/div[3]/button[2]"));
			Log.info("request quote button found");
			return element;
		}
		public static WebElement get_field_ContinueShopping(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[contains(@id,'modal')]/div/form/div[3]/button"));
			Log.info("request quote button found");
			return element;
		}
	}
	}