package pageObjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.seleniumhq.jetty7.util.log.Log;

public class WF03eCompanyMatch {
	private static WebElement element = null;
	
	public static class field{
	public static WebElement get_field_CompanyName (WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='RegisterWithExistedCompany']/div[1]/fieldset[1]/div/h4"));
		Log.info("Company Name field found");
		return element;
	}
	public static WebElement get_field_Title (WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='RegisterWithExistedCompany']/div[2]/fieldset[1]/div[1]/div/select/option[2]"));
		Log.info("Title field found");
		return element;
	}
	public static WebElement get_field_FirstName (WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='firstName']"));
		Log.info("First Name field found");
		return element;
	}
	public static WebElement get_field_LastName (WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='lastName']"));
		Log.info("Last Name field found");
		return element;
	}
	public static WebElement get_field_JobTitle (WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='jobTitleId']"));
		Log.info("Job Title field found");
		return element;
	}
	public static WebElement get_field_email (WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='email1']"));
		Log.info("Email field found");
		return element;
	}
	public static WebElement get_field_repemail (WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='email1Verify']"));
		Log.info("Repeat Email field found");
		return element;
	}
	public static WebElement get_field_phonenumber (WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='phone1_original']"));
		Log.info("Phone Number field found");
		return element;
	}
	public static WebElement get_field_password (WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='logonPassword']"));
		Log.info("Password field found");
		return element;
	}
	public static WebElement get_field_reppassword (WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='logonPasswordVerify']"));
		Log.info("Repeat Email field found");
		return element;
	}
	public static WebElement get_field_requestsenttitle (WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='accountCreated']/div[1]/h3"));
		Log.info("Join Request Sent overlay title field found");
		return element;
	}

	}
	
	public static class button{
		public static WebElement get_button_RequestJoin(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='RegisterWithExistedCompany']/div[2]/div[4]/div/button"));
			Log.info("Request Join button found");
			return element;
		}
		public static WebElement get_button_ContinueShopping(WebDriver driver){
			element = driver.findElement(By.xpath(".//div[contains(@id, 'modal')]/form[@id='accountCreated']//span[text()='Continue Shopping']"));
			Log.info("Continue Shopping button found");
			return element;
		}
	}
}
