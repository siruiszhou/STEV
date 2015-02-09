package testCases;

import static org.testng.AssertJUnit.assertTrue;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.Assert.*;

import pageObjects.AccountCreatedOverlay;
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
public class EssentraSmoke19_RegisterAfterCheckoutSampleAsGuest {
	private static WebDriver driver = null;

	@Test (groups = {"p0"})
	public void testRegisterAfterCheckoutSampleAsGuest() throws Exception{
		HeaderAction.goBasket(driver);
		BasketAction.clearBasket(driver);
		BasketAction.continueShopping(driver);
		PIPAction.orderSample(driver);
		SampleAmendQuantityOverlayAction.selectQuantiy(driver, "2");
		SampleAmendQuantityOverlayAction.orderSample(driver);
		SampleConfirmationOverlayAction.viewBasket(driver);
		BasketAction.checkoutOnBottom(driver);
		WF03GuestRegisterOrLoginAction.goRegister(driver);
		WF03a_Personal_Company_Join_Registration.button.get_buttton_mycompany(driver).click();
		String timestamp = Utils.GenerateEmailPostFix();
		String email = "Company@"+timestamp+"."+DataLoader.localSite;
		RegPersonalDetail.InputDetails(driver, email);
		RegCompanyBillDetail.InputDetails(driver, timestamp);

		AccountCreatedOverlay.button.get_button_ContinueShopping(driver).click();
		WF33ShippingAddressAction.ContinueToShippingMethod(driver);
		WF36OrderSummaryForSampleAction.checkTandC(driver);
		WF36OrderSummaryForSampleAction.placeOrder(driver);
		WF38OrderConfirmationAction.CheckOrderComplete(driver);
		assertTrue("Order Complete page is not displayed.",WF38OrderConfirmation.get_element_OrderComplete(driver).isDisplayed());
	    HeaderAction.logout(driver);
	   
	}


	@BeforeClass (groups = {"p0","p1","p2","p3"})
	@Parameters({"localSite","browserType","siteEnv"})
	public void beforeClass(String localSite, String browserType,String siteEnv) throws Exception {
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
