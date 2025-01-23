package steps;
 
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 

import context.PageContext; 
import io.cucumber.java.en.*; 

public class FirstVistStep {
	private WebDriver driver;
	private final PageContext context;
	public FirstVistStep(PageContext context) {
		this.context =context;
		driver = context.getDriver();
	}
	 
	@Given("I want to vist the google for TestNG")
	public void I_want_to_vist_the_google_for_testNG()throws InterruptedException {
		System.out.println("1111"); 
		//WebDriverManager.chromedriver().setup();
		//driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//driver=CreateDriver.getDriver("chrome");
		context.getDriver().get("https://www.google.com");
		//driver.close();
		Thread.sleep(1000);
		//driver.close();
		//Assert.assertTrue(false);
	}
	
	// test for the failed cases will retry 2 times
	@Given("I want to vist the google failed")
	public void I_want_to_vist_the_google_failed() throws InterruptedException {
		System.out.println("failed test ");  
		//driver=CreateDriver.getDriver("chrome");
		driver.get("https://www.google.com");

		Thread.sleep(1000);
		Assert.assertTrue(false);
	}
	
	@Given("I want to vist the google")
	public void I_want_to_vist_the_google() throws InterruptedException {
		System.out.println("rrrrr"); 
//		WebDriverManager.chromedriver().setup();
//		driver= new ChromeDriver();
		//CreateDriver.getInstance().setDriver("chrome");
		//driver=CreateDriver.getDriver("chrome");
		driver.get("https://www.google.com");

		Thread.sleep(1000);
		driver.close();
	}
	
	
	@Given("I want to vist the google from selenium grid")
	public void I_want_to_vist_the_google_from_selenium_grid()throws InterruptedException {
		System.out.println("remote"); 
		//WebDriverManager.chromedriver().setup();
		//driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//driver=CreateDriver.getDriver("remotechrome");
		driver.get("https://www.google.com");
		
		//driver.close();
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("selenium"); 
		//driver.close();
		//Assert.assertTrue(false);
		Thread.sleep(5000);
	}
	
	//some other precondition
	@And("some other precondition")
	public void some_other_precondition() {
		System.out.println("search with text "); 
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("btnK")).click();
		
	}
	 
	
	@Then("I validate the outcomes")
	public void I_validate_the_outcomes() {
		System.out.println("click search"); 
	}
	
	@Given("I want to vist the google2")
	public void I_want_to_vist_the_google2() {
		System.out.println("5555"); 
	}
	
	//some other precondition
	@And("some other precondition2")
	public void some_other_precondition2() {
		System.out.println("6666"); 
	}
	 
	
	@Then("I validate the outcomes2")
	public void I_validate_the_outcomes2() {
		System.out.println("7777"); 
	}
	
	
}
