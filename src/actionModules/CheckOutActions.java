package actionModules;

import static org.testng.AssertJUnit.assertTrue;

import org.openqa.selenium.WebDriver;

import pageObjects.Overlay;
import pageObjects.PIPpage;
import pageObjects.WF38OrderConfirmation;

public class CheckOutActions {
	public static void addSampleToBasket(WebDriver driver, String PIPurl, int quantity){
		
		driver.navigate().to(PIPurl);
		PIPAction.orderSample(driver);
		if(Overlay.get_text_Title(driver).contains("Confirm Sample Quantity"))
		{
		SampleAmendQuantityOverlayAction.selectQuantiy(driver, String.valueOf(quantity));
		SampleAmendQuantityOverlayAction.orderSample(driver);
		}
		SampleConfirmationOverlayAction.continueShopping(driver);
			
	}
	
	public static void addStdToBasket(WebDriver driver, String PIPurl, int quantity){
		
		driver.navigate().to(PIPurl);
		if (PIPAction.isFullPackOnly(driver)){
			int packSize = PIPpage.value.get_PackSize(driver);

			PIPAction.addToBasket(driver, quantity*packSize);
		}
		
		else 
			PIPAction.addToBasket(driver, quantity);
			AddBasketOverlayAction.continueShopping(driver);
			
	}
	
public static void checkOutNonFreeUsingCard(WebDriver driver) throws Exception {
	HeaderAction.goBasket(driver);
	BasketAction.checkoutOnBottom(driver);
	WF03GuestRegisterOrLoginAction.ContinueAsGuest(driver);
	if(!(HeaderAction.isLogin(driver))){
		WF33aShippingAddressGuestAction.inputDetails(driver);
		WF33aShippingAddressGuestAction.ContinueToShippingMethod(driver);
	}
	else{
		WF33ShippingAddressAction.ContinueToShippingMethod(driver);
	}
		
	
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

	
}
