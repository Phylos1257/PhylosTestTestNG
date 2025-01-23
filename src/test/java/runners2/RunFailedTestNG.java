package runners2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import failedTestCases.ReTry;

@CucumberOptions(features="src/test/resources",
glue= {"steps","hook"},
tags = "@reTryTest",
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:target/failed.txt"})
public class RunFailedTestNG extends AbstractTestNGCucumberTests {

	public RunFailedTestNG() {
		// TODO Auto-generated constructor stub
	}
	
	@DataProvider(parallel=true)
	@Override
	public Object[][] scenarios(){
		return super.scenarios();
	}
	
	
// here is the reTry method in RunFailedTestNG.java	
// precondition - pom.xml or tstng.xml should has no config property listener  
//	<property>
//	<name>listener</name>
//	<value>failedTestCases.AnnotationTransformer</value>
//</property>
	/**  
    @Test(groups = "cucumber", 
    	  description = "Runs Cucumber Scenarios", 
    	 dataProvider = "scenarios",
    	 retryAnalyzer = ReTry.class 
    	 )
    @Override
    public void runScenario(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) {
        // the 'featureWrapper' parameter solely exists to display the feature
        // file in a test report
        super.runScenario(pickleWrapper,featureWrapper);
    }
     */

}
