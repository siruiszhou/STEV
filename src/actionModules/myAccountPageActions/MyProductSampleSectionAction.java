package actionModules.myAccountPageActions;

import org.openqa.selenium.WebDriver;

import pageObjects.myAccountPageObjects.MyProductSampleSection;


public class MyProductSampleSectionAction {
	public static void reOrderSampleFromProductSample(WebDriver driver, int index){

		MyProductSampleSection.get_button_reOrderSample(driver, index).click();

	}

}
