package org.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

	
	@RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/resources",tags= {"@login,@addtrip"},glue= "org.stepdefinition",plugin= {"html:target/Reports"})
	public class Testrunner{
		
	}

