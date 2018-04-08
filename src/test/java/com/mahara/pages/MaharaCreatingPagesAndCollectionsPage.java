package com.mahara.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mahara.utilities.Driver;

public class MaharaCreatingPagesAndCollectionsPage{
	
private WebDriver driver;
	
	public MaharaCreatingPagesAndCollectionsPage(){
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(linkText="Pages and collections")
	public WebElement pagesAndColl;
	
	@FindBy(id="addview-button")
	public WebElement addButton;
	
	@FindBy(id="add-collection-button")
	public WebElement collection;
	
	@FindBy(id="edit_name")
	public WebElement collectionName;
	
	@FindBy(id="edit_description")
	public WebElement collectDescription;
	
	@FindBy(id="edit_submit")
	public WebElement nextButton;
	
	@FindBy(linkText="Done")
	public WebElement Done;
	
	@FindBy(xpath="//div[@class='panel-quarter panel-collection']")
	public WebElement newCollData;
	
	@FindBy(id="add-view-button")
	public WebElement page;
	
	@FindBy(id="settings_title")
	public WebElement pageTitle;
	
	@FindBy(id="settings_description_ifr")
	public WebElement pageDescription;
	
	@FindBy(id="settings_submit")
	public WebElement Save;
	
	@FindBy(linkText="Display page")
	public WebElement displayButton;
	
	@FindBy(id="add_feedback_form_message_ifr")
	public WebElement comment;
	
	@FindBy(id="add_feedback_form_attachments_files_0")
	public WebElement uploadFile;
	
	@FindBy(id="add_feedback_form_submit")
	public WebElement commentButton;
	
	@FindBy(xpath="//div[@class='usericon-heading']")
	public WebElement newComment;
	
	@FindBy(xpath="//div[@class='usericon-heading']")
	public WebElement newPageData;
	
	@FindBy(xpath="//*[.='The attached file(s) have been added to your commentfiles folder']")
	public WebElement attachment;
	

}
