package testCases;

import static org.testng.AssertJUnit.assertTrue;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.WF03a_Personal_Company_Join_Registration;
import pageObjects.WF04_Register_Login;
import pageObjects.PIPpage;
import pageObjects.WF38OrderConfirmation;
import utility.DataLoader;
import utility.Log;
import utility.Utils;
import actionModules.*;

//Created By Simba Ji
public class EssentraSmoke11_CheckoutStdAsGuest {
	private static WebDriver driver = null;

	@Test (groups = {"p0"})
	public void testCheckoutStdAsGuest() throws Exception{

		PIPAction.addToBasket(driver, 8);
		AddBasketOverlayAction.viewBasket(driver);	
		BasketAction.checkoutOnBottom(driver);
		WF03GuestRegisterOrLoginAction.ContinueAsGuest(driver);
		WF33aShippingAddressGuestAction.inputDetails(driver);
		WF33aShippingAddressGuestAction.ContinueToShippingMethod(driver);
		WF34ShippingMethodAction.ContinueToOrderReference(driver);
		WF35AddReferencesAction.ContinueToOrderSummary(driver);
		WF36OrderSummaryAction.CheckTandC(driver);
		WF36OrderSummaryAction.ContinueToPayment(driver);
		WF37PaymentCreditCardAction.EnterCardAddress(driver);
		WF37PaymentCreditCardAction.ConfirmAddressAndWaitForDataCash(driver);
		driver.switchTo().frame("cardPayment");
		WF37PaymentCreditCardAction.EnterCardDetails(driver);
		WF38aOrderConfirmationGuestAction.CheckOrderComplete(driver);
		assertTrue("Order Complete page is not displayed.",WF38OrderConfirmation.get_element_OrderComplete(driver).isDisplayed());
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
