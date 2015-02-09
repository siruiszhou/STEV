package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.DataLoader;
import utility.Log;

public class WF03c_New_Company_Registration_CompanyDetails {
	private static WebElement element = null;

	public static class field{
		public static WebElement get_field_companyname(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='regForm']/div[2]/div[3]/fieldset/div[1]/div/input"));
			Log.info("Company Name found");
			return element;
		}
		public static WebElement get_field_companyregnumber(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='regForm']/div[2]/div[3]/fieldset/div[2]/div/input"));
			Log.info("Company Number found");
			return element;
		}
		public static WebElement get_field_vatnumber(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='regForm']/div[2]/div[3]/fieldset/div[3]/div/input"));
			Log.info("Vat Number found");
			return element;
		}
		public static WebElement get_field_novat(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='regForm']/div[2]/div[3]/fieldset/div[4]/label[1]/input"));
			Log.info("No Vat found");
			return element;
		}
		public static WebElement get_field_notax(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='regForm']/div[2]/div[3]/fieldset/div[4]/label[2]/input"));
			Log.info("No Tax found");
			return element;
		}
		public static WebElement get_field_country(WebDriver driver){
			DataLoader Constant =new DataLoader();
			element = driver.findElement(By.xpath(Constant.get_Country()));
			Log.info("Country field found");
			return element;
		}
		public static WebElement get_field_Pcountry(WebDriver driver){
			DataLoader Constant =new DataLoader();
			element = driver.findElement(By.xpath(Constant.get_Country()));
			Log.info("Country field found");
			return element;
		}
		public static WebElement get_field_street1(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='regForm']/div[2]/fieldset/div[2]/div[1]/div/input"));
			Log.info("Street1 field found");
			return element;
		}
		public static WebElement get_field_Pstreet1(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='regForm']/div[2]/fieldset/div[2]/div[1]/div/input"));
			Log.info("Street1 field found");
			return element;
		}
		public static WebElement get_field_street2(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='regForm']/div[2]/fieldset/div[2]/div[2]/div/input"));
			Log.info("Street2 field found");
			return element;
		}
		public static WebElement get_field_city(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='regForm']/div[2]/fieldset/div[2]/div[3]/div/input"));
			Log.info("Street2 field found");
			return element;
		}
		public static WebElement get_field_Pcity(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='regForm']/div[2]/fieldset/div[2]/div[3]/div/input"));
			Log.info("City field found");
			return element;
		}
		public static WebElement get_field_county(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='inputCounty']/option[2]"));
			Log.info("County field found");
			return element;
		}
		public static WebElement get_field_postcode(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='postcode']"));
			Log.info("Post Code field found");
			return element;
		}
		public static WebElement get_field_fax(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='regForm']/div[2]/fieldset/div[4]/div[1]/div/input"));
			Log.info("Fax field found");
			return element;
		}
		public static WebElement get_field_companyphone(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='regForm']/div[2]/fieldset/div[4]/div[2]/div/input"));
			Log.info("Company Number found");
			return element;
		}
		public static WebElement get_field_confirmterm(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='regForm']/div[2]/div[4]/div[1]/label/input"));
			Log.info("Confirm Term found");
			return element;
		}
		public static WebElement get_field_Pconfirmterm(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='regForm']/div[2]/div[3]/div[1]/label/input"));
			Log.info("Confirm Term found");
			return element;
		}
		public static WebElement get_field_createdtext(WebDriver driver){
			element = driver.findElement(By.cssSelector(".modal-header>h3"));
			Log.info("title field found");
			return element;
		}
	}
	public static class button{
		public static WebElement get_button_createaccount(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='regForm']/div[2]/div[4]/div[2]/button"));
			Log.info("Create Account button found");
			return element;
		}
		public static WebElement get_button_Pcreateaccount(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='regForm']/div[2]/div[3]/div[2]/button"));
			Log.info("Create Account button found");
			return element;
		}
		public static WebElement get_button_continueshopping(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='accountCreated']/div[3]/a"));
			Log.info("Continue Shopping button found");
			return element;
		}
		public static WebElement get_button_cancel(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='accountCreated']/div[1]/button"));
			Log.info("Cancel button found");
			return element;
		}
}
}