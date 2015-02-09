package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class SearchResult_TooMany {
	private static WebElement element = null;
	public static class Content{
		public static WebElement get_content_result(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='site_bd']/div[4]/p[2]"));
			return element;
		}
		public static WebElement get_content_term(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='site_bd']/div[4]/p[1]/strong[3]"));
			return element;
		}

	}
}