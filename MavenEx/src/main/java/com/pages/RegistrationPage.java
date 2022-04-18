package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	
	WebDriver driver;
	
@FindBy (id="name")
public WebElement name;

@FindBy (id="mobile")
public WebElement mobile;

@FindBy (id="email")
public WebElement email;

@FindBy (id="password")
public WebElement password;

@FindBy (id="//button")
public WebElement button;
	
	public RegistrationPage(WebDriver driver) {
	this.driver=driver;
	
	PageFactory.initElements(driver, this);
	
}

	public void CretaeUser () {
		
		name.sendKeys("ansh");
		mobile.sendKeys("67676767");
		email.sendKeys("ahjh@test.com");
		password.sendKeys("7565656");
		button.click();
		
	}

}
