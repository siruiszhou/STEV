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
import pageObjects.WF04_Register_Login;
import pageObjects.WF03b_New_Company_Registration_PersonalDetails;
import actionModules.RegCompanyBillDetail;
import actionModules.RegPersonalBillDetail;
import actionModules.RegPersonalPersonalDetail;

//Created by Ethan Zhou
public class EssentraSmoke03_Registration_Personal {
	private static WebDriver driver = null;
	public static String siteLocal = null;

	@Test (groups = {"p0"})
	public void testRegPerson() throws Exception{
		//*********Step2*********
		
		Homepage.header.get_Link_Login(driver).click();
		WF04_Register_Login.button.get_buttton_register(driver).click();
		WF03a_Personal_Company_Join_Registration.button.get_buttton_personal(driver).click();
		String timestamp = Utils.GenerateEmailPostFix();
		String email = ("Personal@"+timestamp+"."+DataLoader.localSite).toLowerCase();
		System.out.println(email);
		Log.info(email);
		RegPersonalPersonalDetail.InputDetails(driver, email);
		
		RegPersonalBillDetail.InputDetails(driver);
		
		driver.switchTo().activeElement().findElement(By.id("accountCreated"));
		System.out.println("overlay found");

		
	     
	    //*********Step3*********

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
		Homepage.header.get_Link_logout(driver).click();
		//driver.quit();
		System.out.println("AfterClass of "+ Utils.getTestCaseName(this.toString()));
		//driver.quit();
	}

}
