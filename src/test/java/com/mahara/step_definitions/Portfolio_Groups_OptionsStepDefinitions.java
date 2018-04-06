package com.mahara.step_definitions;

import static org.testng.Assert.assertEquals;
import java.util.List;
import org.openqa.selenium.WebElement;
import com.mahara.pages.MaharaPortfolio_GroupsOptionsPage;
import com.mahara.utilities.BrowserUtils;
import cucumber.api.java.en.Then;

public class Portfolio_Groups_OptionsStepDefinitions {
	MaharaPortfolio_GroupsOptionsPage portGroupPage=new MaharaPortfolio_GroupsOptionsPage();
	
	@Then("^User click to drop down box which next to (Portfolio|Groups)$")
	public void user_click_to_drop_down_box_which_next_to_Portfolio(String menu) throws InterruptedException {
		switch(menu) {
		
		case "Portfolio":
		Thread.sleep(2000);
		portGroupPage.portfolioDropDownBox.click();
		break;
		
		case "Groups":
			Thread.sleep(2000);
			portGroupPage.groupsDropDownBox.click();
			break;
		}
		
	}

	@Then("^following menu options should be visible for (Portfolio|Groups) option$")
	public void following_menu_options_should_be_visible_for_Portfolio_option(String menu,List<String> options) throws InterruptedException {
		 List<WebElement> topMenuOptions = portGroupPage.topMenuOptions(menu);
		 List<String> topMenuOptionsString=BrowserUtils.getElementsText(topMenuOptions);
		
		 assertEquals(topMenuOptionsString.size(), options.size(),
				 "Number of expected menu options did not match");
		 
		 for (int i = 0; i < options.size(); i++) {
			
			 assertEquals(topMenuOptionsString.get(i), options.get(i));
		}
		 	
	}
}
