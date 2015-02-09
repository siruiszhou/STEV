package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class Header {
	private static WebElement element = null;
	

		public static WebElement get_Link_Login(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='headerLogin']"));
			Log.info("login link element found");
			return element;
		}
		public static WebElement get_Link_Basket(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='shoppingCartBar']/div[1]"));
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
		
		public static WebElement get_button_Search(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='CatalogSearchForm']/div/input[@class='searchbutton']"));
			Log.info("Search button element found");
			return element;
		}
		
		public static WebElement get_Link_logout(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='headerLogout']"));
			Log.info("Search Box element found");
			return element;
		}
		public static WebElement get_Link_MyAccount(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='headerMyAccount']"));
			Log.info("headerMyAccount element found");
			return element;
		}
		public static WebElement get_Link_Logo(WebDriver driver){
			element = driver.findElement(By.xpath(".//div[@class='logo']"));
			Log.info("logo element found");
			return element;
		}
		
		public static WebElement get_Link_loginStatus(WebDriver driver){
			element = driver.findElement(By.xpath(".//div[@class='link_item login']/a"));
			Log.info("logo element found");
			return element;
		}
		


}
