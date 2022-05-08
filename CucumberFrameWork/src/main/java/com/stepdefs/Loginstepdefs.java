package com.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.pages.LoginPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginstepdefs {
	
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
	
	@Given("^User is on Login Page$")
	public void user_is_on_Login_Page() throws Throwable {
		
		driver.get("file:///E:/Automation%20testing/Class%20video%20link/Offline%20website/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
	 
	}

	@When("^User enter correct \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_correct_and(String username, String password) throws Throwable {
		
		LoginPage LP = new LoginPage(driver);
		LP.LoginToapplication(username, password);
	   
	}

	@Then("^user should navigate to Dashboard page$")
	public void user_should_navigate_to_Dashboard_page() throws Throwable {
		
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	   
	}

	@When("^User enter incorrect \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_incorrect_and(String username, String password) throws Throwable {
		LoginPage LP = new LoginPage(driver);
		LP.LoginwithInValidCredentials(username, password);
		
	}

	@Then("^user should get error msg and keeps on Login Page$")
	public void user_should_get_error_msg_and_keeps_on_Login_Page() throws Throwable {
	    
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");
	}

	
	

}
