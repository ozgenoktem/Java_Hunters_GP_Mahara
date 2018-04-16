package com.mahara.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mahara.utilities.Driver;

public class MainPage{
	
private WebDriver driver;
	
	public MainPage(){
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
			
	}
	
	@FindBy(xpath="//span[@class='icon icon-bars icon-lg']")
	public WebElement menuButton;
	
	@FindBy(linkText="Portfolio")
	public WebElement portfolioButton;
	
	@FindBy(xpath="//a[@href='http://34.223.219.142:1022/mahara/?logout']")
	public WebElement LogOut;
	
	@FindBy(linkText="Pages and collections")
	public WebElement pagesColl;
	
	@FindBy(xpath="//button[@title='User menu']")
	public WebElement profilePage;

}
