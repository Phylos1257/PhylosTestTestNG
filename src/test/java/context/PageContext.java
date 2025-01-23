package context;

import org.openqa.selenium.WebDriver;

public class PageContext {
	private WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public PageContext() {
		// TODO Auto-generated constructor stub
	}

}
