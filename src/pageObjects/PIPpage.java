package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class PIPpage {
	private static WebElement element = null;

	public static class field{
		public static WebElement get_field_quantity(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[contains(@id,'SKUForm')]/div/div/input"));
			Log.info("quantity field found");
			return element;
		}

	}
	public static class button{
		public static WebElement get_button_AddBasket(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[contains(@id,'SKUForm')]/button"));
			Log.info("Add to basket button found");
			return element;
		}
		public static WebElement get_button_ViewCAD(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='requestCADButton_10511']"));
			Log.info("Add to basket button found");
			return element;
		}
		public static WebElement get_button_RequestQuote(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='requestquoteButton_10511']"));
			Log.info("Add to basket button found");
			return element;
		}
		public static WebElement get_button_OrderSample(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[contains(@id,'ordersampleButton')]"));
			Log.info("Order Sample button found");
			return element;
		}
}
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

		}

		public static class value{
			public static String get_value_itemName(WebDriver driver){

				return driver.findElement(By.xpath(".//div[@class='product_info']//h1")).getText();
			}
			public static String get_value_itemCode(WebDriver driver){
				
				return driver.findElement(By.xpath(".//h5[text()='Item Code: ']/span")).getText();
			}
			public static String get_FullPackOnlyText(WebDriver driver){
				
				return driver.findElement(By.xpath(".//td[@class='price']/p/strong")).getText();
			}
			
			public static int get_PackSize(WebDriver driver){
				String packSizeText = driver.findElement(By.xpath(".//td[@class='price']/p")).getText();
				String packSize = packSizeText.substring(packSizeText.length()-1);
				 
				return Integer.valueOf(packSize);
			}

		}
}
