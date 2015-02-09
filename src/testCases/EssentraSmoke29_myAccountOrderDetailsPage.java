package testCases;


import static org.testng.AssertJUnit.assertTrue;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.myAccountPageObjects.MyOrderDetailSection;
import actionModules.HeaderAction;
import actionModules.WF04Logon;
import actionModules.myAccountPageActions.MyAccountLHNActions;
import actionModules.myAccountPageActions.MyOrdersSectionAction;
import utility.DataLoader;
import utility.Log;
import utility.Utils;

//Created By Simba Ji
public class EssentraSmoke29_myAccountOrderDetailsPage {
	private static WebDriver driver = null;

	@Test (groups = {"p0"})
	public void testMyAccountMyOrdersOrderLists() throws Exception{
		//*********Step2*********
		HeaderAction.goLoginPage(driver);
		WF04Logon.Logon(driver);
		HeaderAction.goMyAccount(driver);
		MyAccountLHNActions.goMyOrders(driver);
		MyOrdersSectionAction.viewOrderDetails(driver, "2");
		assertTrue("Payment information title is not displayed.",MyOrderDetailSection.get_text_PaymentSectionTitle(driver).isDisplayed());
		assertTrue("Shipping information title is not displayed.",MyOrderDetailSection.get_text_ShippingInformationTitle(driver).isDisplayed());
		assertTrue("SKU Table title is not displayed.",MyOrderDetailSection.get_text_SKUTableTitle(driver).isDisplayed());
		MyOrderDetailSection.get_button_BackToOrders(driver).click();
	    HeaderAction.logout(driver);
	    //*********Step3*********

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
