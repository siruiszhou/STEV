package actionModules;

import org.openqa.selenium.WebDriver;

import pageObjects.SampleAmendQuantityOverlay;

public class SampleAmendQuantityOverlayAction {

	public static void selectQuantiy(WebDriver driver, String quantity){
		SampleAmendQuantityOverlay.fields.get_field_Quantity(driver, quantity).click();
	}
	public static void orderSample(WebDriver driver){
		SampleAmendQuantityOverlay.button.get_button_OrderSample(driver).click();
	}
	
	public static void cancelSample(WebDriver driver){
		SampleAmendQuantityOverlay.button.get_button_Cancel(driver).click();
	}
}
