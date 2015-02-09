package actionModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageObjects.WF38aOrderConfirmationGuest;

public class WF38OrderConfirmationAction {
	
	public static boolean CheckOrderComplete(WebDriver driver){
		boolean orderCompleted = false;
		if(isOrderComplete(driver))
			orderCompleted = true;
		return orderCompleted;
	}
	private static boolean isOrderComplete(WebDriver driver ){
		boolean orderComplete = false;
		if (utility.Utils.isElementPresentWaitLong(driver, By.xpath(".//h3[@class='order_complete']")) )
			orderComplete = true;
		else {
			System.out.println("OrderConfirmation page timeout");
		}
		return orderComplete;
	}

}
