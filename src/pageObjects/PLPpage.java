package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class PLPpage {
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
		public static WebElement get_link_product_name_kevlarbrakepad(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='WC_CatalogEntryDBThumbnailDisplayJSPF_10401_detailed_link']/img"));
			return element;
		}
		public static WebElement get_link_gridview(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='Search_Area_div']/div[2]/div[2]/span[2]"));
			return element;
		}
		public static WebElement get_link_show_variants(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='varBtn_10510']"));
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
