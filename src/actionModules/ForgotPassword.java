package actionModules;

import org.openqa.selenium.WebDriver;
import pageObjects.WF03ForgotPassword;
import static org.testng.AssertJUnit.assertTrue;

public class ForgotPassword {

	public static void SendEmailforPassword (WebDriver driver, String email){
		WF03ForgotPassword.field.get_button_email(driver).sendKeys(email);
		WF03ForgotPassword.button.get_button_SendPassword(driver).click();
		assertTrue(WF03ForgotPassword.field.get_button_RetrievalText(driver).getText().equals("Password Retrieval"));
		WF03ForgotPassword.button.get_button_ContinueShopping(driver).click();
	}
	
}

