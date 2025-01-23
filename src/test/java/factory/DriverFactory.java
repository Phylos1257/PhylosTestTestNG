package factory;
 

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions; 
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.openqa.selenium.remote.RemoteWebDriver; 

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
 
	public static WebDriver initializeDriver(String browser) {
		WebDriver driver; 

		switch(browser.toLowerCase()){
	        case "chrome":
	            WebDriverManager.chromedriver().setup();
	            driver = new ChromeDriver();
	            driver.manage().window().maximize();
	            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				break; 
	        case "firefox":
	            WebDriverManager.chromedriver().setup();
	            driver =new FirefoxDriver();
	            driver.manage().window().maximize();
	            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	            break;
	        case "remotechrome": 
	            ChromeOptions chromeoptions= new ChromeOptions(); 
	            chromeoptions.setCapability("se:recordVideo", true);
				RemoteWebDriver remoteDriver;
				try {
					remoteDriver = new RemoteWebDriver(new URL("http://localhost:4444"),
	                		chromeoptions);
					driver=remoteDriver;
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					driver = null;
					e.printStackTrace();
				}   
	            break;
			default: 
				throw new IllegalStateException("INVALID BROWSER: " + browser);
			
		} 
		return driver;
	}
}
