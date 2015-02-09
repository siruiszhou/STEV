package testCases;

import static org.testng.AssertJUnit.assertTrue;
import static org.testng.Assert.*;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.AccountDetailsUpdatedOverlay;
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
import actionModules.myAccountPageActions.MyAccountAccountDetailsAction;
import actionModules.myAccountPageActions.MyAccountLHNActions;
import actionModules.myAccountPageActions.MyProductSampleSectionAction;
import utility.DataLoader;
import utility.Log;
import utility.Utils;

//Created By Simba Ji
public class EssentraSmoke32_myAccountUpdateAccountDetails {
	private static WebDriver driver = null;

	@Test (groups = {"p0"})
	public void testMyAccountUpdateAccountDetails() throws Exception{
		//*********Step2*********
		HeaderAction.goLoginPage(driver);
		WF04Logon.Logon(driver);
		HeaderAction.goMyAccount(driver);
		MyAccountLHNActions.goAccountDetails(driver);
		String newPhone = utility.Utils.GenerateEmailPostFix();
		MyAccountAccountDetailsAction.updateAccountPhone(driver,newPhone);
		assertTrue("Account details is Updated successfully.",driver.findElement(By.xpath(".//p[text()='Updates have been successfully applied.']")).isDisplayed());
		AccountDetailsUpdatedOverlay.button.get_button_Close(driver).click();
		MyAccountLHNActions.goAccountDetails(driver);
		assertEquals(MyAccountDetailsSection.field.get_field_Phone(driver).getAttribute("value"),newPhone);
		
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
