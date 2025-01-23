package hook;
 

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import context.PageContext;
import factory.CreateDriver;
import factory.DriverFactory;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
 

public class Hooks {
	private WebDriver driver;
	private final PageContext context;
	

	/**
	 * Dependency Injection using Pico container
	 */
	public Hooks(PageContext context) {
		this.context = context;
	}

	
	@Before(value="@chrome",order=0)
	public void chromesetUp(Scenario scenario) {
		//CreateDriver.getDriver();
		System.out.println("before setUp");
	}
	
	@Before
	public void setUp(Scenario scenario) {
		System.out.println("before setUp");
		System.out.println(
				"BEFORE: THREAD ID : " + Thread.currentThread().threadId()+ "," + "SCENARIO NAME: " + scenario.getName());
		//(System.getProperty(PARAMETER_BROWSER,  BROWSER_CHROME));
		//CreateDriver.getDriver();
		driver = DriverFactory.initializeDriver("chrome");
		context.setDriver(driver);
	}
	@After()
	public void tearDown(Scenario scenario) {
		System.out.println(
				"AFTER: THREAD ID : " + Thread.currentThread().threadId() + "," + "SCENARIO NAME: " + scenario.getName());
 
		//CreateDriver.closeDriver();;

		driver.quit();
	}
	
	@BeforeStep()
	public void actionBeforeStep(Scenario scenario) {
		System.out.println("before step action");
	}
	@AfterStep()
	public void actionAfterStep(Scenario scenario) {
	
		if(scenario.isFailed()) {
			System.out.println("after step action");
			// TakesScreenshot takeScreenshot = (TakesScreenshot) CreateDriver.getDriver("remotechrome");
			TakesScreenshot takeScreenshot = (TakesScreenshot) context.getDriver();
			
			byte [] screenshot = takeScreenshot.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot,"image/png",screenshot.toString());
		}
	}
}
