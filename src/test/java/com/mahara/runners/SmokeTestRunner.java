package com.mahara.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class SmokeTestRunner {
	
	
	@CucumberOptions(
			
			plugin= {"pretty",
					"html:target/cucumber-report",
					"json:target/cucumber.json"
			},
			
			tags="@smoke", //when you write tag and implement it in feature, it runs just with this tags
			features="src/test/resources/com/mahara/features/",		
			glue="com/mahara/step_definitions",
			dryRun=false
			
			)

	public class CukesRunner extends AbstractTestNGCucumberTests{

}

}
