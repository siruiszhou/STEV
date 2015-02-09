package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class WF03a_Personal_Company_Join_Registration {
	private static WebElement element = null;

	public static class button{
		public static WebElement get_buttton_mycompany(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='vfileColorBIDI']/div[1]/div/p[1]/a[2]"));
			Log.info("register my company element found");
			return element;
		}
		public static WebElement get_buttton_personal(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='vfileColorBIDI']/div[1]/div/p[2]/a/b"));
			Log.info("register personal element found");
			return element;
		}
		public static WebElement get_buttton_joincompany(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='vfileColorBIDI']/div[1]/div/p[1]/a[1]"));
			Log.info("register personal element found");
			return element;
		}
	}
}
