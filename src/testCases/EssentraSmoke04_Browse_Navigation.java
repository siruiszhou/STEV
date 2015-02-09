package testCases;

import static org.testng.AssertJUnit.assertTrue;

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
import pageObjects.PDPpage;
import pageObjects.PIPpage;
import pageObjects.PLPpage;
import pageObjects.CLPpage;

//Created by Ethan Zhou
public class EssentraSmoke04_Browse_Navigation {
	private static WebDriver driver = null;

	@Test (groups = {"p0"})
	public void testNavigation() throws Exception{
		//*********Step2*********
		
		Homepage.header.get_Link_LHN_Brake(driver).click();
		CLPpage.Link.get_link_category_image_brakepad(driver).click();
		PLPpage.Link.get_link_gridview(driver).click();
		//Thread.sleep(5000);
		PLPpage.Link.get_link_product_name_kevlarbrakepad(driver).click();
		PDPpage.Link.get_link_item_image_brakepad(driver).click();
		PIPpage.Link.get_link_breadcrumb_L2(driver).click();
		PLPpage.Link.get_link_breadcrumb_L1(driver).click();
		CLPpage.Link.get_link_breadcrumb_home(driver).click();
		assertTrue(Homepage.header.get_Link_QuickOrder(driver).isDisplayed());

	     
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
