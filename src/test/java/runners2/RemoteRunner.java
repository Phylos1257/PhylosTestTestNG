package runners2;

import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources",
glue= {"steps","hook"},
tags = "@remote",
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:target/failed.txt"})
public class RemoteRunner extends AbstractTestNGCucumberTests{

	public RemoteRunner() {
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
		context.getCurrentXmlTest().getSuite().setDataProviderThreadCount(5);
	}

	@AfterClass
	public void afterClass() {
		System.out.println("after execution of class");
	}

}
