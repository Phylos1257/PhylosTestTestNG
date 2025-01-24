package steps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="@target/failed.txt",
glue= {"steps","hook"}, 
plugin = {"html:target/cucumber-reports.html"})
public class ReRunFailed extends AbstractTestNGCucumberTests {

	// 
	public ReRunFailed() {
		// TODO Auto-generated constructor stub
	}

}
