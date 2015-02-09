package testCases;



import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utility.DataLoader;
import utility.Log;
import utility.Utils;
import pageObjects.Header;
import pageObjects.Homepage;
import pageObjects.WF03a_Personal_Company_Join_Registration;
import pageObjects.WF04_Register_Login;
import actionModules.RegPersonalBillDetail;
import actionModules.RegPersonalPersonalDetail;
import actionModules.ForgotPassword;
import actionModules.WF04LogonFailed;

//Created by Ethan Zhou
public class EssentraSmoke35_ForgotPassword {
	private static WebDriver driver = null;

	@Test (groups = {"p0"})
	public void testForgotPassword() throws Exception{
		//*********Step2*********
		
		Homepage.header.get_Link_Login(driver).click();
		WF04_Register_Login.button.get_buttton_register(driver).click();
		WF03a_Personal_Company_Join_Registration.button.get_buttton_personal(driver).click();
		String timestamp = Utils.GenerateEmailPostFix();
		String email = "Personal@"+timestamp+"."+DataLoader.localSite;
		System.out.println(email);
		RegPersonalPersonalDetail.InputDetails(driver, email);
		RegPersonalBillDetail.InputDetails(driver);
		
		driver.switchTo().activeElement().findElement(By.id("accountCreated"));
		System.out.println("overlay found");
		
		Homepage.header.get_Link_logout(driver).click();
		Header.get_Link_Login(driver).click();
		
		WF04_Register_Login.field.get_field_Forgot(driver).click();
		ForgotPassword.SendEmailforPassword(driver, email);
		
		Header.get_Link_Login(driver).click();
		System.out.println("login link found");
		WF04LogonFailed.Logon(driver, email);
	     
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
		//Homepage.header.get_Link_logout(driver).click();
		driver.quit();
		System.out.println("AfterClass of "+ Utils.getTestCaseName(this.toString()));
		//driver.quit();
	}

}
