package actionModules;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.RequestCataloguePage;
import utility.Log;
import utility.DataLoader;
import actionModules.AddBasketOverlayAction;

public class OrderCatalogue {
	
	public static void addToBasket(WebDriver driver){
		DataLoader Constant =new DataLoader();
		driver.get(Constant.get_CATALOGUEURL());
		RequestCataloguePage.field.get_field_quantity(driver).click();
		RequestCataloguePage.button.get_button_order(driver).click();
		AddBasketOverlayAction.continueShopping(driver);
	}

}