package actionModules;

import static org.testng.AssertJUnit.assertTrue;

import org.openqa.selenium.WebDriver;

import pageObjects.WF03dFindCompany;
import pageObjects.WF03eCompanyMatch;
import utility.DataLoader;

public class FindCompanyDone {
	public static void CorrectCompanyInfo(WebDriver driver){
		DataLoader Constant =new DataLoader();
		WF03dFindCompany.field.get_field_Account(driver).clear();;
		WF03dFindCompany.field.get_field_PostCode(driver).clear();;		
		WF03dFindCompany.field.get_field_Account(driver).sendKeys(Constant.get_CorrectAccNum());
		WF03dFindCompany.field.get_field_PostCode(driver).sendKeys(Constant.get_CorrectPostcode());
		WF03dFindCompany.button.get_button_findcompany(driver).click();
		//assertTrue(WF03eCompanyMatch.field.get_field_CompanyName(driver).getText().equals(Constant.ParentName));
	}

}