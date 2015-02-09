package actionModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.Long;

import pageObjects.WF03b_New_Company_Registration_PersonalDetails;
import pageObjects.WF03c_New_Company_Registration_CompanyDetails;
import utility.DataLoader;
import utility.Log;

public class RegCompanyBillDetail{
	public static void InputDetails(WebDriver driver, String name) throws InterruptedException{
		DataLoader Constant =new DataLoader();
		 //WebDriverWait wait = new WebDriverWait(driver, 30);
		String companyname = "Company_"+name;
		 WF03c_New_Company_Registration_CompanyDetails.field.get_field_companyname(driver).sendKeys(companyname);
		 WF03c_New_Company_Registration_CompanyDetails.field.get_field_companyregnumber(driver).sendKeys(name);
		 WF03c_New_Company_Registration_CompanyDetails.field.get_field_novat(driver).click();
		 WF03c_New_Company_Registration_CompanyDetails.field.get_field_country(driver).click();
		Thread.sleep(3000);
		// WF03c_New_Company_Registration_CompanyDetails.field.get_field_country(driver).sendKeys("uu");
		 WF03c_New_Company_Registration_CompanyDetails.field.get_field_street1(driver).sendKeys("test street1");
		 WF03c_New_Company_Registration_CompanyDetails.field.get_field_city(driver).sendKeys("test city");
		 
		 WF03c_New_Company_Registration_CompanyDetails.field.get_field_county(driver).click();
		 //WF03c_New_Company_Registration_CompanyDetails.field.get_field_county(driver).sendKeys("l");
		 WF03c_New_Company_Registration_CompanyDetails.field.get_field_postcode(driver).sendKeys(Constant.get_POSTCODE());
		 WF03c_New_Company_Registration_CompanyDetails.field.get_field_companyphone(driver).sendKeys("1234567");
		 WF03c_New_Company_Registration_CompanyDetails.field.get_field_confirmterm(driver).click();
		 
		 
		 WF03c_New_Company_Registration_CompanyDetails.button.get_button_createaccount(driver).click();
		 
    
	}
}