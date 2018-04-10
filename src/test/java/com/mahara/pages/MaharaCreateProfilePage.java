package com.mahara.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mahara.utilities.Driver;

public class MaharaCreateProfilePage {
	
private WebDriver driver;
	
	public MaharaCreateProfilePage(){
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(linkText="Profile")
	public WebElement profileButton;
	
	
	@FindBy(id="profileform_firstname")
	public WebElement firstnameBox;
	
	
	@FindBy(id="profileform_lastname")
	public WebElement lastnameBox;
	
	@FindBy(id="profileform_introduction_ifr")
	public WebElement introPart;
	
	@FindBy(id="profileform_submit")
	public WebElement saveButton;
	
	@FindBy(linkText="Contact information")
	public WebElement contactButton;
	
	@FindBy(id="profileform_mobilenumber")
	public WebElement phoneBox;
	
	@FindBy(id="profileform_officialwebsite")
	public WebElement websiteBox;
	
	@FindBy(id="profileform_address")
	public WebElement addressBox;
	
	@FindBy(id="profileform_city")
	public WebElement cityBox;
	
	@FindBy(id="profileform_country")
	public WebElement countryDropdown;
	
	@FindBy(linkText="General")
	public WebElement generalButton;
	
	@FindBy(id="profileform_occupation")
	public WebElement occupation;
	
	@FindBy(id="About me")
	public WebElement aboutMe;
	
	
	@FindBy(xpath="//div[.='Profile saved successfully']")
	public WebElement savePageVerify;
	
	@FindBy(linkText="Profile pictures")
	public WebElement profilePict;
	
	@FindBy(id="upload_file")
	public WebElement chooseFile;
	
	@FindBy(id="upload_title")
	public WebElement photoTitle;
	
	@FindBy(id="upload_submit")
	public WebElement uploadPhoto;

	
	public void selectCountry() {
		Select select = new Select(countryDropdown);
		select.selectByValue("us");
	}

}
