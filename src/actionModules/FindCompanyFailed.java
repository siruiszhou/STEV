package actionModules;

import static org.testng.AssertJUnit.assertTrue;

import org.openqa.selenium.WebDriver;

import pageObjects.WF03dFindCompany;
import utility.DataLoader;

public class FindCompanyFailed {
	public static void IncorrectCompanyInfo(WebDriver driver){
		DataLoader Constant =new DataLoader();
		WF03dFindCompany.field.get_field_Account(driver).clear();
		WF03dFindCompany.field.get_field_PostCode(driver).clear();
		WF03dFindCompany.field.get_field_Account(driver).sendKeys(Constant.get_CorrectAccNum());
		WF03dFindCompany.field.get_field_PostCode(driver).sendKeys(Constant.get_IncorrectPostcode());
		WF03dFindCompany.button.get_button_findcompany(driver).click();
		assertTrue(WF03dFindCompany.field.get_field_NotFoundTitle(driver).getText().equals("No matching companies found"));
	}

}
