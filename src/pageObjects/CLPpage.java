package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class CLPpage {
	private static WebElement element = null;
	public static class Link{
		public static WebElement get_link_breadcrumb_home(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='site_bd']/ul/li[1]/a"));
			return element;
		}
		public static WebElement get_link_category_image_brakepad(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='site_bd']/div[4]/div/div/ul/li[1]/a/img"));
			return element;
		}
	}
}
