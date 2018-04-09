package com.mahara.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mahara.utilities.Driver;

public class MaharaResumePage {
	private WebDriver driver;

	public MaharaResumePage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	//

	@FindBy(xpath = "//span[@class='icon icon-bars icon-lg']")
	public WebElement menuButton;

	@FindBy(xpath = "//navbar-showchildren navbar-toggle dropdown-toggle collapsed")
	public WebElement contentDropBoxButton;

	@FindBy(linkText = "Résumé")
	public WebElement Resume;

	@FindBy(id = "personalinformation_dateofbirth")
	public WebElement dateOfBirth;

	@FindBy(xpath = "//li[@class=\" current-tab active\"]")
	//// a[contains(text(),'Introduction')]
	public WebElement Introduction;

	@FindBy(xpath = "//a[contains(text(),'Education and employment')]")
	public WebElement educationAndEmployment;

	@FindBy(xpath = "//a[contains(text(),'Achievements')]")
	public WebElement Achievements;

	@FindBy(xpath = "//a[contains(text(),'Goals and skills')]")
	public WebElement goalsAndSkills;

	@FindBy(xpath = "//a[contains(text(),'Interests')]")
	public WebElement Interests;

	@FindBy(linkText = "personalinformation_gendera2f0")
	public WebElement Woman;

	@FindBy(id = "personalinformation_save")
	public WebElement saveButton;

	// Education and employment
	@FindBy(id = "addeducationhistorybutton")
	public WebElement addEducationHistoryButton;

	@FindBy(id = "addeducationhistory_startdate")
	public WebElement educationStartDate;

	@FindBy(id = "addeducationhistory_institution")
	public WebElement Institution;

	@FindBy(xpath = "//input[@name='addeducationhistory_attachments_files_0']")
	public WebElement attachFile;

	@FindBy(id = "addemploymenthistorybutton")
	public WebElement addEmploymentHistoryButton;

	@FindBy(id = "addemploymenthistory_startdate_container")
	public WebElement employmentStartDate;

	@FindBy(id = "addemploymenthistory_employer_container")
	public WebElement Employer;

	@FindBy(id = "addemploymenthistory_jobtitle_container")
	public WebElement jobTitle;

	public void clickButton(WebElement element) {
		element.click();
	}

	public void scrollDown(WebElement element) {
		JavascriptExecutor jsExecuter = (JavascriptExecutor) driver;
		jsExecuter.executeScript("arguments[0].scrollIntoView(true)", element);
		jsExecuter.executeScript("arguments[0].click();", element);
	}
	
	

}

