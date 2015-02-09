package pageObjects.myAccountPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountDetailsSection {
private static WebElement element = null;
	
	
	public static WebElement getAccountDetailTitle(WebDriver driver){
	
		element = driver.findElement(By.xpath(".//h1[text()='Account details']"));
	return element;
	}
	
	public static String getCurrentTab(WebDriver driver){
		
		element = driver.findElement(By.xpath(".//ul[@class ='tabs clearfix']//span"));

		return element.getText();
	}
	
	public static WebElement getAccountDetailTab(WebDriver driver){
		
		element = driver.findElement(By.xpath(".//ul[@class ='tabs clearfix']/li[1]"));

		return element;
	}
	public static WebElement getJoinerRequestTab(WebDriver driver){
		
		element = driver.findElement(By.xpath(".//ul[@class ='tabs clearfix']/li[2]"));

		return element;
	}
	public static WebElement getManageUserTab(WebDriver driver){
		
		element = driver.findElement(By.xpath(".//ul[@class ='tabs clearfix']/li[3]"));

		return element;
	}
	
	public static class field{
	public static WebElement get_field_Phone(WebDriver driver){
		
		element = driver.findElement(By.xpath(".//*[@id='part_phone1']"));

		return element;
	}
	}
	
	
	public static class button{
	public static WebElement get_button_Save(WebDriver driver){
		
		element = driver.findElement(By.xpath(".//*[@id='accountDetails']//button[text()='Save All Changes']"));

		return element;
	}
	}

}
