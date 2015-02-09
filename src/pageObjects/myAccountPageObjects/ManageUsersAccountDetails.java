package pageObjects.myAccountPageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManageUsersAccountDetails {

private static WebElement element=null;
	
	
	public static WebElement JoinerRequest(WebDriver driver){
	
		element = driver.findElement(By.xpath(".//*[@id='site_bd']/div[2]/div[2]/ul/li[2]/a"));
	return element;
	}
	
	public static WebElement AcceptButton(WebDriver driver, String FirstName){
		String left = ".//*[@id='site_bd']/div[2]/div[2]/table/tbody/tr/td/p[contains(text(),'";
		String right="')]/ancestor::td/form/div/span[2]/button[2]";
		String path= left+FirstName+right;
		System.out.println(path);
		element =  driver.findElement(By.xpath(path));
	return element;
	}
	
	public static WebElement DenyButton(WebDriver driver, String FirstName){
		String left = ".//*[@id='site_bd']/div[2]/div[2]/table/tbody/tr/td/p[contains(text(),'";
		String right="')]/ancestor::td/form/div/span[2]/button[1]";
		String path= left+FirstName+right;
		System.out.println(path);
		element =  driver.findElement(By.xpath(path));
	return element;
	}
	
	public static WebElement DeleteButton(WebDriver driver, String email){
		String left = ".//*[@id='site_bd']/div[2]/div[2]/table/tbody/tr/td[contains(text(),'";
		String right="')]/ancestor::tr/td[5]/form/a";
		String path= left+email+right;
		System.out.println(path);
		element =  driver.findElement(By.xpath(path));
	return element;
	}
	
	public static WebElement OverlayDeleteButton(WebDriver driver){
		element =  driver.findElement(By.xpath(".//body/div[4]/div[3]/button[2]"));
	return element;
	}
}