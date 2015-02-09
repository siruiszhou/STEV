package actionModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.RequestQuoteGuestOverlay;

public class RequestQuoteGuest {
	public static void InputDetails(WebDriver driver) throws InterruptedException { 
	RequestQuoteGuestOverlay.field.get_field_quantity(driver).sendKeys("20");
	RequestQuoteGuestOverlay.field.get_field_title(driver).click();
	RequestQuoteGuestOverlay.field.get_field_firstname(driver).sendKeys("Ethan");
	RequestQuoteGuestOverlay.field.get_field_lastname(driver).sendKeys("ZHOU");
	RequestQuoteGuestOverlay.field.get_field_phonenumber(driver).sendKeys("123456789");
	RequestQuoteGuestOverlay.field.get_field_emailaddress(driver).sendKeys("ez@test.com");
	RequestQuoteGuestOverlay.field.get_field_city(driver).sendKeys("Beijing");
	RequestQuoteGuestOverlay.field.get_field_country(driver).click();
	RequestQuoteGuestOverlay.field.get_field_county(driver).click();
	RequestQuoteGuestOverlay.field.get_field_jobtitle(driver).sendKeys("Tester");
	RequestQuoteGuestOverlay.button.get_field_RequestQuote(driver).click();
	//WebDriverWait wait = new WebDriverWait(driver, 3000);
	//wait.until(ExpectedConditions.elementToBeClickable(RequestQuoteGuestOverlay.button.get_field_ContinueShopping(driver))).click();
	//wait.until(ExpectedConditions.visibilityOf(RequestQuoteGuestOverlay.button.get_field_ContinueShopping(driver))).click();
	Thread.sleep(5000);
	RequestQuoteGuestOverlay.button.get_field_ContinueShopping(driver).click();
	System.out.println("continue button found");
	}
}
