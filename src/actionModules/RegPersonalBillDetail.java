package actionModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.WF03b_New_Company_Registration_PersonalDetails;
import pageObjects.WF03c_New_Company_Registration_CompanyDetails;
import utility.DataLoader;
import utility.Log;

public class RegPersonalBillDetail{
	public static void InputDetails(WebDriver driver){
		DataLoader Constant =new DataLoader();
		 //WebDriverWait wait = new WebDriverWait(driver, 30);
		 WF03c_New_Company_Registration_CompanyDetails.field.get_field_Pcountry(driver).click();
		 //WF03c_New_Company_Registration_CompanyDetails.field.get_field_Pcountry(driver).sendKeys("uu");
		 WF03c_New_Company_Registration_CompanyDetails.field.get_field_Pstreet1(driver).sendKeys("test street1");
		 WF03c_New_Company_Registration_CompanyDetails.field.get_field_Pcity(driver).sendKeys("test city");
		 WF03c_New_Company_Registration_CompanyDetails.field.get_field_county(driver).click();
		 //WF03c_New_Company_Registration_CompanyDetails.field.get_field_county(driver).sendKeys("l");
		 WF03c_New_Company_Registration_CompanyDetails.field.get_field_postcode(driver).sendKeys(Constant.get_POSTCODE());
		 WF03c_New_Company_Registration_CompanyDetails.field.get_field_companyphone(driver).sendKeys("1234567");
		 WF03c_New_Company_Registration_CompanyDetails.field.get_field_Pconfirmterm(driver).click();
		 
		 
		 WF03c_New_Company_Registration_CompanyDetails.button.get_button_Pcreateaccount(driver).click();
		 
    
	}
}