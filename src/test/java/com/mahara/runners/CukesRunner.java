package com.mahara.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin= {"pretty",
				"html:target/cucumber-report"
		},

	tags="@oz",
		features="src/test/resources/com/mahara/features/",
		glue="com/mahara/step_definitions",
		dryRun=false
		)
public class CukesRunner extends AbstractTestNGCucumberTests {

}

//