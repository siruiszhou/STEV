package actionModules;

import org.openqa.selenium.WebDriver;

import pageObjects.WF36OrderSummaryForSample;

public class WF36OrderSummaryForSampleAction {
	public static void checkTandC(WebDriver driver){
		if(!WF36OrderSummaryForSample.field.get_field_AgreeToTandC(driver).isSelected())
			WF36OrderSummaryForSample.field.get_field_AgreeToTandC(driver).click();
	}
	public static void placeOrder(WebDriver driver){
		WF36OrderSummaryForSample.button.get_button_PlaceOrder(driver).click();		
	}
}
