package factory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateDriver {

//	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
//	private static CreateDriver INSTANCE; 
//	
//	private CreateDriver() {
//		// TODO Auto-generated constructor stub
//	}
//	
//	public static CreateDriver getInstance() { 
//		if(INSTANCE ==null) {
//			
//			System.out.println("create inst1 =   " );
//			INSTANCE = new CreateDriver();
//		}
//		System.out.println("create inst2 =   " );
//		return INSTANCE;
//	}
//
//	public void setDriver(String browser) {
//		switch (browser.toLowerCase()) {
//			case "chrome":
//				WebDriverManager.chromedriver().setup();
//				driver.set(new ChromeDriver());
//				break;
//			case "firefox":
//				WebDriverManager.firefoxdriver().setup();
//				driver.set(new FirefoxDriver());
//				break;
//			default:
//				throw new IllegalArgumentException("");
//		}
//		WebDriverManager.chromedriver().setup();
//		driver.set(new ChromeDriver());
//	}
//	
//	public static WebDriver getDriver(String browserType) {
//		 if(driver.get() == null){
//	            /*
//	            We read our browserType from configuration.properties.
//	            This way, we can control which browser is opened from outside our code, from configuration.properties.
//	            */ 
//	            switch(browserType.toLowerCase()){
//	                case "chrome":
//	                    WebDriverManager.chromedriver().setup();
//	                    driver.set(new ChromeDriver());
//	                    driver.get().manage().window().maximize();
//	                    driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	                    break;
//	                case "firefox":
//	                    WebDriverManager.chromedriver().setup();
//	                    driver.set(new FirefoxDriver());
//	                    driver.get().manage().window().maximize();
//	                    driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	                    break;
//	                case "remotechrome": 
//	                    ChromeOptions chromeoptions= new ChromeOptions(); 
//	                    chromeoptions.setCapability("se:recordVideo", true);
//						RemoteWebDriver remoteDriver;
//						try {
//							remoteDriver = new RemoteWebDriver(new URL("http://localhost:4444"),
//		                    		chromeoptions);
//							driver.set(remoteDriver);
//						} catch (MalformedURLException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//		                    
//		                break;
//	            }
//	        }
//	       // return driverPool.get();
//		return driver.get();
//	}
	
    
//    public static void closeDriver(){
//        if (driver.get() != null){
//        	driver.get().quit();
//        	driver.remove();
//        }
//    }

}
