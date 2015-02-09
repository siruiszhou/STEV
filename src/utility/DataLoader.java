package utility;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


public class DataLoader {
	public static String localSite = null;
	public static String siteEnv = null;
	private String HomePageURL;
	private String LOG_CONFIGURE_XML;
	private String CONFIGVARIABLE_WEBDRIVER_FIREFOX_BIN;
	private String CONFIGVARIABLE_NETWORK_PROXY_TYPE;
	private String CONFIGVARIABLE_IMPLICITLYWAIT;
	private String CONFIGVARIABLE_PAGE_LOAD_TIMEOUT;
	private String CONFIGVARIABLE_IE_DRIVER_PATH;
	private String PIPURL;
	private String PDPURL;
	private String PLPURL;
	private String CATALOGUEURL;
	private String FirstName;
	private String logonid;
	private String password;
	private String sampleURL;
	private String searchTermPLP;
	private String searchTermNoResult;
	private String searchTermTooManyResult;
	private String RegCountry;
	private String RegCountryP;
	private String Country;
	private String POSTCODE;
	private String SKUNUM;
	private String IncorrectAccNum;
	private String IncorrectPostcode;
	private String CorrectAccNum;
	private String CorrectPostcode;
	private String ParentName;
	private String ParentCompany;
	private String InvalidPromoCode;
	private String tenPerOffPromoCode;
	private String tenDorOffPromoCode;
	private String CreditCardNum;
	private String CreditCardCVS;

	public String get_HomePageURL() {
		this.HomePageURL = XMLreader("HomePageURL");
		return HomePageURL;
	}

	public String get_LOG_CONFIGURE_XML() {
		this.LOG_CONFIGURE_XML = XMLreader("LOG_CONFIGURE_XML");
		return LOG_CONFIGURE_XML;
	}

	public String get_CONFIGVARIABLE_WEBDRIVER_FIREFOX_BIN() {
		this.CONFIGVARIABLE_WEBDRIVER_FIREFOX_BIN = XMLreader("CONFIGVARIABLE_WEBDRIVER_FIREFOX_BIN");
		return CONFIGVARIABLE_WEBDRIVER_FIREFOX_BIN;
	}

	public String get_CONFIGVARIABLE_NETWORK_PROXY_TYPE() {
		this.CONFIGVARIABLE_NETWORK_PROXY_TYPE = XMLreader("CONFIGVARIABLE_NETWORK_PROXY_TYPE");
		return CONFIGVARIABLE_NETWORK_PROXY_TYPE;
	}

	public String get_CONFIGVARIABLE_IMPLICITLYWAIT() {
		this.CONFIGVARIABLE_IMPLICITLYWAIT = XMLreader("CONFIGVARIABLE_IMPLICITLYWAIT");
		return CONFIGVARIABLE_IMPLICITLYWAIT;
	}

	public String get_CONFIGVARIABLE_PAGE_LOAD_TIMEOUT() {
		this.CONFIGVARIABLE_PAGE_LOAD_TIMEOUT = XMLreader("CONFIGVARIABLE_PAGE_LOAD_TIMEOUT");
		return CONFIGVARIABLE_PAGE_LOAD_TIMEOUT;
	}

	public String get_CONFIGVARIABLE_IE_DRIVER_PATH() {
		this.CONFIGVARIABLE_IE_DRIVER_PATH = XMLreader("CONFIGVARIABLE_IE_DRIVER_PATH");
		return CONFIGVARIABLE_IE_DRIVER_PATH;
	}

	public String get_PIPURL() {
		this.PIPURL = XMLreader("PIPURL");
		return PIPURL;
	}

	public String get_PDPURL() {
		this.PDPURL = XMLreader("PDPURL");
		return PDPURL;
	}

	public String get_PLPURL() {
		this.PLPURL = XMLreader("PLPURL");
		return PLPURL;
	}

	public String get_CATALOGUEURL() {
		this.CATALOGUEURL = XMLreader("CATALOGUEURL");
		return CATALOGUEURL;
	}

