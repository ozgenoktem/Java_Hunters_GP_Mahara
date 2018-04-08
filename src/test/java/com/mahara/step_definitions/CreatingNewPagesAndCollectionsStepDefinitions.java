package com.mahara.step_definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import com.mahara.pages.MaharaCreatingPagesAndCollectionsPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

public class CreatingNewPagesAndCollectionsStepDefinitions {
	
	MaharaCreatingPagesAndCollectionsPage pagAndColl=new MaharaCreatingPagesAndCollectionsPage();
	
	@Then("^User click \"([^\"]*)\"$")
	public void user_click(String arg1) {
	  
		pagAndColl.pagesAndColl.click();
	}

	@Then("^User click Add button$")
	public void user_click_Add_button() {
		pagAndColl.addButton.click();
	}

	@Then("^User click on Collection$")
	public void user_click_on_Collection() throws InterruptedException {
		Thread.sleep(2000);
		pagAndColl.collection.click();
	}

	@Then("^User enter Collection name \"([^\"]*)\"$")
	public void user_enter_Collection_name(String name) {
		pagAndColl.collectionName.sendKeys(name);
	}

	@Then("^User enter Collection description \"([^\"]*)\"$")
	public void user_enter_Collection_description(String description) {
		pagAndColl.collectDescription.sendKeys(description);
	}

	@Then("^User click on Next:Edit collection pages button$")
	public void user_click_on_Next_Edit_collection_pages_button() {
		pagAndColl.nextButton.click();
	}

	@Then("^User click Done button$")
	public void user_click_Done_button() {
		pagAndColl.Done.click();
	}

	@Then("^User should see created data$")
	public void user_should_see_created_data() {
	  assertTrue(pagAndColl.newCollData.isDisplayed());
	}
	
	
	// Creating new Page

	@Then("^User click on Page$")
	public void user_click_on_Page() throws InterruptedException {
		Thread.sleep(2000);
		pagAndColl.page.click();
	}

	@Then("^User enter Page title \"([^\"]*)\"$")
	public void user_enter_Page_title(String title) {
		pagAndColl.pageTitle.clear();
		pagAndColl.pageTitle.sendKeys(title);
	}

	@Then("^User enter Page description \"([^\"]*)\"$")
	public void user_enter_Page_description(String description) {
		pagAndColl.pageDescription.sendKeys(description);
	}

	@Then("^User click on Save button$")
	public void user_click_on_Save_button() {
		pagAndColl.Save.click();
	}

	@Then("^User click on Display page button$")
	public void user_click_on_Display_page_button() {
		pagAndColl.displayButton.click();
	}

	@Then("^User add comment \"([^\"]*)\"$")
	public void user_add_comment(String comment){
		pagAndColl.comment.sendKeys(comment);
	}

	@Then("^User upload a file$")
	public void user_upload_a_file() {
	  String path="/Users/geemoff/Desktop/javaHunters.pdf";
	  pagAndColl.uploadFile.sendKeys(path);
	}

	@Then("^User click on Comment button$")
	public void user_click_on_Comment_button() {
		pagAndColl.commentButton.click();
	}

	@Then("^User should see created page and attached file$")
	public void user_should_see_created_page_and_attached_file() {
		  assertTrue(pagAndColl.newPageData.isDisplayed());
		  assertTrue(pagAndColl.newComment.isDisplayed());
		  assertTrue(pagAndColl.attachment.isDisplayed());
	}
	
}
