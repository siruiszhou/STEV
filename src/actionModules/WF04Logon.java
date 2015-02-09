package actionModules;

import org.openqa.selenium.WebDriver;


import pageObjects.WF04_Register_Login;
import utility.DataLoader;

public class WF04Logon {

	public static void Logon(WebDriver driver){
		DataLoader Constant =new DataLoader();
		WF04_Register_Login.field.get_field_Emailaddress(driver).sendKeys(Constant.get_logonid());
		WF04_Register_Login.field.get_field_Password(driver).sendKeys(Constant.get_password());
		WF04_Register_Login.button.get_buttton_login(driver).click();
	}
	public static void LogonParent(WebDriver driver){
		DataLoader Constant =new DataLoader();
		WF04_Register_Login.field.get_field_Emailaddress(driver).sendKeys(Constant.get_ParentCompany());
		WF04_Register_Login.field.get_field_Password(driver).sendKeys(Constant.get_password());
		WF04_Register_Login.button.get_buttton_login(driver).click();
	}
	public static void LogonEmail(WebDriver driver,String Email){
		DataLoader Constant =new DataLoader();
		WF04_Register_Login.field.get_field_Emailaddress(driver).sendKeys(Email);
		WF04_Register_Login.field.get_field_Password(driver).sendKeys(Constant.get_password());
		WF04_Register_Login.button.get_buttton_login(driver).click();
	}
}
