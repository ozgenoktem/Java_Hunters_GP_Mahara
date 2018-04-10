
//OZGEN
//IMPLEMENT SECOND ONE
package com.mahara.step_definitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.mahara.pages.MaharaNewFilesNewJournalsPage;
import com.mahara.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

public class CreatingNewFilesAndJournalsStepDefinitions {
	
	MaharaNewFilesNewJournalsPage filesJournals=new MaharaNewFilesNewJournalsPage();
	private WebDriver driver = Driver.getDriver();
	
	@Then("^user click on Files button$")
	public void user_click_on_Files_button() {
	   filesJournals.filesButton.click();
	}

	@Then("^click Choose Files$")
	public void click_Choose_Files() {
		String file = "/Users/ozgenoktemkose/Desktop/06a8c541-2526-4d07-a816-50771a7fc352.jpg";
		filesJournals.uploadFile.sendKeys(file);
	}

	@Then("^upload two different files which are related to group project$")
	public void upload_two_different_files_which_are_related_to_group_project() {
		String file = "/Users/ozgenoktemkose/Desktop/06a8c541-2526-4d07-a816-50771a7fc352.jpg";
		filesJournals.uploadFile.sendKeys(file);
		
	}

	@Then("^user click create a folder button and named it \"([^\"]*)\"$")
	public void user_click_create_a_folder_button_and_named_it(String name) {
		filesJournals.createFolderBox.sendKeys(name);
	    filesJournals.createFolderButton.click();
	}

	@Then("^user click edit file button$")
	public void user_click_edit_file_button() {	
	   filesJournals.editButton.click();
	}

	@Then("^user change Comments radio button from Off to On$")
	public void user_change_Comments_radio_button_from_Off_to_On() {
	    filesJournals.clicking(filesJournals.onOff);
	}

	@Then("^user click Save Changes$")
	public void user_click_Save_Changes() {
	    filesJournals.saveChanges.click();
	}
	
	//2.scenario

	@Then("^user click on Journals button$")
	public void user_click_on_Journals_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user click New Entry button$")
	public void user_click_New_Entry_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user enter \"([^\"]*)\" into Title inbox$")
	public void user_enter_into_Title_inbox(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user click bold button in entry box$")
	public void user_click_bold_button_in_entry_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user enter \"([^\"]*)\" into entry box$")
	public void user_enter_into_entry_box(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user click Save Entry$")
	public void user_click_Save_Entry() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}



}
