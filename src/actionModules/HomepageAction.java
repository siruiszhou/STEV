package actionModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.Homepage;
import pageObjects.RequestCataloguePage;
import utility.DataLoader;
import utility.Log;



public class HomepageAction {
	
	public static void quickOrderaddToBasket(WebDriver driver){
		DataLoader Constant =new DataLoader();
		Homepage.quickOrderSection.get_TextBox_SKUNum(driver).sendKeys(Constant.get_SKUNUM());
		Homepage.quickOrderSection.get_TextBox_Quantity(driver).sendKeys("8");
		Homepage.quickOrderSection.get_button_AddToBasket(driver).click();
		AddBasketOverlayAction.viewBasket(driver);
	}
}
