package testCases;

import static org.testng.AssertJUnit.assertTrue;

import java.util.List;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.Header;
import pageObjects.PIPpage;
import pageObjects.WF38OrderConfirmation;
import pageObjects.myAccountPageObjects.MyOrderDetailSection;
import actionModules.AddBasketOverlayAction;
import actionModules.BasketAction;
import actionModules.HeaderAction;
import actionModules.PIPAction;
import actionModules.SampleAmendQuantityOverlayAction;
import actionModules.SampleConfirmationOverlayAction;
import actionModules.WF04Logon;
import actionModules.WF33ShippingAddressAction;
import actionModules.WF34ShippingMethodAction;
import actionModules.WF35AddReferencesAction;
import actionModules.WF36OrderSummaryAction;
import actionModules.WF37PaymentAction;
import actionModules.WF38OrderConfirmationAction;
import actionModules.myAccountPageActions.MyAccountLHNActions;
import actionModules.myAccountPageActions.MyOrdersSectionAction;
import utility.DataLoader;
import utility.Log;
import utility.Utils;

public class EssentraSmoke33_CheckoutAndMyOrderE2E {
	private static WebDriver driver = null;
	
	@Test (groups = {"p0"})
	public void testCheckoutAndMyOrderE2E() throws Exception{

		Header.get_Link_Login(driver).click();
		WF04Logon.Logon(driver);
		HeaderAction.goBasket(driver);
		
		BasketAction.clearBasket(driver);
		BasketAction.continueShopping(driver);
		String smplItemName = PIPpage.value.get_value_itemName(driver);
		String smplItemCode = PIPpage.value.get_value_itemCode(driver);
		PIPAction.orderSample(driver);
		SampleAmendQuantityOverlayAction.selectQuantiy(driver, "2");
		SampleAmendQuantityOverlayAction.orderSample(driver);
		SampleConfirmationOverlayAction.continueShopping(driver);
		String stdItemName = PIPpage.value.get_value_itemName(driver);
		String stdItemCode = PIPpage.value.get_value_itemCode(driver);
		PIPAction.addToBasket(driver, 8);
		AddBasketOverlayAction.viewBasket(driver);
		BasketAction.checkoutOnBottom(driver);
		WF33ShippingAddressAction.ContinueToShippingMethod(driver);
		WF34ShippingMethodAction.ContinueToOrderReference(driver);
		WF35AddReferencesAction.ContinueToOrderSummary(driver);
		WF36OrderSummaryAction.CheckTandC(driver);
		WF36OrderSummaryAction.ContinueToPayment(driver);
		WF37PaymentAction.selectProforma(driver);
		WF37PaymentAction.placeOrder(driver);
		WF38OrderConfirmationAction.CheckOrderComplete(driver);
		String orderID = WF38OrderConfirmation.get_value_OrderID(driver);
		assertTrue("Order Complete page is not displayed",WF38OrderConfirmation.get_element_OrderComplete(driver).isDisplayed());
		HeaderAction.goMyAccount(driver);
		MyAccountLHNActions.goMyOrders(driver); 
		MyOrdersSectionAction.viewOrderDetailsByOrderID(driver, orderID);		
		List<String> itemNames = MyOrderDetailSection.get_value_ItemNames(driver);
		System.out.println(itemNames);
		assertTrue("the item"+stdItemName+"is not shown in my orders",itemNames.contains(stdItemName));
		assertTrue("the item"+smplItemName+" is not shown in my orders",itemNames.contains(smplItemName));
	    HeaderAction.logout(driver);
	}
	
	
	@BeforeClass (groups = {"p0","p1","p2","p3"})
	@Parameters({"localSite","browserType","siteEnv"})
	public void beforeClass(String localSite, String browserType, String siteEnv) throws Exception {
		DataLoader Constant = new DataLoader();
		System.out.println("BeforeClass of "+ Utils.getTestCaseName(this.toString()));
		Constant.localSite = localSite;
		Constant.siteEnv = siteEnv;
		DOMConfigurator.configure(Constant.get_LOG_CONFIGURE_XML());
		Log.startTestCase(Utils.getTestCaseName(this.toString()));	
		driver = Utils.openBrowserByURL(browserType, Constant.get_PIPURL());
		
		
	}

	@AfterClass (groups = {"p0","p1","p2","p3"})
	public void afterClass() throws Exception {
		System.out.println("AfterClass of "+ Utils.getTestCaseName(this.toString()));
		driver.quit();
	}
}
