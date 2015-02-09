package testCases;

import static org.testng.AssertJUnit.assertTrue;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.BasketPage;
import pageObjects.Homepage;
import pageObjects.WF03a_Personal_Company_Join_Registration;
import pageObjects.WF04_Register_Login;
import pageObjects.PIPpage;
import pageObjects.WF38OrderConfirmation;
import utility.DataLoader;
import utility.Log;
import utility.Utils;
import actionModules.*;

//Created By Ethan Zhou
public class EssentraSmoke39_Promotion {
	private static WebDriver driver = null;

	@Test (groups = {"p0"})
	public void testInvaildPromoCode() throws Exception{
		DataLoader Constant = new DataLoader();
		PIPAction.addToBasket(driver, 32);
		AddBasketOverlayAction.viewBasket(driver);
		BasketPage.button.get_button_EnterPromoCode(driver).click();
		BasketPage.button.get_field_PromoCode(driver).sendKeys(Constant.get_InvalidPromoCode());
		BasketPage.button.get_button_SavePromoCode(driver).click();
		Thread.sleep(5000);
		assertTrue(BasketPage.button.get_filed_waringpromocode(driver).getText().contains(Constant.get_InvalidPromoCode()));
		BasketPage.button.get_button_tryotherpromocode(driver).click();
	}
		
	@Test (groups = {"p0"})
	public void testUnqulifiedPromoCode() throws Exception{
		DataLoader Constant = new DataLoader();
		BasketPage.button.get_field_PromoCode(driver).clear();
		BasketPage.button.get_field_PromoCode(driver).sendKeys(Constant.get_tenPerOffPromoCode());
		BasketPage.button.get_button_SavePromoCode(driver).click();
		Thread.sleep(6000);
		System.out.println("message is: "+BasketPage.button.get_filed_waringpromocode(driver).getText());
		assertTrue(BasketPage.button.get_filed_waringpromocode(driver).getText().equals("The promotion code you have entered could not be processed. Please check the qualifying conditions for this promotion."));
		BasketPage.button.get_button_tryotherpromocode(driver).click();
	}
	
	@Test (groups = {"p0"})
	public void testvalidPromoCodeandCheckout() throws Exception{
		DataLoader Constant = new DataLoader();
		BasketPage.button.get_field_PromoCode(driver).clear();
		BasketPage.button.get_field_PromoCode(driver).sendKeys(Constant.get_tenDorOffPromoCode());
		BasketPage.button.get_button_SavePromoCode(driver).click();
		String Subtotal = BasketPage.button.get_field_subtotal(driver).getText().replace("$", "").trim();
		String Totalcost = BasketPage.button.get_field_totalcost(driver).getText().replace("$", "").trim();
		Float SubtotalN = Float.parseFloat(Subtotal);
		Float TotalcostN = Float.parseFloat(Totalcost);
		//System.out.println();
		assertTrue(SubtotalN - TotalcostN== 5);
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
		System.out.println(WF38OrderConfirmation.get_element_PromotionDiscount(driver).getText());
		assertTrue(WF38OrderConfirmation.get_element_PromotionDiscount(driver).getText().equals("$5.00"));
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
