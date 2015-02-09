package actionModules.myAccountPageActions;

import org.openqa.selenium.WebDriver;

import pageObjects.myAccountPageObjects.MyAccountDetailsSection;
import pageObjects.myAccountPageObjects.MyAccountProductList;
import pageObjects.myAccountPageObjects.MyOrdersSection;


public class MyAccountAccountDetailsAction {
	public static void updateAccountPhone(WebDriver driver, String phone){
		MyAccountDetailsSection.field.get_field_Phone(driver).clear();
		MyAccountDetailsSection.field.get_field_Phone(driver).sendKeys(phone);
		MyAccountDetailsSection.button.get_button_Save(driver).click();

	}

}
