package actionModules.myAccountPageActions;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.ListPagesWithPaging;
import pageObjects.myAccountPageObjects.ManageUsersAccountDetails;
import pageObjects.myAccountPageObjects.MyAccountDetailsSection;
import pageObjects.myAccountPageObjects.MyAccountProductList;
import pageObjects.myAccountPageObjects.MyOrdersSection;


public class ManageUsersManagerUsers extends ListPagesWithPaging{
	public static void viewUserByEmail(WebDriver driver, String Email){
		MyOrdersSection.getViewButtonByReference(driver, Email).click();
	}
}
