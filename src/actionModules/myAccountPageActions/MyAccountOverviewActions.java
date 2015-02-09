package actionModules.myAccountPageActions;

import org.openqa.selenium.WebDriver;

import pageObjects.myAccountPageObjects.MyAccountOverviewSection;
import pageObjects.myAccountPageObjects.myAccountLHN;

public class MyAccountOverviewActions {
	public static void goOpenOrders(WebDriver driver){
		MyAccountOverviewSection.get_Link_OpenOrders(driver).click();
	}
	public static void goSavedBaskets(WebDriver driver){
		MyAccountOverviewSection.get_Link_SavedBaskets(driver).click();
	}
}
