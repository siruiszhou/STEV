package testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.AddBasketOverlay;
import pageObjects.BasketPage;
import pageObjects.Homepage;
import pageObjects.myAccountPageObjects.MyAccountProductList;
import pageObjects.myAccountPageObjects.MyOrderDetailSection;
import pageObjects.myAccountPageObjects.MyOrdersSection;
import actionModules.AddBasketOverlayAction;
import actionModules.BasketAction;
import actionModules.HeaderAction;
import actionModules.WF04Logon;
import actionModules.myAccountPageActions.MyAccountLHNActions;
import actionModules.myAccountPageActions.MyAccountProductListAction;
import actionModules.myAccountPageActions.MyOrdersSectionAction;
import utility.DataLoader;
import utility.Log;
import utility.Utils;

public class EssentraSmoke30_myAccountAddToBasketFromSKUList {
	private static WebDriver driver = null;

	@Test (groups = {"p0"})
	public void testMyAccountAddToBasketFromSKUList() throws Exception{

		HeaderAction.goLoginPage(driver);
		WF04Logon.Logon(driver);
		HeaderAction.goBasket(driver);
		BasketAction.clearBasket(driver);
		BasketAction.continueShopping(driver);
		HeaderAction.goMyAccount(driver);
		MyAccountLHNActions.goMyOrders(driver);
		MyOrdersSectionAction.goProductLists(driver);
		String SKUname = MyAccountProductList.value.get_value_SKUName(driver, 0);
		MyAccountProductListAction.addToBasketFromProductList(driver, 0);
		assertEquals(SKUname,AddBasketOverlay.values.get_value_SKUName(driver, 0).getText());
		AddBasketOverlayAction.returnToMyAccount(driver);		
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
		driver = Utils.openBrowserByURL(browserType, Constant.get_HomePageURL());
	}

	@AfterClass (groups = {"p0","p1","p2","p3"})
	public void afterClass() throws Exception {
		System.out.println("AfterClass of "+ Utils.getTestCaseName(this.toString()));
		driver.quit();
	}

	
}
