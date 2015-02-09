package actionModules;

import org.openqa.selenium.WebDriver;


import pageObjects.AddBasketOverlay;

public class AddBasketOverlayAction {

	public static void viewBasket(WebDriver driver){
		AddBasketOverlay.button.get_button_ViewBasket(driver).click();
	}
	public static void continueShopping(WebDriver driver){
		AddBasketOverlay.button.get_button_ContinueShipping(driver).click();
	}
	public static void returnToMyAccount(WebDriver driver){
		AddBasketOverlay.button.get_button_ReturnToMyAccount(driver).click();
	}
	
	
}
