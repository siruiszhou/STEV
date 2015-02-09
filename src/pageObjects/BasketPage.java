package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class BasketPage {
	private static WebElement element = null;


	public static class button{
		public static WebElement get_button_CheckOut(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='basket_checkout_btn_bottom']"));
			Log.info("check button found on basket page");
			return element;
		}
		
		public static WebElement get_button_ClearBasket(WebDriver driver){
			element = driver.findElement(By.xpath(".//button[text()='Clear Basket']"));
			Log.info("Clear basket button found on basket page");
			return element;
		}
		
		public static WebElement get_button_ContinueShopping(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='site_bd']/div[2]/div/a"));
			Log.info("continueShopping button found on basket page");
			return element;
		}
		public static WebElement get_button_SaveBasket(WebDriver driver){
			element = driver.findElement(By.xpath(".//button[text()='Save Basket']"));
			Log.info("Save Basket button found on basket page");
			return element;
		}
		public static WebElement get_button_EnterPromoCode(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='site_bd']/div[4]/div[4]/a"));
			Log.info("Enter a Promo code field found");
			return element;
		}
		public static WebElement get_field_PromoCode(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='myForm']/input[7]"));
			Log.info("Promo code input field found");
			return element;
		}
		public static WebElement get_button_SavePromoCode(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='myForm']/button"));
			Log.info("Save Promo Code button found");
			return element;
		}
		public static WebElement get_button_ChangePromoCode(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='site_bd']/div[4]/div[1]/p/a[1]"));
			Log.info("Change Promo code button found");
			return element;
		}
		public static WebElement get_button_RemovePromoCode(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='site_bd']/div[4]/div[1]/p/a[2]"));
			Log.info("Change Promo code button found");
			return element;
		}
		public static WebElement get_field_subtotal(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='site_bd']/div[5]/dl/dd[1]"));
			Log.info("Subtotal price field found");
			return element;
		}
		public static WebElement get_field_totalcost(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='site_bd']/div[5]/dl/dd[3]/strong"));
			Log.info("Total Cost field found");
			return element;
		}
		public static WebElement get_button_tryotherpromocode(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='site_bd']/div[4]/div[3]/a"));
			Log.info("Try another Promo code button found");
			return element;
		}
		public static WebElement get_filed_waringpromocode(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='site_bd']/div[4]/div[3]/span"));
			Log.info("Error Promo Message field found");
			return element;
		}

	}
	public static List<String> get_list_Itemcodes(WebDriver driver){
		List<WebElement> itemCodesElements =  driver.findElements(By.xpath(".//strong[text()='Item Code: ']/following-sibling::*"));
		List<String> itemCodes = new ArrayList<>();
		for (int i=0; i<itemCodesElements.size();i++){
			itemCodes.add(itemCodesElements.get(i).getText());
		}		
		return itemCodes;
	}
	
	public static boolean isEmpty(WebDriver driver){
		
		boolean isEmptyBasket = true;
		List<WebElement> buttons = driver.findElements(By.xpath(".//div [@class='continueShopping']/a"));
		if (buttons.size()>1) 
			isEmptyBasket = false;
		return isEmptyBasket;		
	}
}
