package actionModules;

import static org.testng.AssertJUnit.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.WF03b_New_Company_Registration_PersonalDetails;
import pageObjects.WF03c_New_Company_Registration_CompanyDetails;
import pageObjects.WF03eCompanyMatch;
import utility.DataLoader;
import utility.Log;
import utility.Utils;

public class RegJoinCompany{
	public static void InputDetails(WebDriver driver, String email, String firstname) throws Exception{
		DataLoader Constant =new DataLoader();
		 //WebDriverWait wait = new WebDriverWait(driver, 30);
		WF03eCompanyMatch.field.get_field_Title(driver).click();
		WF03eCompanyMatch.field.get_field_JobTitle(driver).click();
		WF03eCompanyMatch.field.get_field_FirstName(driver).sendKeys(firstname);
		WF03eCompanyMatch.field.get_field_LastName(driver).sendKeys("Zhou");
		WF03eCompanyMatch.field.get_field_JobTitle(driver).sendKeys("Tester");
		WF03eCompanyMatch.field.get_field_phonenumber(driver).sendKeys("88888888");
		WF03eCompanyMatch.field.get_field_email(driver).sendKeys(email);
		WF03eCompanyMatch.field.get_field_repemail(driver).sendKeys(email);
		WF03eCompanyMatch.field.get_field_password(driver).sendKeys(Constant.get_password());
		WF03eCompanyMatch.field.get_field_reppassword(driver).sendKeys(Constant.get_password());
		WF03eCompanyMatch.button.get_button_RequestJoin(driver).click();
//		System.out.println(WF03eCompanyMatch.field.get_field_requestsenttitle(driver).getText());
//		assertTrue(WF03eCompanyMatch.field.get_field_requestsenttitle(driver).getText().equals("Join request sent"));

		WF03eCompanyMatch.button.get_button_ContinueShopping(driver).click();

		
		 
		 
		 
    
	}
}