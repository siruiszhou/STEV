package testCases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.PDPpage;
import pageObjects.PLPpage;
import pageObjects.WF03a_Personal_Company_Join_Registration;
import pageObjects.WF03GuestRegisterOrLogin;
import pageObjects.WF04_Register_Login;
import pageObjects.PIPpage;
import actionModules.RequestQuoteGuest;
import utility.DataLoader;
import utility.Log;
import utility.Utils;
import actionModules.*;

//Created by Ethan Zhou
public class EssentraSmoke05_RequestQuote_Guest {
	private static WebDriver driver = null;

	@Test (groups = {"p0"})
	public void testRequestQuote_Guest_PDP() throws Exception{
		DataLoader Constant = new DataLoader();
		driver.get(Constant.get_PDPURL());
		/*
		 *step1: add items to basket 
		 */
		
		PDPpage.button.get_button_RequestQuote(driver).click();
		WF03GuestRegisterOrLogin.button.get_button_ContinueAsGuest(driver).click();
		RequestQuoteGuest.InputDetails(driver);	     
	    //*********Step3*********
	}
	
	@Test (groups = {"p0"})
	public void testRequestQuote_Guest_PIP() throws Exception{
		DataLoader Constant = new DataLoader();
		driver.get(Constant.get_PIPURL());
		/*
		 *step1: add items to basket 
		 */
		PIPpage.button.get_button_RequestQuote(driver).click();
		WF03GuestRegisterOrLogin.button.get_button_ContinueAsGuest(driver).click();
		RequestQuoteGuest.InputDetails(driver);	     
	    //*********Step3*********
	}
	
	@Test (groups = {"p0"})
	public void testRequestQuote_Guest_PLP() throws Exception{
		DataLoader Constant = new DataLoader();
		driver.get(Constant.get_PLPURL());
		/*
		 *step1: add items to basket 
		 */
		PLPpage.Link.get_link_show_variants(driver).click();
		PLPpage.button.get_button_RequestQuote(driver).click();
		WF03GuestRegisterOrLogin.button.get_button_ContinueAsGuest(driver).click();
		RequestQuoteGuest.InputDetails(driver);	     
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
		System.out.println("AfterClass of "+ Utils.getTestCaseName(this.toString()));
		driver.quit();
	}
}