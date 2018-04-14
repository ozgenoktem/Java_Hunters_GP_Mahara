package com.mahara.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mahara.utilities.Driver;

public class MaharaNewFilesNewJournalsPage {
	
	
private WebDriver driver;
	
	public MaharaNewFilesNewJournalsPage(){
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(linkText="Files")
	public WebElement filesButton;
	
	@FindBy(id="files_filebrowser_userfile")
	public WebElement uploadFile;
	
	
	
	@FindBy(id="files_filebrowser_createfolder_name")
	public WebElement createFolderBox;
	
	@FindBy(id="files_filebrowser_createfolder")
	public WebElement createFolderButton;
	
	@FindBy(xpath="//*[.='Edit folder \"Project Docume\"']/..")
	public WebElement editButton;
	
	@FindBy(xpath="//span[@class='state-label off']")
	public WebElement onOff;
	
	@FindBy(xpath="//input[@value='Save changes']")
	public WebElement saveChanges;
	
	@FindBy(linkText="Journals")
	public WebElement journal;
	
	@FindBy(xpath="//a[@class='btn btn-default addpost']")
	public WebElement newEntry;
	
	@FindBy(xpath="//input[@class='form-control required text autofocus']")
	public WebElement journalTitle;
	
	@FindBy(xpath="(//div[@class='mce-widget mce-btn mce-first'])[1]")
	public WebElement boldButton;
	
	@FindBy(id="editpost_description_ifr")
	public WebElement journalInbox;
	
	@FindBy(xpath="//*[@id=\"editpost_submitpost\"]")
	public WebElement saveJournal;
	
	
	public void clicking(WebElement element) {
		JavascriptExecutor jse = (JavascriptExecutor)driver; 
		jse.executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);", element);
	}
	
	
	
	
	

}
