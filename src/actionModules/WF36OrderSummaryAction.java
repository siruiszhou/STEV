package actionModules;
import org.openqa.selenium.WebDriver;

import pageObjects.*;

public class WF36OrderSummaryAction {
	public static void CheckTandC(WebDriver driver){
		if(!WF36OrderSummary.field.get_field_AgreeToTandC(driver).isSelected())
		WF36OrderSummary.field.get_field_AgreeToTandC(driver).click();
	}
	public static void ContinueToPayment(WebDriver driver){
		WF36OrderSummary.button.get_button_ContinueToPayment(driver).click();		
	}
}
