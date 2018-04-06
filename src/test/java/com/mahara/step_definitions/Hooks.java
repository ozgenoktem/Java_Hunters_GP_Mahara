package com.mahara.step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.mahara.utilities.Driver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	@Before
	public void setUp(Scenario scenario) {
		WebDriver driver = Driver.getDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}

	@After
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
		//taking a screenshot 
		final byte[] screenshot = ((TakesScreenshot) 
				Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
		//adding a screenshot to the report
		scenario.embed(screenshot, "image/png");
		}
		Driver.closeDriver();  //commented out temporary
	}
}
