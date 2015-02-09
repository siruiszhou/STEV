package actionModules.myAccountPageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageObjects.myAccountPageObjects.MyDeliveryAddressesSection;
import utility.DataLoader;
import utility.Utils;

public class MyAccountAddressSectionAction {
	private static String timestamp = Utils.GenerateEmailPostFix().substring(4);
	private static String stringOfTimestamp = Utils.alphabettimestamp(timestamp);	
	
	public static void addNewAddress(WebDriver driver) throws Exception{
		DataLoader Constant =new DataLoader();
		MyDeliveryAddressesSection.get_button_addNewAddress(driver).click();
		MyDeliveryAddressesSection.field.get_field_TitleOption(driver).click();
		MyDeliveryAddressesSection.field.get_field_Firstname(driver).sendKeys(stringOfTimestamp+"FN");
		MyDeliveryAddressesSection.field.get_field_Lastname(driver).sendKeys(stringOfTimestamp+"LN");
		MyDeliveryAddressesSection.field.get_field_CountryCodeOne(driver).click();
		MyDeliveryAddressesSection.field.get_field_phone(driver).sendKeys(timestamp);
		MyDeliveryAddressesSection.field.get_field_CompanyName(driver).sendKeys(stringOfTimestamp+"Company Name");
		MyDeliveryAddressesSection.field.get_field_CountryOption(driver).click();
		Thread.sleep(1000);
		MyDeliveryAddressesSection.field.get_field_Address1(driver).sendKeys(timestamp+"Address1");
		MyDeliveryAddressesSection.field.get_field_Address2(driver).sendKeys(timestamp+"Address2");
		MyDeliveryAddressesSection.field.get_field_City(driver).sendKeys(stringOfTimestamp+"City");
		MyDeliveryAddressesSection.field.get_field_County(driver).click();
		MyDeliveryAddressesSection.field.get_field_PostCode(driver).sendKeys(Constant.get_POSTCODE());
		MyDeliveryAddressesSection.get_button_SaveAddress(driver).click();		
	}

	public static int getNumOfAddress(WebDriver driver) throws Exception{
		
		return driver.findElements(By.xpath(".//*[@id='shippingAddress']/div/ul[2]/li")).size();
	}
	

	public static String getValueOfNewAddress(WebDriver driver) throws Exception{
		
		return MyDeliveryAddressesSection.get_NewAddress(driver).getText();
	}
	
	
	public static String getValueOfNewCompName(WebDriver driver) throws Exception{
		
		return MyDeliveryAddressesSection.get_NewCompName(driver).getText();
	}
	
	public static boolean verifyTitle(WebDriver driver) throws Exception{
		String valueOfaddress = getValueOfNewAddress(driver);
		return  valueOfaddress.contains("Mr.");
		}
	public static boolean verifyFirstName(WebDriver driver) throws Exception{
		return  getValueOfNewAddress(driver).contains(stringOfTimestamp+"FN");
		}
	public static boolean verifyLastName(WebDriver driver) throws Exception{
		return  getValueOfNewAddress(driver).contains(stringOfTimestamp+"LN");
		}
	public static boolean verifyCompanyName(WebDriver driver) throws Exception{
		return  getValueOfNewCompName(driver).contains(stringOfTimestamp+"Company Name");
		}	
	public static boolean verifyAddress1(WebDriver driver) throws Exception{
		String valueOfaddress = getValueOfNewAddress(driver);
		return  valueOfaddress.contains(timestamp+"Address1");
		}
	public static boolean verifyAddress2(WebDriver driver) throws Exception{
		return  getValueOfNewAddress(driver).contains(timestamp+"Address1");
		}
	public static boolean verifyCity(WebDriver driver) throws Exception{
		return  getValueOfNewAddress(driver).contains(stringOfTimestamp+"City");
		}
	public static boolean verifyPostCode(WebDriver driver) throws Exception{
		DataLoader Constant =new DataLoader();
		return  getValueOfNewAddress(driver).contains(Constant.get_POSTCODE());
		}
	
	
	
	
}
