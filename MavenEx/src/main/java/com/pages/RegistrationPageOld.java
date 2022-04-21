package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPageOld {
	
	WebDriver driver;
	
	@FindBy (id="name")
	public WebElement name;
	
	@FindBy (id="mobile")
	public WebElement mobile;
	
	@FindBy (id="email")
	public WebElement email;
	
	@FindBy (id="password")
	public WebElement password;
	
	@FindBy (xpath="//button")
	public WebElement button;
	
	
	public RegistrationPageOld(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	


	public void creatinguser () {
		
		name.sendKeys("anjh");
		mobile.sendKeys("87767677");
		email.sendKeys("ahjhj@Test.com");
		password.sendKeys("87656767");
		button.click();
		
	}

}
