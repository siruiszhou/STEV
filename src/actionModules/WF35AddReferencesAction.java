package actionModules;
import org.openqa.selenium.WebDriver;

import pageObjects.*;

public class WF35AddReferencesAction {
	public static void ContinueToOrderSummary(WebDriver driver){
		
		WF35AddReferences.button.get_button_ContinueToOrderSummary(driver).click();
	}
}
