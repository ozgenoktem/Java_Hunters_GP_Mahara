
//OZGEN
//NEEDS TO IMPLEMENT SECOND SCENARIO
package com.mahara.step_definitions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.mahara.pages.MaharaCreateProfilePage;
import com.mahara.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

public class CreatingNewProfileStepDefinitions {
	
	MaharaCreateProfilePage createProfile=new MaharaCreateProfilePage();
	private WebDriver driver = Driver.getDriver();
	
	@Then("^User click profile button$")
	public void user_click_profile_button() {
	   createProfile.profileButton.click();
	}

	@Then("^in the new page user enter \"([^\"]*)\" into introduction part$")
	public void in_the_new_page_user_enter_into_introduction_part(String note) throws InterruptedException {
		JavascriptExecutor jsEX = (JavascriptExecutor) driver;
		jsEX.executeScript("window.scrollBy(0,500);");
		
		Thread.sleep(1000);
		createProfile.introPart.sendKeys(note);
	}
	
	@Then("^click Save Profile$")
	public void click_Save_Profile() {
	   createProfile.saveButton.click();
	}

	@Then("^click Contact Information$")
	public void click_Contact_Information() {
	    createProfile.contactButton.click();
	}


	@Then("^user enter \"([^\"]*)\" into official website address box$")
	public void user_enter_into_official_website_address_box(String website) {
		JavascriptExecutor jsEX = (JavascriptExecutor) driver;
		jsEX.executeScript("window.scrollBy(0,200);");
		createProfile.websiteBox.sendKeys(website);
	}
	
	@Then("^user enter \"([^\"]*)\" into postal address box$")
	public void user_enter_into_postal_address_box(String address) {
		JavascriptExecutor jsEX = (JavascriptExecutor) driver;
		jsEX.executeScript("window.scrollBy(0,300);");
		createProfile.websiteBox.sendKeys(address);

	}
	
	@Then("^user enter \"([^\"]*)\" into city/region box$")
	public void user_enter_into_city_region_box(String city) {
		JavascriptExecutor jsEX = (JavascriptExecutor) driver;
		jsEX.executeScript("window.scrollBy(0,400);");
		createProfile.websiteBox.sendKeys(city);
	   
	}
	
	
	@Then("^user select \"([^\"]*)\" from country dropdown list$")
	public void user_select_from_country_dropdown_list(String arg1) {
		JavascriptExecutor jsEX = (JavascriptExecutor) driver;
		jsEX.executeScript("window.scrollBy(0,500);");
		createProfile.selectCountry();
	}
	
	
	@Then("^user enter mobile phone number \"([^\"]*)\"$")
	public void user_enter_mobile_phone_number(String phone) {
		JavascriptExecutor jsEX = (JavascriptExecutor) driver;
		jsEX.executeScript("window.scrollBy(0,800);");
		createProfile.phoneBox.sendKeys(phone);
	}

	@Then("^user click General part$")
	public void user_click_General_part() {
	    createProfile.generalButton.click();
	}

	
	@Then("^enter \"([^\"]*)\" into the occupation part$")
	public void enter_into_the_occupation_part(String occup) {
	   createProfile.occupation.sendKeys(occup);
	}

	
	@Then("^user should see \"([^\"]*)\"$")
	public void user_should_see(String arg1) {
	    assertTrue(createProfile.savePageVerify.getText().contains("Profile saved successfully"));
	}
	
	
	//SECOND SCENARIO
	//IT NEEDS IMPLEMENT

	@Then("^user click profile pictures$")
	public void user_click_profile_pictures() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^in the new page click choose file and upload new picture$")
	public void in_the_new_page_click_choose_file_and_upload_new_picture() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user enter \"([^\"]*)\" in the image title box$")
	public void user_enter_in_the_image_title_box(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user click Upload button$")
	public void user_click_Upload_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
}
