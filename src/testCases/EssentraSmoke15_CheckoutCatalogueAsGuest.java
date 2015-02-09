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
public class EssentraSmoke15_CheckoutCatalogueAsGuest {
	private static WebDriver driver = null;

	@Test(groups = { "p0" })
	public void testCheckoutCatalogueAsGuest() throws Exception {

		OrderCatalogue.addToBasket(driver);
		HeaderAction.goBasket(driver);
		BasketAction.checkoutOnBottom(driver);
		WF03GuestRegisterOrLoginAction.ContinueAsGuest(driver);
		WF33aShippingAddressGuestAction.inputDetails(driver);
		WF33aShippingAddressGuestAction.ContinueToShippingMethod(driver);
		WF36OrderSummaryForSampleAction.checkTandC(driver);
		WF36OrderSummaryForSampleAction.placeOrder(driver);
		// WF37PaymentAction.placeOrder(driver);
		WF38OrderConfirmationAction.CheckOrderComplete(driver);
		assertTrue("Order Complete page is not displayed",
				WF38OrderConfirmation.get_element_OrderComplete(driver)
						.isDisplayed());

	}


	@BeforeClass(groups = { "p0", "p1", "p2", "p3" })
	@Parameters({ "localSite", "browserType", "siteEnv" })
	public void beforeClass(String localSite, String browserType, String siteEnv)
			throws Exception {
		DataLoader Constant = new DataLoader();
		System.out.println("BeforeClass of "+ Utils.getTestCaseName(this.toString()));
		Constant.localSite = localSite;
		Constant.siteEnv = siteEnv;
		DOMConfigurator.configure(Constant.get_LOG_CONFIGURE_XML());
		Log.startTestCase(Utils.getTestCaseName(this.toString()));	
		driver = Utils.openBrowserByURL(browserType, Constant.get_CATALOGUEURL());
	}

	@AfterClass (groups = {"p0","p1","p2","p3"})
	public void afterClass() throws Exception {
		System.out.println("AfterClass of "+ Utils.getTestCaseName(this.toString()));
		driver.quit();
	}
}
