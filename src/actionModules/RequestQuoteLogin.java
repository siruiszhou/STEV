package actionModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.RequestQuoteLoginOverlay;

public class RequestQuoteLogin {
	public static void InputDetails(WebDriver driver) throws InterruptedException { 
	RequestQuoteLoginOverlay.field.get_field_quantity(driver).sendKeys("20");
	RequestQuoteLoginOverlay.button.get_field_RequestQuote(driver).click();
	//WebDriverWait wait = new WebDriverWait(driver, 3000);
	//wait.until(ExpectedConditions.elementToBeClickable(RequestQuoteGuestOverlay.button.get_field_ContinueShopping(driver))).click();
	//wait.until(ExpectedConditions.visibilityOf(RequestQuoteGuestOverlay.button.get_field_ContinueShopping(driver))).click();
	Thread.sleep(5000);
	RequestQuoteLoginOverlay.button.get_field_ContinueShopping(driver).click();
	System.out.println("continue button found");
	
	}
}