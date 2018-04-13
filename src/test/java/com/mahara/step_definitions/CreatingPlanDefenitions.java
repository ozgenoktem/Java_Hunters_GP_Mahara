package com.mahara.step_definitions;

import com.mahara.pages.MaharaPlanPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreatingPlanDefenitions {
	
	MaharaPlanPage plan=new MaharaPlanPage();
	
	
	@Then("^User clicks on Plans button$")
	public void user_clicks_on_Plans_button()  {
	//	Thread.sleep(500);
	   plan.Plans.click();

	}

	@Then("^User clics on New plan button$")
	public void user_clics_on_New_plan_button() {
	  plan.newPlan.click();
	}

	@When("^user fills up Title field with \"([^\"]*)\"$")
	public void user_fills_up_Title_field_with(String title) throws InterruptedException {
		Thread.sleep(500);
		plan.Title.sendKeys(title);
	   
	}

	@When("^user fills up Description field with\"([^\"]*)\"$")
	public void user_fills_up_Description_field_with(String description) {
		plan.textArea.sendKeys(description);
	  
	}

	@Then("^User click Save plan button$")
	public void user_click_Save_plan_button() {
	   
	 plan.savePlan.click();
	}

}
