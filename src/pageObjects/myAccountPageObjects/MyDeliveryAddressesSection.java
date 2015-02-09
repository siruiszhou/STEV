package pageObjects.myAccountPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.DataLoader;
import utility.Log;

public class MyDeliveryAddressesSection {
private static WebElement element = null;
	
	
public static WebElement getDeliveryAddressTitle(WebDriver driver){

	element = driver.findElement(By.xpath(".//h1[text()='Saved Delivery Address']"));
	return element;
}

public static WebElement get_button_addNewAddress(WebDriver driver){

	element = driver.findElement(By.xpath(".//li[@class='addNew']/a"));
	return element;
}

public static WebElement get_button_SaveAddress(WebDriver driver){

	element = driver.findElement(By.xpath(".//button[text()='Save this Address']"));
	return element;
}

public static WebElement get_NewAddress(WebDriver driver){

	element = driver.findElement(By.xpath(".//*[@id='shippingAddress']/div/ul[2]/li[2]/p"));
	return element;
}

public static WebElement get_NewCompName(WebDriver driver){

	element = driver.findElement(By.xpath(".//*[@id='shippingAddress']/div/ul[2]/li[2]/h5"));
	return element;
}

public static class field{
	public static WebElement get_field_Title(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='shippingAddress']//select[@name='personTitle']"));
		Log.info("title field found on MyDeliveryAddressesSection");
		return element;
	}
	
	public static WebElement get_field_TitleOption(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='shippingAddress']//select[@name='personTitle']/option[2]"));
		Log.info("title field found on MyDeliveryAddressesSection");
		return element;
	}
	public static WebElement get_field_Firstname(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='firstName']"));
		Log.info("first name field found on MyDeliveryAddressesSection");
		return element;
	}
	public static WebElement get_field_Lastname(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='lastName']"));
		Log.info("last name field found on MyDeliveryAddressesSection");
		return element;
	}

	
	public static WebElement get_field_CountryCodeOne(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='shippingAddress']//select[@name='country_code_phone_1']/option[2]"));
		Log.info("Country code field found on MyDeliveryAddressesSection");
		return element;
	}
	public static WebElement get_field_phone(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='phone1']"));
		Log.info("Phone field found on MyDeliveryAddressesSection");
		return element;
	}
	public static WebElement get_field_CompanyName(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='inputCompanyName']"));
		Log.info("Company Name field found on MyDeliveryAddressesSection");
		return element;
	}
	public static WebElement get_field_Country(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='shippingAddress']//select[@name='country']"));
		Log.info("Country field found on MyDeliveryAddressesSection");
		return element;
	}
	public static WebElement get_field_CountryOption(WebDriver driver){
		DataLoader Constant =new DataLoader();
		element = driver.findElement(By.xpath(Constant.get_Country()));
		Log.info("Country field found on MyDeliveryAddressesSection");
		return element;
	}

	public static WebElement get_field_Address1(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='address1']"));
		Log.info("Address1 field found on MyDeliveryAddressesSection");
		return element;
	}
	public static WebElement get_field_Address2(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='address2']"));
		Log.info("Address2 field found on MyDeliveryAddressesSection");
		return element;
	}
	public static WebElement get_field_City(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='city']"));
		Log.info("City field found on MyDeliveryAddressesSection");
		return element;
	}
	public static WebElement get_field_County(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='shippingAddress']//select[@name='state']/option[2]"));
		Log.info("County field found on MyDeliveryAddressesSection");
		return element;
	}
	public static WebElement get_field_PostCode(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='postcode']"));
		Log.info("PostCode field found on MyDeliveryAddressesSection");
		return element;
	}
	
	

}
}
