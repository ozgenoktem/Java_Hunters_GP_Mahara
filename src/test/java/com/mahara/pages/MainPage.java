package com.mahara.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.mahara.utilities.Driver;

public class MainPage {
	
private WebDriver driver;
	
	public MainPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
		
		
		
		
		
	}

}
