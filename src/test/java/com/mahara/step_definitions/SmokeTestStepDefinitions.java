package com.mahara.step_definitions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mahara.pages.MaharaCreateProfilePage;
import com.mahara.pages.MaharaNewFilesNewJournalsPage;
import com.mahara.pages.MainPage;
import com.mahara.utilities.Driver;

import cucumber.api.java.en.Then;

public class SmokeTestStepDefinitions {
	
	//COMPLETED

	MaharaCreateProfilePage profilePage = new MaharaCreateProfilePage();
	MainPage main=new MainPage();
	MaharaNewFilesNewJournalsPage files=new MaharaNewFilesNewJournalsPage();
	private WebDriver driver = Driver.getDriver();

	@Then("^verify first name and user name input boxes$")
	public void verify_first_name_and_user_name_input_boxes() throws InterruptedException {

		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("profileform_firstname")));
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("profileform_lastname")));

		
		System.out.println(profilePage.firstnameBox.getAttribute("value"));
		System.out.println(profilePage.lastnameBox.getAttribute("value"));

		assertTrue(profilePage.firstnameBox.getAttribute("value").trim().contains("huntjava"));
		assertTrue(profilePage.lastnameBox.getAttribute("value").trim().contains("aa"));
	}
	
	@Then("^User click Portfolio Page button$")
	public void user_click_Portfolio_Page_button() {
		main.portfolioButton.click();
	}
	
	@Then("^User click Pages and collections$")
	public void user_click_Pages_and_collections() {
	   main.pagesColl.click();
	}
	

	@Then("^click LogOut and verify you have been logged out successfully$")
	public void click_LogOut_and_verify_you_have_been_logged_out_successfully() {
		files.clicking(main.profilePage);
		files.clicking(main.LogOut);
	}
}
