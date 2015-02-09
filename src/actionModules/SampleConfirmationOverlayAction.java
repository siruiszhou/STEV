package actionModules;

import org.openqa.selenium.WebDriver;

import pageObjects.SampleConfirmationOverlay;

public class SampleConfirmationOverlayAction {

	public static void viewBasket(WebDriver driver){
		SampleConfirmationOverlay.button.get_button_ViewBasket(driver).click();
	}
	public static void continueShopping(WebDriver driver){
		SampleConfirmationOverlay.button.get_button_ContinueShipping(driver).click();
	}
}
