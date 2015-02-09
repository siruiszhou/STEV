package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class Homepage {	
	
	private static WebElement element = null;
	// Page object is divided into three parts:header/Main_body/footer as inner class for ease of use
	public static class header{
		public static WebElement get_Link_Login(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='headerLogin']"));
			Log.info("login link element found");
			return element;
		}
		public static WebElement get_Link_Basket(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='site_hd']/div[2]/div[2]/div[2]/div[2]"));
			Log.info("Basket link element found");
			return element;
		}
		public static WebElement get_Link_Product(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='site_hd']/div[3]/ul/li[1]/a"));
			Log.info("Product Menu element found");
			return element;
		}
		public static WebElement get_Link_BrowseCategories(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='site_bd']/div[1]/div[1]/h2"));
			Log.info("Browse Catelogue List element found");
			return element;
		}
		public static WebElement get_Link_LHN_Brake(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='site_bd']/div[1]/div[1]/ul/li[1]/a"));
			Log.info("Browse Catelogue List element found");
			return element;
		}
		public static WebElement get_Link_QuickOrder(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='site_bd']/div[1]/div[3]/div[2]/div[1]/h2"));
			Log.info("Quick Order element found");
			return element;
		}
		public static WebElement get_Link_SearchBox(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='SimpleSearchForm_SearchTerm']"));
			Log.info("Search Box element found");
			return element;
		}
		public static WebElement get_Link_SearchButton(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='CatalogSearchForm']/div/input[2]"));
			Log.info("Search Box element found");
			return element;
		}
		public static WebElement get_Link_logout(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='headerLogout']"));
			Log.info("Search Box element found");
			return element;
		}

	}
	
	public static class quickOrderSection{
		public static WebElement get_TextBox_SKUNum(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='partNumber_front_1']"));
			Log.info("get_TextBox_SKUNum element found in quick order section");
			return element;
		}
		
		public static WebElement get_TextBox_Quantity(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='quantity_front_1']"));
			Log.info("get_Quantity_TextBox element found in quick order section");
			return element;
		}
		public static WebElement get_button_AddToBasket(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='MQuickOrderForm']/button"));
			Log.info("button_AddToBasket found in quick order section");
			return element;
		}
		//to be implemented
	}
	
	public static class footer{
		//to be implemented
	}
	
}
