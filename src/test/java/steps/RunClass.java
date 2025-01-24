package steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/login.feature",
glue= {"steps"},
plugin = {"pretty", "html:target/reports.html"},
tags = "@tag")
//---- other plugin format 
// plugin = {"pretty", "json:target/cucumber.json"}
// plugin = {"pretty", "junit:target/cucumber.xml"}
// this for junit test example runner
public class RunClass {

	 
}
