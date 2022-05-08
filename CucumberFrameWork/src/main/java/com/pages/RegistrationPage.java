package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
	
	WebDriver driver;
	
	By RegButton=By.xpath("//button");
	By Nameofuser=By.id("name");
	By Mobileofuser=By.id("mobile");
	By Emailofuser=By.id("email");
	By Passwordofuser=By.id("password");
	By SignInButton=By.xpath("//button");
	
	
	
	public RegistrationPage (WebDriver driver) {
		this.driver=driver;
	}
	
	public void RegistrationUser (String Name, String Mobile, String Email, String Password) throws Exception {
		
		driver.findElement(RegButton).click();
		driver.findElement(Nameofuser).sendKeys(Name);
		driver.findElement(Mobileofuser).sendKeys(Mobile);
		driver.findElement(Emailofuser).sendKeys(Email);
		driver.findElement(Passwordofuser).sendKeys(Password);
		driver.findElement(SignInButton).click();
		Thread.sleep(3000);
	}
	
	public void ValidationforRegistrationofuser (String Name, String Mobile, String Email, String Password) throws Exception {
		driver.findElement(RegButton).click();
		driver.findElement(Nameofuser).sendKeys(Name);
		driver.findElement(Mobileofuser).sendKeys(Mobile);
		driver.findElement(Emailofuser).sendKeys(Email);
		driver.findElement(Passwordofuser).sendKeys(Password);
		driver.findElement(SignInButton).click();
		Thread.sleep(3000);
		
	}
}
