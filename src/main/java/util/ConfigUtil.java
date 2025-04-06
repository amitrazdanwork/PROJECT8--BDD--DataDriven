package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtil {

	// Instance var
	private Properties prop;
	String url;

	// Constructor
	public ConfigUtil() {

		prop = new Properties();

		FileInputStream fin;
		try {
			fin = new FileInputStream("src\\test\\resources\\Config\\config.properties");
			prop.load(fin);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Properties got loaded successfully !!!! ");
		
	}

	// Methods

	// Method 1
	public String getBrowser() {
		String browser = (String) prop.get("browser");
        System.out.println("Browser name :"+browser);
		return browser;
	}
	
	// Method 2
	public String getDevice() {
		String device = (String) prop.get("device");
        System.out.println("Device name :"+device);
		return device;
	}
	
	// Method 3
	public String getExecutionType() {
		String device = (String) prop.get("execution_type");
        System.out.println("Execution name :"+device);
		return device;
	}

	// Method 2
	public String getSignInPageURL() {
		url = (String) prop.get("signinpageurl");
		return url;
	}

	// Method 2
	public String getCreateAnAccountPageURL() {
		url = (String) prop.get("createanaccountpageurl");
		return url;
	}

	// Method 2
	public String getForgotPasswordPageURL() {
		url = (String) prop.get("forgotpasswordpageurl");
		return url;
	}

	// Method 2
	public String getWhatsNewPageURL() {
		url = (String) prop.get("whatsnewpageurl");
		return url;
	}

	// Method 2
	public String getWomenPageURL() {
		url = (String) prop.get("womenpageurl");
		return url;
	}

	// Method 2
	public String getMenPageURL() {
		url = (String) prop.get("menpageurl");
		return url;
	}

	// Method 2
	public String getGearPageURL() {
		url = (String) prop.get("gearpageurl");
		return url;
	}

	// Method 2
	public String getTraningsPageURL() {
		url = (String) prop.get("trainingpageurl");
		return url;
	}

	// Method 2
	public String getSalePageURL() {
		url = (String) prop.get("salepageurl");
		return url;
	}
}
