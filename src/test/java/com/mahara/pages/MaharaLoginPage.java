package com.mahara.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mahara.utilities.Driver;

public class MaharaLoginPage{
	private WebDriver driver;
	
	public MaharaLoginPage(){
		this.driver=Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login_login_username")
	public WebElement username;
	
	@FindBy(id="login_login_password")
	public WebElement password;
	
	@FindBy(id="login_submit")
	public WebElement login;
	
	public void login(String userName,String pwd) {
		username.sendKeys(userName);
		password.sendKeys(pwd);
		login.click();
	}
}