	public String get_FirstName() {
		this.FirstName = XMLreader("FirstName");
		return FirstName;
	}

	public String get_logonid() {
		this.logonid = XMLreader("Logonid");
		return logonid;
	}

	public String get_password() {
		this.password = XMLreader("Password");
		return password;
	}

	public String get_sampleURL() {
		this.sampleURL = XMLreader("SAMPLE_SKU_URL");
		return sampleURL;
	}

	public String get_searchTermPLP() {
		this.searchTermPLP = XMLreader("SearchTermPLP");
		return searchTermPLP;
	}

	public String get_searchTermNoResult() {
		this.searchTermNoResult = XMLreader("SearchTermNoResult");
		return searchTermNoResult;
	}

	public String get_searchTermTooManyResult() {
		this.searchTermTooManyResult = XMLreader("SearchTermTooManyResult");
		return searchTermTooManyResult;
	}

	public String get_RegCountry() {
		this.RegCountry = XMLreader("RegCountry");
		return RegCountry;
	}

	public String get_RegCountryP() {
		this.RegCountryP = XMLreader("RegCountryP");
		return RegCountryP;
	}

	public String get_Country() {
		this.Country = XMLreader("Country");
		return Country;
	}

	public String get_POSTCODE() {
		this.POSTCODE = XMLreader("PostCode");
		return POSTCODE;
	}

	public String get_SKUNUM() {
		this.SKUNUM = XMLreader("SKUNUM");
		return SKUNUM;
	}

	public String get_IncorrectAccNum() {
		this.IncorrectAccNum = XMLreader("IncorrectAccountNumber");
		return IncorrectAccNum;
	}

	public String get_IncorrectPostcode() {
		this.IncorrectPostcode = XMLreader("IncorrectPostCode");
		return IncorrectPostcode;
	}

	public String get_CorrectAccNum() {
		this.CorrectAccNum = XMLreader("CorrectAccountNumber");
		return CorrectAccNum;
	}

	public String get_CorrectPostcode() {
		this.CorrectPostcode = XMLreader("CorrectPostCode");
		return CorrectPostcode;
	}

	public String get_ParentName() {
		this.ParentName = XMLreader("ParentName");
		return ParentName;
	}

	public String get_ParentCompany() {
		this.ParentCompany = XMLreader("ParentCompany");
		return ParentCompany;
	}

	public String get_InvalidPromoCode() {
		this.InvalidPromoCode = XMLreader("InvalidPromo");
		return InvalidPromoCode;
	}

	public String get_tenPerOffPromoCode() {
		this.tenPerOffPromoCode = XMLreader("tenperoffPromo");
		return tenPerOffPromoCode;
	}

	public String get_tenDorOffPromoCode() {
		this.tenDorOffPromoCode = XMLreader("tendoroffPromo");
		return tenDorOffPromoCode;
	}

	public String get_CreditCardNum() {
		this.CreditCardNum = XMLreader("CreditCardNum");
		return CreditCardNum;
	}
	
	public String get_CreditCardCVS() {
		this.CreditCardCVS = XMLreader("CreditCardCVS");
		return CreditCardCVS;
	}

	private String XMLreader(String Nodename) {

		SAXReader reader = new SAXReader();
		String nodevalue = null;
		try {
			String configfile = "data/ConfigXML_" + localSite + "_" + siteEnv
					+ ".xml";
			//System.out.println(configfile);
			Document doc = reader.read(configfile);
			Element root = doc.getRootElement();
			List list = root.elements();
			for (Object obj : list) {
				List nextLevel = ((Element) obj).elements();
				for (Object objn : nextLevel) {
					Element element = (Element) objn;
					if (element.getName() == Nodename) {
						nodevalue = element.getText();
					}
				}
			}
		} catch (Exception e) {
			System.out.println("XML Node " + Nodename + " value Not Found");
		}
		return (nodevalue);

	}
}
