package actionModules;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.lang.Long;

import pageObjects.*;
import utility.DataLoader;
import utility.Utils;

public class WF33aShippingAddressGuestAction {
	public static void inputDetails(WebDriver driver) throws InterruptedException{
		DataLoader Constant =new DataLoader();
		String timestamp = Utils.GenerateEmailPostFix();
		String email = "guest@"+timestamp+".com";

		WF33aShippingAddressGuest.field.get_field_Title(driver).click();
		WF33aShippingAddressGuest.field.get_field_Title(driver).sendKeys("m");
		WF33aShippingAddressGuest.field.get_field_Firstname(driver).sendKeys("Simba");
		WF33aShippingAddressGuest.field.get_field_Lastname(driver).sendKeys("Ji");
		WF33aShippingAddressGuest.field.get_field_Jobtitle(driver).sendKeys("Test Job Title");
		WF33aShippingAddressGuest.field.get_field_Emailadderss(driver).sendKeys(email);
		WF33aShippingAddressGuest.field.get_field_CountryCode(driver).click();
		WF33aShippingAddressGuest.field.get_field_CountryCode(driver).sendKeys(Keys.ARROW_DOWN);
		WF33aShippingAddressGuest.field.get_field_CountryCode(driver).sendKeys(Keys.ENTER);
		WF33aShippingAddressGuest.field.get_field_phone(driver).sendKeys("123456789");
		WF33aShippingAddressGuest.field.get_field_CompanyName(driver).sendKeys("Guest Company name");
		WF33aShippingAddressGuest.field.get_field_Country(driver).click();
		Thread.sleep(3000);
		WF33aShippingAddressGuest.field.get_field_Address1(driver).sendKeys("Guest Address1");
		WF33aShippingAddressGuest.field.get_field_Address2(driver).sendKeys("Guest Address2");
		WF33aShippingAddressGuest.field.get_field_City(driver).sendKeys("Guest City");
		WF33aShippingAddressGuest.field.get_field_County(driver).click();
		WF33aShippingAddressGuest.field.get_field_PostCode(driver).sendKeys(Constant.get_POSTCODE());
		}		

	public static void ContinueToShippingMethod(WebDriver driver){
		WF33aShippingAddressGuest.button.get_button_ContinueToShipping(driver).click();
	}
	
	private static boolean isCountryLoaded(WebDriver driver ){
		boolean countryLoaded = false;
		if (utility.Utils.isElementPresent(By.xpath(".//option[@value='GB']")))
			countryLoaded = true;
		else {
			System.out.println("country cannot be loaded on ADDRESS page");
		}
		return countryLoaded;
	}
	private static boolean isCountyLoaded(WebDriver driver ){
		boolean countyLoaded = false;
		if (utility.Utils.isElementPresent(By.xpath(".//option[@value='OX']")))
			countyLoaded = true;
		else {
			System.out.println("county cannot be loaded on ADDRESS page");
		}
		return countyLoaded;
	}
}
