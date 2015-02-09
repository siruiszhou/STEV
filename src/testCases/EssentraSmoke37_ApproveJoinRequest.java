package testCases;

import static org.testng.AssertJUnit.assertTrue;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utility.DataLoader;
import utility.Log;
import utility.Utils;
import pageObjects.Homepage;
import pageObjects.WF03a_Personal_Company_Join_Registration;
import pageObjects.WF03c_New_Company_Registration_CompanyDetails;
import pageObjects.WF03dFindCompany;
import pageObjects.WF04_Register_Login;
import pageObjects.WF03b_New_Company_Registration_PersonalDetails;
import pageObjects.myAccountPageObjects.ManageUsersAccountDetails;
import pageObjects.myAccountPageObjects.MyAccountOverviewSection;
import actionModules.FindCompanyDone;
import actionModules.FindCompanyFailed;
import actionModules.HeaderAction;
import actionModules.RegCompanyBillDetail;
import actionModules.RegJoinCompany;
import actionModules.RegPersonalDetail;
import actionModules.WF04Logon;
import actionModules.WF04LogonFailed;
import actionModules.myAccountPageActions.ManageUsersManagerUsers;
import actionModules.myAccountPageActions.MyAccountLHNActions;

//Created by Ethan Zhou
public class EssentraSmoke37_ApproveJoinRequest {
	private static WebDriver driver = null;
	private static String email = null;


	@Test (groups = {"p0"})
	public void testApproveJoinerRequest() throws Exception{
		//*********Step2*********
		DataLoader Constant = new DataLoader();
		Homepage.header.get_Link_Login(driver).click();
		WF04_Register_Login.button.get_buttton_register(driver).click();
		WF03a_Personal_Company_Join_Registration.button.get_buttton_joincompany(driver).click();
		FindCompanyDone.CorrectCompanyInfo(driver);
		String timestamp = Utils.GenerateEmailPostFix();
		email = ("Company@"+timestamp+"."+Constant.localSite).toLowerCase();
		String firstname = Utils.alphabettimestamp(timestamp);
		System.out.println(email);
		Log.info(email);
		RegJoinCompany.InputDetails(driver, email, firstname);
		HeaderAction.goLoginPage(driver);
		WF04Logon.LogonParent(driver);
		
		HeaderAction.goMyAccount(driver);
		MyAccountOverviewSection.get_button_View(driver).click();
		ManageUsersManagerUsers.gotoPageContainsString(driver, firstname);
		ManageUsersAccountDetails.AcceptButton(driver, firstname).click();
//		
//		Approval Verification
//		
		driver.get(Constant.get_HomePageURL());		
		Homepage.header.get_Link_logout(driver).click();
		Homepage.header.get_Link_Login(driver).click();
		WF04Logon.LogonEmail(driver, email);
//		

	}


	@Test (groups = {"p0"})
	public void testDeleteApprovedUser() throws Exception{
		Homepage.header.get_Link_logout(driver).click();
		Homepage.header.get_Link_Login(driver).click();
		WF04Logon.LogonParent(driver);
		HeaderAction.goMyAccount(driver);
		MyAccountLHNActions.goManageUsers(driver);
		ManageUsersManagerUsers.gotoPageContainsString(driver, email);
		ManageUsersAccountDetails.DeleteButton(driver, email).click();
		ManageUsersAccountDetails.OverlayDeleteButton(driver).click();
		Homepage.header.get_Link_logout(driver).click();
		Homepage.header.get_Link_Login(driver).click();
		WF04LogonFailed.LogonLock(driver, email);
	}
	
	
	

	@BeforeClass (groups = {"p0","p1","p2","p3"})
	@Parameters({"localSite","browserType","siteEnv"})
	public void beforeClass(String localSite, String browserType, String siteEnv) throws Exception {
		DataLoader Constant = new DataLoader();
		System.out.println("BeforeClass of "+ Utils.getTestCaseName(this.toString()));
		Constant.localSite = localSite;
		Constant.siteEnv = siteEnv;
		DOMConfigurator.configure(Constant.get_LOG_CONFIGURE_XML());
		Log.startTestCase(Utils.getTestCaseName(this.toString()));	
		driver = Utils.openBrowserByURL(browserType, Constant.get_HomePageURL());
	}

	@AfterClass (groups = {"p0","p1","p2","p3"})
	public void afterClass() throws Exception {
		//Homepage.header.get_Link_logout(driver).click();
		driver.quit();
		System.out.println("AfterClass of "+ Utils.getTestCaseName(this.toString()));
	}

}

