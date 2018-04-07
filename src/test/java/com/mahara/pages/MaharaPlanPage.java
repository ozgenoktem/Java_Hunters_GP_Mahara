package com.mahara.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mahara.utilities.Driver;

public class MaharaPlanPage {
	
	private WebDriver driver;

	public MaharaPlanPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Plans")
	public WebElement Plans;
	
	@FindBy(xpath="//a[@class='btn btn-default']")
	public WebElement newPlan;
	
	@FindBy (id="addplan_title_container")
	public WebElement Title;
	
	@FindBy (xpath="form-control textarea")
	public WebElement textArea;

}



