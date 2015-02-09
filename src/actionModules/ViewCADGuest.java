package actionModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.ViewCADGuestOverlay;

public class ViewCADGuest {
	public static void InputDetails(WebDriver driver) throws InterruptedException { 
	ViewCADGuestOverlay.field.get_field_title(driver).click();
	ViewCADGuestOverlay.field.get_field_firstname(driver).sendKeys("Ethan");
	ViewCADGuestOverlay.field.get_field_lastname(driver).sendKeys("ZHOU");
	ViewCADGuestOverlay.field.get_field_phonenumber(driver).sendKeys("123456789");
	ViewCADGuestOverlay.field.get_field_emailaddress(driver).sendKeys("ez@test.com");
	ViewCADGuestOverlay.field.get_field_city(driver).sendKeys("Beijing");
	ViewCADGuestOverlay.field.get_field_country(driver).click();
	ViewCADGuestOverlay.field.get_field_county(driver).click();
	ViewCADGuestOverlay.field.get_field_jobtitle(driver).sendKeys("Tester");
	ViewCADGuestOverlay.field.get_field_confimterm(driver).click();
	ViewCADGuestOverlay.button.get_field_ViewCAD(driver).click();
	//WebDriverWait wait = new WebDriverWait(driver, 3000);
	//wait.until(ExpectedConditions.elementToBeClickable(ViewCADGuestOverlay.button.get_field_ContinueShopping(driver))).click();
	//wait.until(ExpectedConditions.visibilityOf(ViewCADGuestOverlay.button.get_field_ContinueShopping(driver))).click();
	Thread.sleep(5000);
	ViewCADGuestOverlay.button.get_field_Close(driver).click();
	System.out.println("Close found");
	}
}