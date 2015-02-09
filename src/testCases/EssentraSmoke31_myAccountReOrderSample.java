package testCases;

import static org.testng.AssertJUnit.assertTrue;
import static org.testng.Assert.*;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.SampleAmendQuantityOverlay;
import pageObjects.SampleConfirmationOverlay;
import pageObjects.myAccountPageObjects.MyAccountDetailsSection;
import pageObjects.myAccountPageObjects.MyAccountOverviewSection;
import pageObjects.myAccountPageObjects.MyDeliveryAddressesSection;
import pageObjects.myAccountPageObjects.MyOrdersSection;
import pageObjects.myAccountPageObjects.MyProductSampleSection;
import actionModules.BasketAction;
import actionModules.HeaderAction;
import actionModules.WF04Logon;
import actionModules.myAccountPageActions.MyAccountLHNActions;
import actionModules.myAccountPageActions.MyProductSampleSectionAction;
import utility.DataLoader;
import utility.Log;
import utility.Utils;

//Created By Simba Ji
public class EssentraSmoke31_myAccountReOrderSample {
	private static WebDriver driver = null;

	@Test (groups = {"p0"})
	public void testMyAccountReOrderSample() throws Exception{
		//*********Step2*********
		HeaderAction.goLoginPage(driver);
		WF04Logon.Logon(driver);
		HeaderAction.goBasket(driver);
		BasketAction.clearBasket(driver);
		BasketAction.continueShopping(driver);
		HeaderAction.goMyAccount(driver);
		MyAccountLHNActions.goProductSamples(driver);
		String sampleName = MyProductSampleSection.value.get_value_SKUName(driver, 0);
		MyProductSampleSectionAction.reOrderSampleFromProductSample(driver, 0);

		
		if ((SampleConfirmationOverlay.values.get_value_overlayTitle(driver)) !="Sample Added to Basket")
		{
			SampleAmendQuantityOverlay.button.get_button_OrderSample(driver).click();
		}
		assertTrue("the sample is re-ordered successfully",SampleConfirmationOverlay.values.get_value_SKUName(driver).contains(sampleName));
		
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
