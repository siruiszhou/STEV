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
import pageObjects.Homepage;
import pageObjects.WF03a_Personal_Company_Join_Registration;
import pageObjects.WF04_Register_Login;
import actionModules.RegCompanyBillDetail;
import actionModules.RegPersonalDetail;

//Created by Ethan Zhou
public class EssentraSmoke02_Registration_Company {
	private static WebDriver driver = null;
	@Test (groups = {"p0"})
	public void testRegCompany() throws Exception{
		//*********Step2*********		
		Homepage.header.get_Link_Login(driver).click();
		WF04_Register_Login.button.get_buttton_register(driver).click();
		WF03a_Personal_Company_Join_Registration.button.get_buttton_mycompany(driver).click();
		String timestamp = Utils.GenerateEmailPostFix();
		String email = ("Company@"+timestamp+"."+DataLoader.localSite).toLowerCase();
		Log.info(email);
		RegPersonalDetail.InputDetails(driver, email);		
		RegCompanyBillDetail.InputDetails(driver, timestamp);		
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
		driver.quit();
		System.out.println("AfterClass of "+ Utils.getTestCaseName(this.toString()));
		//driver.quit();
	}

}
