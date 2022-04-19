package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy (id="email")
	public WebElement email;
	
	@FindBy (id="password")
	public WebElement password;
	
	@FindBy (xpath="//button")
	public WebElement button;
	
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}



	public void LoginToApplication () {
		
		email.sendKeys("kiran@gmail.com");
		password.sendKeys("123456");
		button.click();
	}
	
	public void IncorrectUsername () {
		email.sendKeys("anish@test.com");
		password.sendKeys("54454");
		button.click();
	}
	
	public void IncorrectPassword () {
		
		email.sendKeys("kiran@gmail.com");
		password.sendKeys("67676767");
		button.click();
	}
	
	public void BothInvalid() {
		email.sendKeys("Andy@gmail.com");
		password.sendKeys("46556565");
		button.click();
		
	}
}
