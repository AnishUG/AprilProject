package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By Email = By.id("email");
	By Password =  By.id("password");
	By Button = By.xpath("//button");
	
	public LoginPage (WebDriver driver) {
		this.driver= driver;
		
	}

	
	public void LoginToapplication (String username, String password) {
		
		driver.findElement(Email).sendKeys(username);
		driver.findElement(Password).sendKeys(password);
		driver.findElement(Button).click();
	}
	
	public void LoginwithInValidCredentials (String username, String password) {
		
		driver.findElement(Email).sendKeys(username);
		driver.findElement(Password).sendKeys(password);
		driver.findElement(Button).click();
		
	}
	

}
