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
	
	@FindBy (xpath="(//input[@type=\"text\"])[2]")
	public WebElement Title;
	//className="form-control required text autofocus") compound className are not permitted
	
	@FindBy (xpath="//textarea[@class=\"form-control textarea\"]")
	public WebElement textArea;
	
	@FindBy (xpath ="//button[@class=\"btn-primary submitcancel submit btn\"]")
	public WebElement savePlan;

}



