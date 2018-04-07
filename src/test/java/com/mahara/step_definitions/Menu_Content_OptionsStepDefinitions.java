
//OZGEN

//IT DIDNT PASS
package com.mahara.step_definitions;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mahara.pages.MaharaLoginPage;
import com.mahara.pages.MaharaMenu_ContentPage;
import com.mahara.pages.MainPage;
import com.mahara.utilities.BrowserUtils;
import com.mahara.utilities.Configuration;
import com.mahara.utilities.Driver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Menu_Content_OptionsStepDefinitions {
	private WebDriver driver = Driver.getDriver();
	MaharaLoginPage loginPage = new MaharaLoginPage();
	MainPage mainPage = new MainPage();
	MaharaMenu_ContentPage contentPage = new MaharaMenu_ContentPage();

	@When("^User log into Mahara webpage by using account information$")
	public void user_log_into_Mahara_webpage_by_using_account_information() {
		driver.get(Configuration.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		loginPage.login(Configuration.getProperty("username"), Configuration.getProperty("password"));
	}
	

	@When("^User click menu button$")
	public void user_click_menu_button() throws InterruptedException {
		Thread.sleep(1000);
		mainPage.menuButton.click();
	}
	

	@Then("^following menu options should be visible for Menu option$")
	public void following_menu_options_should_be_visible_for_Menu_option(String name, List<WebElement>options) throws InterruptedException {

		// capture list of webelements
		List<WebElement> topMenuOptions = contentPage.topMenuOptions(name);
		// get their text in a list
		System.out.println("Top Menu Options: "+topMenuOptions);
		
		List<String> topMenuOptionsString = BrowserUtils.getElementsText(topMenuOptions);
		// compare the list with options
		System.out.println("Strings: "+topMenuOptionsString);
		
		assertEquals(topMenuOptionsString.size(), options.size(), "Number of expected menu options did not match");
		for (int i = 0; i < options.size(); i++) {
			assertEquals(topMenuOptionsString.get(i), options.get(i));
		}

	}

	@Then("^User click content button$")
	public void user_click_content_button() throws InterruptedException {
		Thread.sleep(2000);
		contentPage.contentButton.click();
	}
	

	@Then("^following menu options should be visible for Content option$")
	public void following_menu_options_should_be_visible_for_Content_option() throws InterruptedException {
		
		List<WebElement> contentOption=contentPage.contentOptionList(contentPage.contentOptions.getText());
		System.out.println("Content Options: "+contentOption);
		
		List<String> ContentOptionsString = BrowserUtils.getElementsText(contentOption);
		System.out.println("Strings: "+ContentOptionsString);
		
		assertEquals(ContentOptionsString.size(), contentOption.size(), "Number of expected menu options did not match");
		for (int i = 0; i < contentOption.size(); i++) {
			assertEquals(ContentOptionsString.get(i), contentOption.get(i));
		
		
		
		}
	}

}


