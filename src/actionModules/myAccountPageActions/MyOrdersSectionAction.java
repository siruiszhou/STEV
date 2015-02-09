package actionModules.myAccountPageActions;

import org.openqa.selenium.WebDriver;

import pageObjects.ListPagesWithPaging;
import pageObjects.myAccountPageObjects.MyOrdersSection;


public class MyOrdersSectionAction extends ListPagesWithPaging{
	public static void goOpenOrders(WebDriver driver){
		MyOrdersSection.getOrderListByName(driver, "Open Orders").click();;
	}
	
	public static void goAllOrders(WebDriver driver){
		MyOrdersSection.getOrderListByName(driver, "All Orders").click();
	}
	
	public static void goCompleteOrders(WebDriver driver){
		MyOrdersSection.getOrderListByName(driver, "Complete Orders").click();
	}
	
	public static void goSavedBaskets(WebDriver driver){
		MyOrdersSection.getOrderListByName(driver, "Saved Baskets").click();
	}
	
	public static void goProductLists(WebDriver driver){
		MyOrdersSection.getOrderListByName(driver, "Product List").click();
	}
	
	public static void viewOrderDetails(WebDriver driver, String numOfOrder){
		MyOrdersSection.getViewButtonByNum(driver, numOfOrder).click();
	}
	
	public static void viewOrderDetailsByOrderID(WebDriver driver, String orderID){
		MyOrdersSection.getViewButtonByOrderID(driver, orderID).click();
	}
	
	public static void viewOrderDetailsByReference(WebDriver driver, String orderReference){
		MyOrdersSection.getViewButtonByReference(driver, orderReference).click();
	}
	
	public static void goLastPage(WebDriver driver){
		MyOrdersSection.gotoLastPage(driver);
	}
}
