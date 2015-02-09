package actionModules;

import org.openqa.selenium.WebDriver;

import static org.testng.AssertJUnit.assertTrue;
import pageObjects.WF04_Register_Login;
import utility.DataLoader;

public class WF04LogonFailed {

	public static void Logon(WebDriver driver, String email){
		DataLoader Constant =new DataLoader();
		System.out.println("eamil is: "+email);
		WF04_Register_Login.field.get_field_Emailaddress(driver).sendKeys(email);
		WF04_Register_Login.field.get_field_Password(driver).sendKeys(Constant.get_password());
		WF04_Register_Login.button.get_buttton_login(driver).click();
		System.out.println( WF04_Register_Login.field.get_field_LoginFailed(driver).getText());
		assertTrue( WF04_Register_Login.field.get_field_LoginFailed(driver).getText().equals("We do not recognise the details you entered. Please try again."));
	}
	public static void LogonLock(WebDriver driver, String email){
		DataLoader Constant =new DataLoader();
		System.out.println("eamil is: "+email);
		WF04_Register_Login.field.get_field_Emailaddress(driver).sendKeys(email);
		WF04_Register_Login.field.get_field_Password(driver).sendKeys(Constant.get_password());
		WF04_Register_Login.button.get_buttton_login(driver).click();
		System.out.println( WF04_Register_Login.field.get_field_LoginFailed(driver).getText());
		assertTrue( WF04_Register_Login.field.get_field_LoginFailed(driver).getText().equals("Your account is locked. This is either due to a rejected registration request or due to 6 unsuccessful password attempts, you will be unable to logon. Contact a store representative to unlock your account."));
	}
}
