package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class WF03b_New_Company_Registration_PersonalDetails {
	private static WebElement element = null;

	public static class field{
		public static WebElement get_field_title(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='regForm']/div[1]/fieldset[1]/div[1]/div/select/option[2]"));
			Log.info("Title field found");
			return element;
		}
		public static WebElement get_field_firstname(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='regForm']/div[1]/fieldset[1]/div[2]/div[1]/div/input"));
			Log.info("First Name field found");
			return element;
		}
		public static WebElement get_field_lastname(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='regForm']/div[1]/fieldset[1]/div[2]/div[2]/div/input"));
			Log.info("Last Name field found");
			return element;
		}
		public static WebElement get_field_jobtitle(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='regForm']/div[1]/fieldset[1]/div[3]/div/input"));
			Log.info("Job Title field found");
			return element;
		}
		public static WebElement get_field_companyrole(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='regForm']/div[1]/fieldset[1]/div[4]/div/select"));
			Log.info("Company Role field found");
			return element;
		}
		public static WebElement get_field_emailadderss(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='regForm']/div[1]/fieldset[1]/div[5]/div/input"));
			Log.info("Email Address field found");
			return element;
		}
		public static WebElement get_field_Pemailadderss(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='regForm']/div[1]/fieldset[1]/div[3]/div/input"));
			Log.info("Email Address field found");
			return element;
		}
		public static WebElement get_field_repeatemail(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='regForm']/div[1]/fieldset[1]/div[6]/div/input"));
			Log.info("Repeat Email Address field found");
			return element;
		}
		public static WebElement get_field_Prepeatemail(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='regForm']/div[1]/fieldset[1]/div[4]/div/input"));
			Log.info("Repeat Email Address field found");
			return element;
		}
		public static WebElement get_field_primaryphone(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='regForm']/div[1]/fieldset[1]/div[7]/div/div[2]/input"));
			Log.info("Primary Phone field found");
			return element;
		}
		public static WebElement get_field_Pprimaryphone(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='regForm']/div[1]/fieldset[1]/div[5]/div/div[2]/input"));
			Log.info("Primary Phone field found");
			return element;
		}
		public static WebElement get_field_secondaryphone(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='regForm']/div[1]/fieldset[1]/div[8]/div/div[2]/input"));
			Log.info("Secondary Phone field found");
			return element;
		}
		public static WebElement get_field_Psecondaryphone(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='regForm']/div[1]/fieldset[1]/div[6]/div/div[2]/input"));
			Log.info("Secondary Phone field found");
			return element;
		}
		public static WebElement get_field_preferredlanguage(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='regForm']/div[1]/fieldset[1]/div[9]/div/select"));
			Log.info("Preferred Language field found");
			return element;
		}
		public static WebElement get_field_newpassword(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='regForm']/div[1]/fieldset[2]/div[1]/div/input"));
			Log.info("New Password field found");
			return element;
		}
		public static WebElement get_field_Pnewpassword(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='regForm']/div[1]/fieldset[2]/div[1]/div/input"));
			Log.info("New Password field found");
			return element;
		}
		public static WebElement get_field_repeatpassword(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='regForm']/div[1]/fieldset[2]/div[2]/div/input"));
			Log.info("Repeat Password field found");
			return element;
		}
		public static WebElement get_field_Prepeatpassword(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='regForm']/div[1]/fieldset[2]/div[2]/div/input"));
			Log.info("Repeat Password field found");
			return element;
		}
		public static WebElement get_field_optin_email(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='regForm']/div[1]/fieldset[3]/div/div/label[1]/input"));
			Log.info("Optin Email field found");
			return element;
		}
		public static WebElement get_field_optin_phone(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='regForm']/div[1]/fieldset[3]/div/div/label[2]/input"));
			Log.info("Optin Phone field found");
			return element;
		}
		public static WebElement get_field_optin_fax(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='regForm']/div[1]/fieldset[3]/div/div/label[3]/input"));
			Log.info("Optin Fax field found");
			return element;
		}
		public static WebElement get_field_optin_post(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='regForm']/div[1]/fieldset[3]/div/div/label[4]/input"));
			Log.info("Optin Post field found");
			return element;
		}
	}
	public static class button{
		public static WebElement get_button_continue(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='regForm']/div[1]/div[2]/div/a"));
			Log.info("Continue Button found");
			return element;
		}
}
}
