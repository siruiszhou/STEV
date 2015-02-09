package actionModules;

import org.openqa.selenium.WebDriver;

import pageObjects.BasketPage;
import pageObjects.SaveBasketConfirmationOverlay;
import pageObjects.SaveBasketOverlay;
import utility.Log;


public class BasketAction {
	
	public static void checkoutOnBottom(WebDriver driver){
		BasketPage.button.get_button_CheckOut(driver).click();
	}
	public static void clearBasket(WebDriver driver){
		if(!BasketPage.isEmpty(driver)){
			
			BasketPage.button.get_button_ClearBasket(driver).click();
			Log.info("Basekt cleared on basket page");
		}

	}
	
	public static void continueShopping(WebDriver driver){
		BasketPage.button.get_button_ContinueShopping(driver).click();
	}
	
	public static void saveBasket(WebDriver driver, String basketReference) throws Exception{

		BasketPage.button.get_button_SaveBasket(driver).click();
		Thread.sleep(2000);
		SaveBasketOverlay.field.get_field_Reference(driver).clear();
		SaveBasketOverlay.field.get_field_Reference(driver).sendKeys(basketReference);
		
		SaveBasketOverlay.button.get_button_Save(driver).click();
		SaveBasketOverlay.button.get_button_Save(driver).click();
		SaveBasketConfirmationOverlay.button.get_button_OK(driver).click();
	}
	

}
