package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class Overlay {
	
private static WebElement element = null;
	

	public static String get_text_Subtitle(WebDriver driver){
		
		return driver.findElement(By.xpath(".//div[contains(@class, 'popupModal')]/form/div[1]/h5")).getText();	
	}

	public static String get_text_Title(WebDriver driver){
		
		return driver.findElement(By.xpath(".//div[contains(@id, 'modal')]//div[1]/h3")).getText();	
	}

	
}
