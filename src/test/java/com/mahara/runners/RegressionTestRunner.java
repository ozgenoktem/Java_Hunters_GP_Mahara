package com.mahara.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class RegressionTestRunner {
	
	
	@CucumberOptions(
			
			plugin= {"pretty",
					"html:target/cucumber-report",
					"json:target/cucumber.json"
			},
			tags="@regression", //when you write tag and implement it in feature, it runs just with this tags
			features="src/test/resources/com/app/features/",		
			glue="com/app/step_definitions/",
			dryRun=false
			
			)

	public class CukesRunner extends AbstractTestNGCucumberTests{

}

}