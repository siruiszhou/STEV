package pageObjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.seleniumhq.jetty7.util.log.Log;

public class WF03dFindCompany {
	private static WebElement element = null;
	
	public static class field{
	public static WebElement get_field_Account (WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='Register']/fieldset/div[1]/div/input"));
		Log.info("Account field found");
		return element;
	}
	public static WebElement get_field_PostCode (WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='Register']/fieldset/div[2]/div/input"));
		Log.info("PostCode field found");
		return element;
	}
	public static WebElement get_field_NotFoundTitle (WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='notMatching']/div[1]/h3"));
		Log.info("Company Not Found Overlay title found");
		return element;
	}

	}
	
	public static class button{
		public static WebElement get_button_findcompany(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='Register']/div[3]/div/button"));
			Log.info("Find Company button found");
			return element;
		}
		public static WebElement get_button_searchAgain(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='notMatching']/div[3]/button"));
			Log.info("Find Company button found");
			return element;
		}
	}
}
