package actionModules.myAccountPageActions;

import org.openqa.selenium.WebDriver;

import pageObjects.myAccountPageObjects.*;
import utility.Log;

public class MyAccountLHNActions {
	public static void goMyOrders(WebDriver driver){
		myAccountLHN.Link.get_link_item_MyOrders(driver).click();
	}

	public static void goProductSamples(WebDriver driver){
		myAccountLHN.Link.get_link_item_ProductSamples(driver).click();
	}
	public static void goAccountDetails(WebDriver driver){
		myAccountLHN.Link.get_link_item_AccountDetails(driver).click();
	}
	public static void goDeliveryAddresses(WebDriver driver){
		myAccountLHN.Link.get_link_item_DeliveryAddresses(driver).click();
	}
	public static void goManageUsers(WebDriver driver){
		myAccountLHN.Link.get_link_item_ManageUsers(driver).click();
	}
	public static void goAccountOverview(WebDriver driver){
		myAccountLHN.Link.get_link_item_AccountOverview(driver).click();
	}
}
