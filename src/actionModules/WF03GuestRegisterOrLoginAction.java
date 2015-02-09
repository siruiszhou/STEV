package actionModules;

import org.openqa.selenium.WebDriver;

import pageObjects.WF03GuestRegisterOrLogin;;

public class WF03GuestRegisterOrLoginAction {

	public static void ContinueAsGuest(WebDriver driver){
		WF03GuestRegisterOrLogin.button.get_button_ContinueAsGuest(driver).click();
	}
	public static void goRegister(WebDriver driver){
		WF03GuestRegisterOrLogin.button.get_button_Register(driver).click();
	}
}
