package actionModules.myAccountPageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageObjects.myAccountPageObjects.MyAccountDetailsSection;
import pageObjects.myAccountPageObjects.MyAccountOverviewSection;
import pageObjects.myAccountPageObjects.MyAccountProductList;
import pageObjects.myAccountPageObjects.MyOrdersSection;


public class MyAccountApprovalJoiner {
	public static void approvalJoinerRequest(WebDriver driver, String Lastname){
		MyAccountOverviewSection.get_button_View(driver).click();
		driver.findElement(By.xpath(""));

	}

}
