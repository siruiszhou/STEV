package pageObjects.myAccountPageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.ListPagesWithPaging;
import utility.Log;

public class MyOrdersSection extends ListPagesWithPaging{
	
	private static WebElement element = null;
	
	
	public static WebElement getOrderListByName(WebDriver driver, String orderList){

		element = driver.findElement(By.xpath(".//*[@id='site_bd']//li//*[contains(text(),'"+orderList+"')]"));
		return element;
	}
	
	public static WebElement getMyOrdersTitle(WebDriver driver){

		element = driver.findElement(By.xpath(".//h1[text()='My Orders']"));
		return element;
	}
	
	public static WebElement getViewButtonByNum(WebDriver driver, String numOfOrder){
		
		element = driver.findElement(By.xpath(".//tr["+numOfOrder+"]//button[contains (text(),'View')]"));
		return element;
	}
	
	public static WebElement getViewButtonByOrderID(WebDriver driver, String OrderID){
		element = driver.findElement(By.xpath(".//input[@value='"+OrderID+"']/ancestor::form/button"));
		return element;
	}
	
	public static WebElement getViewButtonByReference(WebDriver driver, String orderReference){
		
		gotoPageContainsString(driver, orderReference);
		//gotoPageContainsString(driver, orderReference);
		element = driver.findElement(By.xpath(".//td[@title='"+orderReference+"']/ancestor::tr//button"));
		return element;
	}
	
	
	public static int getNumOfOrdersByNameFromHeader(WebDriver driver, String orderList ){
		int numOfOrders= 0;
		String columnName = new MyOrdersSection().getOrderListByName(driver, orderList).getText();
		int length = columnName.length();
		numOfOrders=Integer.parseInt(columnName.substring(orderList.length()+2, length-1));
		return numOfOrders;
	}
	
	public static int getNumOfOrdersByNameFromTable(WebDriver driver){

		return new MyOrdersSection().getViewButtons(driver).size();
	}
	
	private static List<WebElement> getViewButtons(WebDriver driver){

		List<WebElement> elist = driver.findElements(By.xpath("//button[contains (text(),'View')]"));
		return elist;
	}
	
	public static String getCurrentOrderList(WebDriver driver){
		element = driver.findElement(By.xpath(".//ul[@class ='tabs clearfix']//span"));
		String[] orderlistNameSplit= element.getText().split(" ");
		return orderlistNameSplit[0]+" "+orderlistNameSplit[1];
	}
}
