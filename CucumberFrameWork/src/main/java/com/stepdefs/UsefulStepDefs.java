package com.stepdefs;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.LoginPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UsefulStepDefs {
	

	WebDriver driver;
	
	
	
	@Before
	
	public void setup () {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
	}
	
	@After
	
	public void teardown () {
		
		driver.close();
	}
	
//	@Given("^User is on LoginPage$")
//	public void user_is_on_LoginPage() throws Throwable {
//	   
//		driver.get("file:///E:/Automation%20testing/Class%20video%20link/Offline%20website/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
//	}
	
	@When("^Enters valid credentials$")
	public void enters_valid_credentials() throws Throwable {
		
	
		
		
		driver.get("file:///E:/Automation%20testing/Class%20video%20link/Offline%20website/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button")).click();
	}

	@Then("^user should navigate to dashboard page$")
	public void user_should_navigate_to_dashboard_page() throws Throwable {
		
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	   
	}

	@When("^clicks on useful links$")
	public void clicks_on_useful_links() throws Throwable {
		
		driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[5]/a/span")).click();
	  
	}

	@Then("^user should be on useful link page$")
	public void user_should_be_on_useful_link_page() throws Throwable {
		
	 Assert.assertEquals(driver.getTitle(), "JavaByKiran | Useful Links");
	    
	}

	@When("^clicks on Go button$")
	public void clicks_on_Go_button() throws Throwable {
		
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[3]/a/span"));
	   
	}



}
