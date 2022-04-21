package com.jbk;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import com.pages.RegistrationPageOld;

public class RegistrationTestOld {
	
	WebDriver driver;
	
	@Test
	
	public void CreateUser () {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("file:///E:/Automation%20testing/Class%20video%20link/Offline%20website/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/register.html");
		
		RegistrationPageOld RR = new RegistrationPageOld (driver);
		
		RR.creatinguser();
		
//	Alert alert =	driver.switchTo().alert();
//	alert.accept();
		
		
	}

}
