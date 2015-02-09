package testCases;

import static org.testng.AssertJUnit.assertTrue;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.Header;
import pageObjects.Overlay;
import pageObjects.WF03a_Personal_Company_Join_Registration;
import pageObjects.WF04_Register_Login;
import pageObjects.PIPpage;
import pageObjects.WF38OrderConfirmation;
import utility.DataLoader;
import utility.Log;
import utility.Utils;
import actionModules.*;

//Created By Ethan Zhou
public class EssentraSmoke18_CheckoutSmplStdCatalogueAsLogin {
	private static WebDriver driver = null;

	@Test (groups = {"p0"})
	public void testCheckoutSmplStdCatalogueAsLogin() throws Exception{
		DataLoader Constant = new DataLoader();
		Header.get_Link_Login(driver).click();
		WF04Logon.Logon(driver);
		HeaderAction.goBasket(driver);
		
		BasketAction.clearBasket(driver);
		BasketAction.continueShopping(driver);
		driver.get(Constant.get_CATALOGUEURL());
		OrderCatalogue.addToBasket(driver);
		driver.get(Constant.get_PIPURL());
		PIPAction.orderSample(driver);
		if(Overlay.get_text_Title(driver).contains("Confirm Sample Quantity"))
		{
		SampleAmendQuantityOverlayAction.selectQuantiy(driver, "2");
		SampleAmendQuantityOverlayAction.orderSample(driver);
		}
		SampleConfirmationOverlayAction.continueShopping(driver);
		//driver.get(Constant.PIPURL);
		PIPAction.addToBasket(driver, 8);
		AddBasketOverlayAction.viewBasket(driver);

		
		BasketAction.checkoutOnBottom(driver);
		WF33ShippingAddressAction.ContinueToShippingMethod(driver);
		Thread.sleep(1000);
		WF34ShippingMethodAction.ContinueToOrderReference(driver);
		WF35AddReferencesAction.ContinueToOrderSummary(driver);
		WF36OrderSummaryAction.CheckTandC(driver);
		WF36OrderSummaryAction.ContinueToPayment(driver);
		WF37PaymentAction.selectProforma(driver);
		WF37PaymentAction.placeOrder(driver);
		WF38OrderConfirmationAction.CheckOrderComplete(driver);		
		assertTrue("Order Complete page is not displayed",WF38OrderConfirmation.get_element_OrderComplete(driver).isDisplayed());
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
