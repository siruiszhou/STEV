package actionModules;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.PIPpage;
import utility.Log;
import utility.DataLoader;

public class PIPAction {
	
	public static void addToBasket(WebDriver driver, int quantity){
		PIPpage.field.get_field_quantity(driver).sendKeys(String.valueOf(quantity));
		PIPpage.button.get_button_AddBasket(driver).click();	
	}
	public static void orderSample(WebDriver driver){
		PIPpage.button.get_button_OrderSample(driver).click();	
	}

	public static boolean isFullPackOnly(WebDriver driver){		
		return PIPpage.value.get_FullPackOnlyText(driver).contains("Buy in multiples");
	}
}
