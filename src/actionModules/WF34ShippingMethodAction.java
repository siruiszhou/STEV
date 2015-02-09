package actionModules;
import org.openqa.selenium.WebDriver;

import pageObjects.*;

public class WF34ShippingMethodAction {
	public static void ContinueToOrderReference(WebDriver driver){
		WF34ShippingMethod.button.get_button_ContinueToOrderReference(driver).click();;
	}
}
