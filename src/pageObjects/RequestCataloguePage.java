package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RequestCataloguePage {
	public static WebElement element = null;
	public static class button{
		public static WebElement get_button_downloadPDF(WebDriver driver){
			element = driver.findElement(By.xpath(".//a[text()='Download PDF']"));
			return element;
		}
		public static WebElement get_button_order(WebDriver driver){
			element = driver.findElement(By.xpath(".//a[text()='Order Catalogue']"));
			return element;
		}
		public static WebElement get_button_downloadall(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='downloadCatalogues']/div[2]/h4/a"));
			return element;
		}
		public static WebElement get_button_close(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='downloadCatalogues']/div[3]/a"));
			return element;
		}
	}
	public static class field{
		public static WebElement get_field_quantity(WebDriver driver){
			element = driver.findElement(By.xpath(".//select[@class='catalogueQuantity']/option[2]"));
			return element;
		}
		public static WebElement get_field_language(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='downloadCatalogues']/div[2]/div/div/select/option[2]"));
			return element;
		}
	}

}
