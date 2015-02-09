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
import actionModules.WF04Logon;
import utility.DataLoader;
import utility.Log;
import utility.Utils;
import actionModules.*;

//Created by Ethan Zhou
public class EssentraSmoke09_ViewCAD_Login {
	private static WebDriver driver = null;

	@Test (groups = {"p0"})
	public void ViewCAD_Login_PDP() throws Exception{
		/*
		 *step1: add items to basket 
		 */
		DataLoader Constant = new DataLoader();
		Homepage.header.get_Link_Login(driver).click();
		WF04Logon.Logon(driver);
		driver.get(Constant.get_PDPURL());
		PDPpage.button.get_button_ViewCAD(driver).click();
		ViewCADLogin.InputDetails(driver);
		Homepage.header.get_Link_logout(driver).click();     
	    //*********Step3*********
	}

	@Test (groups = {"p0"})
	public void ViewCAD_Login_PIP() throws Exception{
		/*
		 *step1: add items to basket 
		 */
		DataLoader Constant = new DataLoader();
		Homepage.header.get_Link_Login(driver).click();
		WF04Logon.Logon(driver);
		driver.get(Constant.get_PIPURL());
		PIPpage.button.get_button_ViewCAD(driver).click();
		ViewCADLogin.InputDetails(driver);
		Homepage.header.get_Link_logout(driver).click();     
	    //*********Step3*********
	}
	
	@Test (groups = {"p0"})
	public void ViewCAD_Login_PLP() throws Exception{
		/*
		 *step1: add items to basket 
		 */
		DataLoader Constant = new DataLoader();
		Homepage.header.get_Link_Login(driver).click();
		WF04Logon.Logon(driver);
		driver.get(Constant.get_PLPURL());
		PLPpage.Link.get_link_show_variants(driver).click();
		PLPpage.button.get_button_ViewCAD(driver).click();
		ViewCADLogin.InputDetails(driver);
		Homepage.header.get_Link_logout(driver).click();     
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