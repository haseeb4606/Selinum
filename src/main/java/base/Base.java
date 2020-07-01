package base;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class Base {

	public static WebDriver driver;
	public static Properties properties;
	private String userDirectory = System.getProperty("user.dir"); 
	private String pathToProperty = "\\src\\test\\resources\\InputDate\\Property.properties";
	private String ppfile = userDirectory + pathToProperty;
	public Logger logger;

	public Base() {

		try {
			// read the text by character from property file
			BufferedReader bufferedReader;
			bufferedReader = new BufferedReader(new FileReader(ppfile));
			properties = new Properties();
			try {
				properties.load(bufferedReader);
				bufferedReader.close();

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getBrowser() {
		
		String browser = properties.getProperty("browser");
		return browser;
	}
	
	public static String getUrl() {
		String url = properties.getProperty("url");
		return url;
	}
	
	public static Long getPageLoadTime() {
		String pageLoad = properties.getProperty("pageload");
		return Long.parseLong(pageLoad);
	}
	
	public static Long getImplicitWati() { 
	String impWait =  properties.getProperty("implicitwait");
	return Long.parseLong(impWait);
	
	}
	
	public static void initialize() {
		driver.get(getUrl());
		
	}
	public static void tearDown() {
		driver.quit();
	}
}
