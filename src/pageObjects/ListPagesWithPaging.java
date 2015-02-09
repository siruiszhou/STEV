package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ListPagesWithPaging {

	
	public static void gotoPageContainsString(WebDriver driver, String elementText){
		
		boolean isElementText = false;
		boolean isLastPage = false;		
		while (!isElementText)
			{					
				if (isPagingExist(driver))
					if (isLastPage)
					{
						System.out.println("the text "+elementText+" is not found on all pages of the list page");
						break;
					}
					else
					{							
						if(lastElementInPaging(driver).getAttribute("class").contains("next"))
						{
							isLastPage =false;
							lastButtonInPaging(driver).click();
							isElementText =driver.getPageSource().contains(elementText);
						}
						
						else
						{
							lastElementInPaging(driver).click();
							isLastPage = true;
						}
					}
						
				else
				{
					System.out.println("the text "+elementText+" is not found on all pages of the list page");
					break;
				}
			}

	}
	
	public static void gotoLastPage(WebDriver driver){

		if (isPagingExist(driver)){
			boolean isLastPage = false;	
			while (!isLastPage)
			{
				if(lastElementInPaging(driver).getAttribute("class").contains("next"))
				{
					isLastPage =false;
					lastButtonInPaging(driver).click();
				}
				
				else
				{
					lastElementInPaging(driver).click();
					isLastPage = true;
				}
			}
		}
			
		
	}	
	
	public static boolean isPagingExist(WebDriver driver){
		boolean pagingExist = false;
		List<WebElement> allDivElements= driver.findElements(By.xpath(".//div[@class='span9 main_section']//div"));
		for(int i = 0;i<allDivElements.size();i++){
			String className = allDivElements.get(i).getAttribute("class");
			if (className.contains("pagination"))
			{
				pagingExist=true;
				break;
			}
		}	
		return pagingExist;
	}
	
	public static WebElement lastElementInPaging(WebDriver driver){
		return driver.findElement(By.xpath(".//div[@class='span9 pagination']/ul/li[last()]"));
	}
	
	public static WebElement lastButtonInPaging(WebDriver driver){
		return driver.findElement(By.xpath(".//div[@class='span9 pagination']/ul/li[last()]/a"));
	}
	

	


}
