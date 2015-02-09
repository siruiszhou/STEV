package testCases;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.myAccountPageObjects.MyAccountDetailsSection;
import pageObjects.myAccountPageObjects.MyOrdersSection;
import utility.DataLoader;
import utility.Log;
import utility.Utils;
import actionModules.HeaderAction;
import actionModules.WF04Logon;
import actionModules.myAccountPageActions.MyAccountLHNActions;
import actionModules.myAccountPageActions.MyAccountOverviewActions;

//Created By Simba Ji
public class EssentraSmoke27_myAccountOverviewNavigation {
	private static WebDriver driver = null;

	@Test (groups = {"p0"})
	public void testMyAccountOverviewNavigation() throws Exception{
		//*********Step2*********
		HeaderAction.goLoginPage(driver);
		WF04Logon.Logon(driver);
		HeaderAction.goMyAccount(driver);
		MyAccountOverviewActions.goOpenOrders(driver);
		assertEquals(MyOrdersSection.getCurrentOrderList(driver),"Open Orders","Open Orders tab is not displayed.");
		MyAccountLHNActions.goAccountOverview(driver);
		MyAccountOverviewActions.goSavedBaskets(driver);
		assertEquals(MyOrdersSection.getCurrentOrderList(driver),"Saved Baskets","Saved Baskets tab is not displayed.");
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
