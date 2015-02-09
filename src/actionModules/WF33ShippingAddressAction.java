package actionModules;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.lang.Long;

import pageObjects.*;
import utility.Utils;

public class WF33ShippingAddressAction {
	public static void inputDetails(WebDriver driver, String name){
		
		String timestamp = Utils.GenerateEmailPostFix();
		String email = "sj@"+timestamp+".com";
		WF33ShippingAddress.field.get_field_Title(driver).click();
		WF33ShippingAddress.field.get_field_Title(driver).sendKeys("m");
		WF33ShippingAddress.field.get_field_Firstname(driver).sendKeys("Simba");
		WF33ShippingAddress.field.get_field_Lastname(driver).sendKeys("Ji");
		WF33ShippingAddress.field.get_field_Jobtitle(driver).sendKeys("Test Job Title");
		WF33ShippingAddress.field.get_field_Emailadderss(driver).sendKeys(email);
		WF33ShippingAddress.field.get_field_CountryCode(driver).click();
		WF33ShippingAddress.field.get_field_CountryCode(driver).sendKeys(Keys.ARROW_DOWN);
		WF33ShippingAddress.field.get_field_CountryCode(driver).sendKeys(Keys.ENTER);
		WF33ShippingAddress.field.get_field_phone(driver).sendKeys("123456789");
		WF33ShippingAddress.field.get_field_CompanyName(driver).sendKeys(" Company name");
		if (isCountryLoaded(driver))
		{
			WF33ShippingAddress.field.get_field_Country(driver).click();
			WF33ShippingAddress.field.get_field_Country_UK(driver).click();
		}

		WF33ShippingAddress.field.get_field_Address1(driver).sendKeys(" Address1");
		WF33ShippingAddress.field.get_field_Address2(driver).sendKeys(" Address2");
		WF33ShippingAddress.field.get_field_City(driver).sendKeys(" City");
		if (isCountyLoaded(driver))
		{
		WF33ShippingAddress.field.get_field_County(driver).click();
		WF33ShippingAddress.field.get_field_County(driver).sendKeys(Keys.ARROW_DOWN);
		WF33ShippingAddress.field.get_field_County(driver).sendKeys(Keys.ENTER);
		}
		WF33ShippingAddress.field.get_field_PostCode(driver).sendKeys("OX5 3HF");
				
	}
	public static void ContinueToShippingMethod(WebDriver driver){
		WF33ShippingAddress.button.get_button_ContinueToShipping(driver).click();
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
