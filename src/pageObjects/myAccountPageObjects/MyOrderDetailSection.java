package pageObjects.myAccountPageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyOrderDetailSection {
	private static WebElement element = null;
	
	public static WebElement get_button_BackToOrders(WebDriver driver){
		
		element = driver.findElement(By.xpath(".//div[@class='back_button']//a"));
		return element;
	}
	
	public static int numOfReOrderableSKUs(WebDriver driver){
		
		return new MyOrderDetailSection().getReorderCheckboxes(driver).size();
	}
	
	public static WebElement get_button_AddSelectedToBasket(WebDriver driver){
		
		element = driver.findElement(By.xpath(".//button[contains(text(),'Add selected to Basket')]"));
		return element;
	}
	
	public static WebElement get_text_PaymentSectionTitle(WebDriver driver){
		
		element = driver.findElement(By.xpath(".//h2[text()='Payment Information']"));
		return element;
	}
	
	public static WebElement get_text_ShippingInformationTitle(WebDriver driver){
		
		element = driver.findElement(By.xpath(".//h2[text()='Shipping Information']"));
		return element;
	}
	
	public static WebElement get_text_SKUTableTitle(WebDriver driver){
		
		element = driver.findElement(By.xpath(".//h2[text()='Products In This Order']"));
		return element;
	}
	private static List<WebElement> getReorderCheckboxes(WebDriver driver){
		List<WebElement> elist = driver.findElements(By.xpath(".//td[@class='reorder']"));
		return elist;
	
	}
	
	public static List<String> get_value_ItemNames(WebDriver driver){
		List<WebElement> elist = driver.findElements(By.xpath(".//form[contains(@id, 'SKUForm')]//td[@class='product']//span"));
		List<String> itemNames= new ArrayList<>();
		for(int i=0;i<elist.size();i++){
			itemNames.add(elist.get(i).getText());
		}	
		return itemNames;
	
	}
	
}
