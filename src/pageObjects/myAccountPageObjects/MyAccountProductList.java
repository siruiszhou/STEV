package pageObjects.myAccountPageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class MyAccountProductList {
	private static WebElement element = null;
	
	public static class field{
	public static List<WebElement> get_fields_quantity(WebDriver driver){
			return driver.findElements(By.xpath(".//form[contains(@id,'SKUForm')]//input[contains(@class,'quantity')]"));
		}
	
	public static WebElement get_field_quantity(WebDriver driver, int index){
	return MyAccountProductList.field.get_fields_quantity(driver).get(index);
		}
	}
	
	public static class button{
		public static List<WebElement> get_buttons_AddBasket(WebDriver driver){
			return  driver.findElements(By.xpath(".//*[contains(@id,'SKUForm')]/button"));
		}	
		
		public static WebElement get_button_AddBasket(WebDriver driver, int index){
			return MyAccountProductList.button.get_buttons_AddBasket(driver).get(index);
		}	
	}
		
	public static class value{
	public static List<WebElement> get_values_SKUNames(WebDriver driver){
			return driver.findElements(By.xpath(".//table [@class='data_table table table-bordered sku_list']//td[@class='product']//span"));
		}
	
	public static String get_value_SKUName(WebDriver driver, int index){
	return MyAccountProductList.value.get_values_SKUNames(driver).get(index).getText();
		}
	}

}
