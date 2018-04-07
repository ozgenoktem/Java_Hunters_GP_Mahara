package com.mahara.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mahara.utilities.Driver;

public class MaharaMenu_ContentPage {
	
private WebDriver driver;
	
	public MaharaMenu_ContentPage(){
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="(//span[@class='icon icon-chevron-down'])[1]")
	public WebElement contentButton;
	
	@FindBy(xpath="//ul[@class='child-nav collapse in']//a")
	public WebElement contentOptions;
	
	
	public List<WebElement> topMenuOptions() throws InterruptedException{
		Thread.sleep(5000);
	
		String xpath="//span[.='Show menu for Content']/../..//ul//li";
		
		return driver.findElements(By.xpath(xpath));
	}
	
	
//	public List<WebElement> contentOptionList(String locator) throws InterruptedException{
		
//	Thread.sleep(5000);
	
//	return driver.findElements(By.xpath(locator));
	
		
//	}		

}
