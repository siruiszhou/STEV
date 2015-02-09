package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class PDPpage {
	private static WebElement element = null;
	public static class Link{
		public static WebElement get_link_breadcrumb_home(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='site_bd']/ul/li[1]/a"));
			return element;
		}
		public static WebElement get_link_breadcrumb_L1(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='site_bd']/ul/li[2]/a"));
			return element;
		}
		public static WebElement get_link_breadcrumb_L2(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='site_bd']/ul/li[3]/a"));
			return element;
		}
		public static WebElement get_link_item_image_brakepad(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='CatalogEntrySKUDetails']/div[1]/table/tbody/tr[2]/td[1]/div/a/img"));
			return element;
		}

	}
	public static class button{
		public static WebElement get_button_RequestQuote(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='requestquoteButton_10511']"));
			return element;
		}
		public static WebElement get_button_ViewCAD(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='requestCADButton_10511']"));
			return element;
		}
	}
}

