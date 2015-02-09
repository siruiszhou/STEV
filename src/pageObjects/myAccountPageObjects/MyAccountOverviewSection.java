package pageObjects.myAccountPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class MyAccountOverviewSection {
	
	private static WebElement element = null;
	
	public static WebElement get_Link_OpenOrders(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='site_bd']//a[contains(text(),'open orders')]"));
		Log.info("open orders link element found");
		return element;
	}
	
	public static WebElement get_Link_SavedBaskets(WebDriver driver){
		element = driver.findElement(By.xpath(".//a[contains(text(), 'saved baskets')]"));
		Log.info("open orders link element found");
		return element;
	}
	public static WebElement get_Text_Welcome(WebDriver driver){
		element = driver.findElement(By.xpath(".//h1[text()= 'Welcome Back, ']"));
		Log.info("Welcome Text element found");
		return element;
	}
	public static WebElement get_button_View(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='site_bd']/div[2]/div[2]/div[1]/a"));
		Log.info("View Joiner element found");
		return element;
	}
}
