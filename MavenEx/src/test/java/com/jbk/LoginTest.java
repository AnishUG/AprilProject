package com.jbk;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.LoginPage;

public class LoginTest {
	
	WebDriver driver;
	
	@BeforeClass
	
	public void setup() {
		
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	
	driver= new ChromeDriver();
	
	driver.get("file:///E:/Automation%20testing/Class%20video%20link/Offline%20website/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	}
	
@AfterClass

public void teardown () {
	
	driver.close();
}
	
	@Test (priority=2)
	
	public void LoginTestCases () {
		
		LoginPage LP = new LoginPage (driver);
		LP.LoginToApplication();
		
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
		
	}
	
	@Test (priority=1)
	
	public void EmailValidationTestCases () {
		
		LoginPage LP = new LoginPage (driver);
		
		LP.IncorrectUsername();
		
	String	Emailerror =  driver.findElement(By.id("email_error")).getText();
	
	Assert.assertEquals(Emailerror, "Please enter email as kiran@gmail.com");
	
	driver.navigate().refresh();
		
	}

}
