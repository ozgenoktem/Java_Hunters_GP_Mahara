package com.mahara.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mahara.utilities.Driver;

public class MaharaPortfolio_GroupsOptionsPage{
	
private WebDriver driver;
	
	public MaharaPortfolio_GroupsOptionsPage(){
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);	
	}
	   
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	public WebElement portfolioDropDownBox;
	
	@FindBy(xpath="(//button[@type='button'])[3]")
	public WebElement groupsDropDownBox;
	
	public List<WebElement> topMenuOptions(String name) throws InterruptedException{
		Thread.sleep(5000);
		String xpath="//span[.='Show menu for "+name+"']/../..//ul//li";
		
		return driver.findElements(By.xpath(xpath));
	}
}
