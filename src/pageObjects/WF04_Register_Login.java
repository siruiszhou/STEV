package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class WF04_Register_Login {
	
	private static WebElement element = null;

	public static class button{
		public static WebElement get_buttton_register(WebDriver driver){
			element = driver.findElement(By.linkText("Register"));
			Log.info("register button element found");
			return element;
		}
		public static WebElement get_buttton_login(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='loginForm']/div[3]/div/button"));
			Log.info("login button element found");
			return element;
		}
	}
	public static class field{
		public static WebElement get_field_Emailaddress(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='WC_AccountDisplay_FormInput_logonId_In_Logon_1']"));
			Log.info("Email Address element found");
			return element;
		}
		public static WebElement get_field_Password(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='WC_AccountDisplay_FormInput_logonPassword_In_Logon_1']"));
			Log.info("Password element found");
			return element;
		}
		public static WebElement get_field_Forgot(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='loginForm']/div[3]/div/a"));
			Log.info("Password element found");
			return element;
		}
		public static WebElement get_field_LoginFailed(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='logonErrorMessage']"));
			Log.info("Logon Error element found");
			return element;
		}
	}

}


//.xpath(".//*[@id='WC_AccountDisplay_div_19']/div[1]/div/a']"));