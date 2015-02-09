package pageObjects.myAccountPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class myAccountLHN {
	//private static WebElement element = null;
	public static class Link{

		public static WebElement get_link_item_AccountOverview(WebDriver driver)
		{
			return new myAccountLHN().getLinkByName(driver, "Account Overview");		
		}
		
		public static WebElement get_link_item_MyOrders(WebDriver driver)
		{
			return new myAccountLHN().getLinkByName(driver, "My Orders");
		}
		
		public static WebElement get_link_item_ProductSamples(WebDriver driver)
		{
			return new myAccountLHN().getLinkByName(driver, "Product Samples");
		}
		
		public static WebElement get_link_item_AccountDetails(WebDriver driver)
		{
			return new myAccountLHN().getLinkByName(driver, "Account Details");
		}
		
		public static WebElement get_link_item_DeliveryAddresses(WebDriver driver)
		{
			return new myAccountLHN().getLinkByName(driver, "Delivery Addresses");
		}
		
		public static WebElement get_link_item_ManageUsers(WebDriver driver)
		{
			return new myAccountLHN().getLinkByName(driver, "Manage Users");
		}
	}
	
	private WebElement getLinkByName(WebDriver driver, String sectionName){
		WebElement el = null;
		el = driver.findElement(By.xpath(".//a[text() = '"+sectionName+"']"));
		Log.info(sectionName+" found on LHN of MyAccount");
		return el;
	}
}
