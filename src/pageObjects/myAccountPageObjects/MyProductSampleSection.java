package pageObjects.myAccountPageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyProductSampleSection {
private static WebElement element = null;
	
	
public static WebElement getProductSamplesTitle(WebDriver driver){

	element = driver.findElement(By.xpath(".//h1[text()='Product Samples']"));
	return element;
}
public static WebElement get_button_reOrderSample(WebDriver driver, int index){

	return  MyProductSampleSection.get_buttons_reOrderSample(driver).get(index);
}

public static List<WebElement> get_buttons_reOrderSample(WebDriver driver){

	return driver.findElements(By.xpath(".//*[contains(@id, 'ordersampleButton')]"));
}
public static class value{
	public static List<String> get_values_SKUNames(WebDriver driver){
		List<String> skuNames = new ArrayList<>();
		List<WebElement> skuNameElements = driver.findElements(By.xpath(".//table[@class='data_table table table-bordered']//td[@class='product']//a/strong"));
		
		for (int i = 0; i<skuNameElements.size();i++){
			skuNames.add(skuNameElements.get(i).getText());
		}
			return skuNames;
		}
	
	public static String get_value_SKUName(WebDriver driver, int index){
	return MyProductSampleSection.value.get_values_SKUNames(driver).get(index);
		}
	}
}
