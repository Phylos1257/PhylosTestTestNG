package steps;

import org.testng.ITestContext;
import org.testng.annotations.*;
 
import io.cucumber.testng.AbstractTestNGCucumberTests;
// here is the CucumberOptions should be testng
import io.cucumber.testng.CucumberOptions;

//"
//plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:target/failed.txt"})
@CucumberOptions(features="src/test/resources",
		glue= {"steps","hook"},
		tags = "@testNG",
		plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm","rerun:target/failed.txt"})
public class UITestRunnerTestNG extends AbstractTestNGCucumberTests {

	public UITestRunnerTestNG() {
		// TODO Auto-generated constructor stub
	}
	
	@DataProvider(parallel=true)
	@Override
	public Object[][] scenarios(){
		return super.scenarios();
	}
	
	@BeforeSuite
	public void beforSuite() {
		 
		System.out.println("before execution of suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("after execution of suite");
	}
	
	@BeforeClass
	public void beforeClass(ITestContext context) {
		System.out.println("before execution of class");
		// here will override the testng.xml data-provider-thread-count 
		//context.getCurrentXmlTest().getSuite().setDataProviderThreadCount(5);
	}

	@AfterClass
	public void afterClass() {
		System.out.println("after execution of class");
	}
}
