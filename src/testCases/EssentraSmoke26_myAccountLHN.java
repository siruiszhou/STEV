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
import pageObjects.myAccountPageObjects.MyAccountDetailsSection;
import pageObjects.myAccountPageObjects.MyAccountOverviewSection;
import pageObjects.myAccountPageObjects.MyDeliveryAddressesSection;
import pageObjects.myAccountPageObjects.MyOrdersSection;
import pageObjects.myAccountPageObjects.MyProductSampleSection;
import actionModules.HeaderAction;
import actionModules.WF04Logon;
import actionModules.myAccountPageActions.MyAccountLHNActions;
import utility.DataLoader;
import utility.Log;
import utility.Utils;

//Created By Simba Ji
public class EssentraSmoke26_myAccountLHN {
	private static WebDriver driver = null;

	@Test (groups = {"p0"})
	public void testMyAccountLHN() throws Exception{
		//*********Step2*********
		HeaderAction.goLoginPage(driver);
		WF04Logon.Logon(driver);
		HeaderAction.goMyAccount(driver);
		assertTrue("Welcome back text is not displayed.",MyAccountOverviewSection.get_Text_Welcome(driver).isDisplayed());
	    MyAccountLHNActions.goMyOrders(driver); 
	    assertTrue("My Orders title is not displayed.",MyOrdersSection.getMyOrdersTitle(driver).isDisplayed());
	    MyAccountLHNActions.goProductSamples(driver);
	    assertTrue("Product Sample title is not displayed.",MyProductSampleSection.getProductSamplesTitle(driver).isDisplayed());
	    MyAccountLHNActions.goDeliveryAddresses(driver);
	    assertTrue("Delivery Address title is not displayed.",MyDeliveryAddressesSection.getDeliveryAddressTitle(driver).isDisplayed());
	    MyAccountLHNActions.goAccountDetails(driver);
	    assertTrue("AccountDetails title is not displayed.", MyAccountDetailsSection.getAccountDetailTitle(driver).isDisplayed());
	    MyAccountLHNActions.goManageUsers(driver);
	    assertEquals(MyAccountDetailsSection.getCurrentTab(driver),"Manage Users","AccountDetails title is not displayed.");

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
