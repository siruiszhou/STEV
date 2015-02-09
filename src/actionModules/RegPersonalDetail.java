package actionModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.WF03b_New_Company_Registration_PersonalDetails;
import pageObjects.WF03c_New_Company_Registration_CompanyDetails;
import utility.Log;

public class RegPersonalDetail{
	public static void InputDetails(WebDriver driver, String name){
		 //WebDriverWait wait = new WebDriverWait(driver, 30);
		
		 WF03b_New_Company_Registration_PersonalDetails.field.get_field_title(driver).click();
		 WF03b_New_Company_Registration_PersonalDetails.field.get_field_firstname(driver).sendKeys("Ethan");
		 WF03b_New_Company_Registration_PersonalDetails.field.get_field_lastname(driver).sendKeys("Zhou");
		 WF03b_New_Company_Registration_PersonalDetails.field.get_field_jobtitle(driver).sendKeys("Tester");
		 WF03b_New_Company_Registration_PersonalDetails.field.get_field_companyrole(driver).isDisplayed();
		 WF03b_New_Company_Registration_PersonalDetails.field.get_field_emailadderss(driver).sendKeys(name);
		 WF03b_New_Company_Registration_PersonalDetails.field.get_field_repeatemail(driver).sendKeys(name);
		 WF03b_New_Company_Registration_PersonalDetails.field.get_field_primaryphone(driver).sendKeys("1234567890");
		 WF03b_New_Company_Registration_PersonalDetails.field.get_field_newpassword(driver).sendKeys("1234qwer");
		 WF03b_New_Company_Registration_PersonalDetails.field.get_field_repeatpassword(driver).sendKeys("1234qwer");
		 WF03b_New_Company_Registration_PersonalDetails.button.get_button_continue(driver).click();
		 		 
    
	}
}
