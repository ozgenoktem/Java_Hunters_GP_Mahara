package com.mahara.step_definitions;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;


import com.mahara.pages.MaharaResumePage;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreatingNewResumeStepDefenition {
	
	MaharaResumePage resume=new MaharaResumePage();
	
	
	
	@When("^User clicks on main menu button$")
	public void user_clicks_on_main_menu_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	
	@Then("^User clicks on content button$")
	public void user_clicks_on_content_button() {
		resume.contentDropBoxButton.click();

	    throw new PendingException();
	}

	@Then("^User clicks on Resume button$")
	public void user_clicks_on_Resume_button() {
		resume.Resume.click();
	
	    throw new PendingException();
	}

	@Then("^following tab options should be visible for Resume:$")
	public void following_tab_options_should_be_visible_for_Resume(DataTable arg1) {
	
	
		
		
	/*	
		// capture list of webelements
		List<WebElement> topMenuOptions = dashbboard.topMenuOptions(menu);
		// get their text in a list
		List<String> topMenuOptionsString = BrowserUtils.getElementsText(topMenuOptions);
		// compare the list with options
		assertEquals(topMenuOptionsString.size(), options.size(), "Number of expected menu options did not match");
		for (int i = 0; i < options.size(); i++) {
			assertEquals(topMenuOptionsString.get(i), options.get(i));
		}

	}

}*/

		
		
		/*
		 * 
		 * 
		 * Introduction            |
      | Education and employment|
      | Achievements            |
      | Goals and Skills        |
      | Interests     
		 * 
		 */
		
	    throw new PendingException();
	}

	@Given("^User is on Resume page$")
	public void user_is_on_Resume_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Introduction option is selected #default$")
	public void introduction_option_is_selected_default() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user selects date of birth as \"([^\"]*)\"$")
	public void user_selects_date_of_birth_as(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user selects Gender identity as \"([^\"]*)\" at the gender$")
	public void user_selects_Gender_identity_as_at_the_gender(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user clicks Save Button$")
	public void user_clicks_Save_Button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Education and employment option is selected$")
	public void education_and_employment_option_is_selected() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Under Education history tab user clicks on Add button$")
	public void under_Education_history_tab_user_clicks_on_Add_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Under Employment history tab user clicks on Add button$")
	public void under_Employment_history_tab_user_clicks_on_Add_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user fills up the following fields in Education history tab:   :$")
	public void user_fills_up_the_following_fields_in_Education_history_tab(DataTable arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc).
	    // Field names for YourType must match the column names in 
	    // your feature file (except for spaces and capitalization).
	    throw new PendingException();
	}

	@Then("^user fills up the following fields in Employment history tab:$")
	public void user_fills_up_the_following_fields_in_Employment_history_tab(DataTable arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc).
	    // Field names for YourType must match the column names in 
	    // your feature file (except for spaces and capitalization).
	    throw new PendingException();
	}

	@Then("^Under Education history tab user clicks on Choose File button$")
	public void under_Education_history_tab_user_clicks_on_Choose_File_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^User uploads Resume$")
	public void user_uploads_Resume() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^User click Save button$")
	public void user_click_Save_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
// ts
//step def