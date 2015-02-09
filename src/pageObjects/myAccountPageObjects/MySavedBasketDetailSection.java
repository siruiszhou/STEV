package pageObjects.myAccountPageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MySavedBasketDetailSection {
	private static WebElement element = null;
	
	public static WebElement get_button_BackToOrders(WebDriver driver){
		
		element = driver.findElement(By.xpath(".//div[@class='back_button']//a"));
		return element;
	}
	
	
	public static WebElement get_button_AddSelectedToBasket(WebDriver driver){
		
		element = driver.findElement(By.xpath(".//button[contains(text(),'Add to Basket')]"));
		return element;
	}
	
	
	
	public static List<String> get_value_ItemNames(WebDriver driver){
		List<WebElement> elist = driver.findElements(By.xpath(".//table[@class='data_table table table-bordered']//td[@class='product']//span"));
		List<String> itemNames= new ArrayList<>();
		for(int i=0;i<elist.size();i++){
			itemNames.add(elist.get(i).getText());
		}	
		return itemNames;
	
	}
	
}
