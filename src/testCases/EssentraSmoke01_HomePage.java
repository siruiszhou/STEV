package testCases;

import static org.testng.AssertJUnit.assertTrue;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utility.DataLoader;
import utility.Log;
import utility.Utils;
import pageObjects.Homepage;

//Created by Ethan Zhou
public class EssentraSmoke01_HomePage {
	private static WebDriver driver = null;

	@Test (groups = {"p0"})
	public void testHomepage() throws Exception{
		//*********Step2*********
		
		assertTrue(Homepage.header.get_Link_Basket(driver).isDisplayed());
		assertTrue(Homepage.header.get_Link_Basket(driver).isDisplayed());	     
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
		//driver.quit();
	}

}
