package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import base.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Initializer extends Base  {
	
	@Before
	public void beforHooks() {
		
	// All properties or codes which will execute before each scenario or scenario outline.
		String browserName = Base.getBrowser();
		switch(browserName) {
		case  "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "firFox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		case "IE":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
			
			default:
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();		
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(getPageLoadTime(), TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(getImplicitWati(), TimeUnit.SECONDS);
		// we can add any driver.manage properties here.
		
	}
	
	@After
	public void afterHooks() {
		Base.tearDown();
		
	}

}
