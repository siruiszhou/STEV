package actionModules;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.WF37Payment;


public class WF37PaymentAction {
	public static void placeOrder(WebDriver driver){
		WF37Payment.button.get_button_PlaceOrder(driver).click();		
	}
	
	public static void selectCard(WebDriver driver){
		WF37Payment.field.get_field_Card(driver).click();
		WF37PaymentAction.isCountryLoaded(driver);
	}
	
	public static void selectAccount(WebDriver driver){
		WF37Payment.field.get_field_Account(driver).click();		
	}
	public static void selectProforma(WebDriver driver){
		WF37Payment.field.get_field_Proforma(driver).click();		
	}
	
	private static boolean isCountryLoaded(WebDriver driver ){
		boolean countryLoaded = false;
		List<WebElement> countryList = driver.findElements(By.xpath(".//select[@id='country']/option"));
		if (countryList.size() >1){
			countryLoaded = true;
		}
		else {
			System.out.println("country cannot be loaded on payment page");
		}
		return countryLoaded;
	}
}
