package testCases;

import static org.testng.AssertJUnit.assertTrue;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.Assert.*;

import pageObjects.Homepage;
import pageObjects.Overlay;
import pageObjects.WF03a_Personal_Company_Join_Registration;
import pageObjects.WF04_Register_Login;
import pageObjects.PIPpage;
import pageObjects.WF38OrderConfirmation;
import utility.DataLoader;
import utility.Log;
import utility.Utils;
import actionModules.*;
import actionModules.myAccountPageActions.MyAccountAddressSectionAction;
import actionModules.myAccountPageActions.MyAccountLHNActions;


//Created By Simba Ji
public class EssentraSmoke40_AddAddressFromMyAccount {
	private static WebDriver driver = null;

	@Test (groups = {"p0"})
	public void testAddAddressFromMyAccount() throws Exception{
		HeaderAction.goLoginPage(driver);
		WF04Logon.Logon(driver);
		HeaderAction.goMyAccount(driver);
	    MyAccountLHNActions.goDeliveryAddresses(driver);
	    MyAccountAddressSectionAction.addNewAddress(driver);
	    Assert.assertTrue(MyAccountAddressSectionAction.verifyAddress1(driver));
	    Assert.assertTrue(MyAccountAddressSectionAction.verifyAddress2(driver));
	    Assert.assertTrue(MyAccountAddressSectionAction.verifyCity(driver));
	    Assert.assertTrue(MyAccountAddressSectionAction.verifyCompanyName(driver));
	    Assert.assertTrue(MyAccountAddressSectionAction.verifyFirstName(driver));
	    Assert.assertTrue(MyAccountAddressSectionAction.verifyLastName(driver));
	    Assert.assertTrue(MyAccountAddressSectionAction.verifyPostCode(driver));
	    Assert.assertTrue(MyAccountAddressSectionAction.verifyTitle(driver));
	   
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
