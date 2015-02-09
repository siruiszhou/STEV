package utility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {

	public static WebDriver driver = null;

	public static String getTestCaseName(String sTestCase) throws Exception {

		String value = sTestCase;

		try {

			int posi = value.indexOf("@");

			value = value.substring(0, posi);

			posi = value.lastIndexOf(".");

			value = value.substring(posi + 1);

			return value;

		} catch (Exception e) {

			Log.error("Class Utils | Method getTestCaseName | Exception desc : "
					+ e.getMessage());

			throw (e);

		}
	}

	public static boolean verifyObjectPresent(WebDriver driver) {
		try {
			driver.findElement(By.linkText("+ Report Categories"));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static boolean isElementPresentWaitLong(WebDriver driver, By by) {
		try {
			WebElement elems = new WebDriverWait(driver, 300)
					.until(ExpectedConditions.visibilityOfElementLocated(by));
			System.out.println("lont time element found");
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public static boolean isElementPresent(By by) {
		try {
			WebElement elems = new WebDriverWait(driver, 15)
					.until(ExpectedConditions.visibilityOfElementLocated(by));
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public static String GenerateEmailPostFix() {
		Date now = new Date();
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyyMMddHHmmss");
		String datetext = dateformat.format(now);
		return datetext;
	}

	public static WebDriver openBrowserByURL(String browserName, String URL) {
		DataLoader Constant = new DataLoader();
		if (browserName.equals("Firefox")) {
			System.setProperty("webdriver.firefox.bin",
					Constant.get_CONFIGVARIABLE_WEBDRIVER_FIREFOX_BIN());

			FirefoxProfile profile = new FirefoxProfile();
			profile.setPreference(
					Constant.get_CONFIGVARIABLE_NETWORK_PROXY_TYPE(), 0);
			driver = new FirefoxDriver(profile);
			Log.info("New driver instantiated");
			driver.manage()
					.timeouts()
					.implicitlyWait(
							new Integer((Constant
									.get_CONFIGVARIABLE_IMPLICITLYWAIT())),
							TimeUnit.SECONDS);
			Log.info("Implicit wait applied on the driver for "
					+ (Constant.get_CONFIGVARIABLE_IMPLICITLYWAIT())
					+ " seconds");
			driver.manage()
					.timeouts()
					.pageLoadTimeout(
							new Integer(Constant
									.get_CONFIGVARIABLE_PAGE_LOAD_TIMEOUT()),
							TimeUnit.SECONDS);
			Log.info("Page timeout applied on the driver for "
					+ (Constant.get_CONFIGVARIABLE_PAGE_LOAD_TIMEOUT())
					+ " seconds");
			driver.get(URL);
			driver.manage().window().maximize();

			Log.info("Web application launched successfully");

		} else if (browserName.equals("IE")) {

			System.out.println("IE browser testing");
			System.setProperty("webdriver.ie.driver",
					(Constant.get_CONFIGVARIABLE_IE_DRIVER_PATH()));

			DesiredCapabilities capab = DesiredCapabilities.internetExplorer();
			capab.setCapability(
					InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
					true);
			driver = new InternetExplorerDriver(capab);
			Log.info("New driver instantiated");
			driver.manage()
					.timeouts()
					.implicitlyWait(
							new Integer((Constant
									.get_CONFIGVARIABLE_IMPLICITLYWAIT())),
							TimeUnit.SECONDS);
			Log.info("Implicit wait applied on the driver for "
					+ (Constant.get_CONFIGVARIABLE_IMPLICITLYWAIT())
					+ " seconds");
			driver.manage()
					.timeouts()
					.pageLoadTimeout(
							new Integer((Constant
									.get_CONFIGVARIABLE_PAGE_LOAD_TIMEOUT())),
							TimeUnit.SECONDS);
			Log.info("Page timeout applied on the driver for "
					+ (Constant.get_CONFIGVARIABLE_PAGE_LOAD_TIMEOUT())
					+ " seconds");
			driver.get(URL);
			Log.info("Web application launched successfully");

		} else {

			System.out.println("Non-supported browser");
		}

		return driver;
	}

	public static String alphabettimestamp(String Timestamp) {
		String alpa = Timestamp.replace("1", "a");
		String alpb = alpa.replace("2", "b");
		String alpc = alpb.replace("3", "c");
		String alpd = alpc.replace("4", "d");
		String alpe = alpd.replace("5", "e");
		String alpf = alpe.replace("6", "f");
		String alpg = alpf.replace("7", "g");
		String alph = alpg.replace("8", "h");
		String alpi = alph.replace("9", "i");
		String alpj = alpi.replace("0", "j");
		return alpj;
	}

}
