package actionModules.myAccountPageActions;

import org.openqa.selenium.WebDriver;

import pageObjects.myAccountPageObjects.MyAccountProductList;
import pageObjects.myAccountPageObjects.MyOrdersSection;


public class MyAccountProductListAction {
	public static void addToBasketFromProductList(WebDriver driver, int index){
		MyAccountProductList.field.get_field_quantity(driver, index).sendKeys("8");
		MyAccountProductList.button.get_button_AddBasket(driver, index).click();

	}

}
