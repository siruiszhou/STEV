package testCases;

import static org.testng.AssertJUnit.assertTrue;

import javax.swing.Spring;

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
import pageObjects.SearchResult_PLP;

//Created by Ethan Zhou
public class EssentraSmoke21_Search {
	private static WebDriver driver = null;

	@Test (groups = {"p0"})
	public void testSearchPLP() throws Exception{
		//*********Step2*********
		DataLoader Constant = new DataLoader();
		Homepage.header.get_Link_SearchBox(driver).sendKeys(Constant.get_searchTermPLP());
		Homepage.header.get_Link_SearchButton(driver).click();
		String resultContent = SearchResult_PLP.Content.get_content_result(driver).getText();
		assertTrue(resultContent.contains(Constant.get_searchTermPLP()));
		assertTrue(resultContent.contains("Number of results found:"));
		System.out.println(resultContent);

	     
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
