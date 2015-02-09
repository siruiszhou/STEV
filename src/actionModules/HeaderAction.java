package actionModules;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;


import utility.DataLoader;
import pageObjects.Header;

public class HeaderAction {

	public static void logout(WebDriver driver){
		if(isLogin(driver))
		Header.get_Link_logout(driver).click();
	}
	
	public static boolean isLogin(WebDriver driver){
		
		return Header.get_Link_loginStatus(driver).getText().contains("Logout");
	}
	
	public static void logoutByRemoveCookie(WebDriver driver){
		Set<Cookie>  cookies = driver.manage().getCookies();
		List <String> cookieNames = new ArrayList<>();
		for(Cookie i : cookies){
			cookieNames.add(i.getName());
		}
		System.out.println(cookieNames);
		String userActivityCookie = new String(); 
		String authenticationCookie = new String(); 
		for (String i : cookieNames){
			if (i.contains("WC_USERACTIVITY"))
				userActivityCookie=i;
			else if(i.contains("WC_AUTHENTICATION"))
				
				authenticationCookie = i;			
		}
		driver.manage().deleteCookieNamed(userActivityCookie);
		driver.manage().deleteCookieNamed(authenticationCookie);
	}
	
	public static void goLoginPage(WebDriver driver){
		Header.get_Link_Login(driver).click();
	}
	public static void goMyAccount(WebDriver driver){
		Header.get_Link_MyAccount(driver).click();
	}
	public static void goBasket(WebDriver driver){
		Header.get_Link_Basket(driver).click();
	}

	public static void goHomePage(WebDriver driver){
		Header.get_Link_Logo(driver).click();
	}
	
	public static void searchBySKUNUM(WebDriver driver, String SKUNUM){
		Header.get_Link_SearchBox(driver).sendKeys(SKUNUM);
		Header.get_button_Search(driver).click();
	}
	
	
	
	public static void searchBySKUName(WebDriver driver, String SKUName){
		Header.get_Link_SearchBox(driver).sendKeys(SKUName);
		Header.get_button_Search(driver).click();
	}
}