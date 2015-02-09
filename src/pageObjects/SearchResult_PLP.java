package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class SearchResult_PLP {
	private static WebElement element = null;
	public static class Content{
		public static WebElement get_content_result(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='Search_Result_Summary']/span"));
			return element;
		}

	}
}
