package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
  
import org.testng.Assert;
 
import context.PageContext; 
import factory.PageFactoryManager; 

public class OrangeHRMLiveSteps {
	//public WebDriver driver;
    private final LoginPage pageLogin ;
	private final PageContext context;
	
	public OrangeHRMLiveSteps(PageContext context) {
		this.context = context;
		pageLogin = PageFactoryManager.getLoginPage(context);
	}
	
	  @Given("User open browser and url")
	    public void user_open_browser_and_url()throws InterruptedException  {
	        System.out.println("User open browser and url"); 
	    	//System.out.println("remote"); 
			//WebDriverManager.chromedriver().setup();
			//driver= new ChromeDriver();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			//driver=CreateDriver.getDriver("remotechrome");
			//driver=CreateDriver.getDriver("chrome");
			context.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			Thread.sleep(2000);
			//driver.close();
			//Assert.assertTrue(false);
	    }

	    @Given("User click button logout")
	    public void user_click_button_logout() {
	        //Hook.delay(1);
	        System.out.println("User click button logout");
	        pageLogin.btnLogout();
	    }

//	    @Given("User refresh web HRM")
//	    public void user_refresh_web_HRM() {
//	        //Hook.delay(1);
//	        System.out.println("User refresh web HRM");
//	        driver.navigate().refresh();
//	    }

	    @When("User enter valid username")
	    public void user_enter_valid_username() {
	        System.out.println("User enter valid username");
	        logUs("Admin");
	       // pageLog.enterUsername("Admin");
	    }
	    

	    @When("User enter valid password")
	    public void user_enter_valid_password() {
	        System.out.println("User enter valid password");
	        logPas("admin123");
	        //pageLog.enterPassword("admin123");
	    }

	    @When("User click button login")
	    public void user_click_button_login() {
	        System.out.println("User click button login");
	        pageLogin.btnLogin();
	    }

//	    @When("User enter invalid username")
//	    public void user_enter_invalid_username() {
//	        System.out.println("User enter invalid username");
//	        //logUs("Yuhuu");
//	    }
//
//	    @When("User enter invalid password")
//	    public void user_enter_invalid_password() {
//	        System.out.println("User enter invalid password");
//	        //logPas("ardian");
//	    }

//	    @When("User empty username")
//	    public void user_empty_username() {
//	        System.out.println("User empty username");
//	       // logUs("");
//	    }
//
//	    @When("User empty password")
//	    public void user_empty_password() {
//	        System.out.println("User empty password");
//	        //logPas("");
//	        //Hook.delay(1);
//	    }

	    @Then("User go to page dashboard")
	    public void user_go_to_page_dashboard() throws InterruptedException {
	        System.out.println("User go to page dashboard");
	        Thread.sleep(10000);
	        Assert.assertEquals(pageLogin.getTxtDashboard(), "Dashboard");
	    }

	    
	    public void logUs(String user) {
	    	pageLogin.enterUsername(user);
	    }

	    public void logPas(String pass) {
	    	pageLogin.enterPassword(pass);
	    }
}
