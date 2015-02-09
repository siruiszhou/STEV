package actionModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.ViewCADLoginOverlay;

public class ViewCADLogin {
	public static void InputDetails(WebDriver driver) throws InterruptedException { 
	ViewCADLoginOverlay.field.get_field_confimterm(driver).click();
	ViewCADLoginOverlay.button.get_field_ViewCAD(driver).click();
	//WebDriverWait wait = new WebDriverWait(driver, 3000);
	//wait.until(ExpectedConditions.elementToBeClickable(ViewCADGuestOverlay.button.get_field_ContinueShopping(driver))).click();
	//wait.until(ExpectedConditions.visibilityOf(ViewCADGuestOverlay.button.get_field_ContinueShopping(driver))).click();
	Thread.sleep(5000);
	ViewCADLoginOverlay.button.get_field_Close(driver).click();
	System.out.println("Close found");
	}
}