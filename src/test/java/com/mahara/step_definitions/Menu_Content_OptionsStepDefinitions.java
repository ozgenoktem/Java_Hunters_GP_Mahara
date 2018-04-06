package com.mahara.step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.mahara.pages.MaharaLoginPage;
import com.mahara.pages.MainPage;
import com.mahara.utilities.Configuration;
import com.mahara.utilities.Driver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Menu_Content_OptionsStepDefinitions {
	private WebDriver driver = Driver.getDriver();
	MaharaLoginPage loginPage=new MaharaLoginPage();
	MainPage mainPage=new MainPage();
	
	@When("^User log into Mahara webpage by using account information$")
	public void user_log_into_Mahara_webpage_by_using_account_information() {
		driver.get(Configuration.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		loginPage.login(Configuration.getProperty("username"), Configuration.getProperty("password"));
	}
	
	@When("^User click menu button$")
	public void user_click_menu_button() {
		mainPage.menuButton.click();
	}

	@Then("^following menu options should be visible for Menu option$")
	public void following_menu_options_should_be_visible_for_Menu_option(DataTable arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc).
	    // Field names for YourType must match the column names in 
	    // your feature file (except for spaces and capitalization).
	    throw new PendingException();
	}

	@Then("^User click content button$")
	public void user_click_content_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^following menu options should be visible for Content option$")
	public void following_menu_options_should_be_visible_for_Content_option(DataTable arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc).
	    // Field names for YourType must match the column names in 
	    // your feature file (except for spaces and capitalization).
	    throw new PendingException();
	}



}
