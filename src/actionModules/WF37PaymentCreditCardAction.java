package actionModules;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.DataLoader;
import utility.Utils;
import pageObjects.*;

public class WF37PaymentCreditCardAction {
	public static void CheckUseDeliveryAddress(WebDriver driver){
		if(!WF37PaymentCreditCard.field.get_field_UseDeliveryAddr(driver).isSelected())
			WF37PaymentCreditCard.field.get_field_UseDeliveryAddr(driver).click();
	}
	public static void ConfirmAddressAndWaitForDataCash(WebDriver driver){
		
		WF37PaymentCreditCard.button.get_button_ConfirmAddress(driver).click();	
		WF37PaymentCreditCardAction.isCardFieldsLoaded(driver);
		
	}
	public static void ConfirmAddressAsLoginAndWaitForDataCash(WebDriver driver){
		
		WF37PaymentCreditCard.button.get_button_ConfirmAddressForLogin(driver).click();	
		WF37PaymentCreditCardAction.isCardFieldsLoaded(driver);
		
	}
	public static void EnterCardAddress(WebDriver driver){
		DataLoader Constant =new DataLoader();
		WF37PaymentCreditCard.field.get_field_Address1(driver).sendKeys("Street1");
		WF37PaymentCreditCard.field.get_field_Address2(driver).sendKeys("Street2");
		WF37PaymentCreditCard.field.get_field_City(driver).sendKeys("City");
		WF37PaymentCreditCard.field.get_field_PostCode(driver).sendKeys(Constant.get_POSTCODE());
		
		WF37PaymentCreditCard.field.get_field_Country(driver).click();
					
	}
	
	public static void EnterCardDetails(WebDriver driver){
		DataLoader Constant =new DataLoader();
		WF37PaymentCreditCard.DataCashElements.get_field_CardNum(driver).sendKeys(Constant.get_CreditCardNum());
		WF37PaymentCreditCard.DataCashElements.get_field_ExpMonthJan(driver).click();
		WF37PaymentCreditCard.DataCashElements.get_field_ExpYearFirst(driver).click();
		WF37PaymentCreditCard.DataCashElements.get_field_CVNum(driver).sendKeys(Constant.get_CreditCardCVS());
		WF37PaymentCreditCard.DataCashElements.get_button_Continue(driver).click();
		
		}
					
	
	
	private static boolean isCountryLoaded(WebDriver driver ){
		boolean countryLoaded = false;
		if (utility.Utils.isElementPresent(By.xpath(".//option[@value='US']")) && utility.Utils.isElementPresent(By.xpath(".//option[@value='GB']")))
			countryLoaded = true;
		else {
			System.out.println("country cannot be loaded on payment page");
		}
		return countryLoaded;
	}
	
	private static boolean isCardFieldsLoaded(WebDriver driver ){
		boolean cardFieldsLoaded = false;
		if (utility.Utils.isElementPresentWaitLong(driver, By.xpath(".//iframe[@id='cardPayment']")))
			cardFieldsLoaded = true;
		else {
			System.out.println("card fields cannot be loaded on payment page");
		}
		return cardFieldsLoaded;
	}
}
