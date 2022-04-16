package com.stepdefs;


import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStepDefs {
	
	WebDriver driver;
	
	@Before
	
	public void setup () {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	}
	
	@After
	
	public void teardown () {
		
		driver.close();
	}
	
	
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
	   
	    driver.get("file:///E:/Automation%20testing/Class%20video%20link/Offline%20website/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	    
	}

	@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String uname, String pass) throws Throwable {
		
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button")).click();
	    
	}
	
	

	@Then("^user should be on home page$")
	public void user_should_be_on_home_page() throws Throwable {
		
		Assert.assertEquals("JavaByKiran | Dashboard", driver.getTitle());
	   
	}
	
	@When("^user enters invalid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_invalid_and(String username, String password) throws Throwable {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//button")).click();
	}

	@Then("^user should be on login page$")
	public void user_should_be_on_login_page() throws Throwable {
		
		Assert.assertEquals("JavaByKiran | Log in", driver.getTitle());
	   
	}
	
	@When("^user enter credentials$")
	public void user_enter_credentials() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button")).click();
		
	   
	}

	@When("^user clicks on User button$")
	public void user_clicks_on_User_button() throws Throwable {
		
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click();
	    
	}

	@Then("^user should be on User link$")
	public void user_should_be_on_User_link() throws Throwable {
	  Assert.assertEquals("JavaByKiran | User", driver.getTitle());
	}

	@When("^user clicks on Add User Button$")
	public void user_clicks_on_Add_User_Button() throws Throwable {
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
	 
	}

	@Then("^user should be Add user page$")
	public void user_should_be_Add_user_page() throws Throwable {
		
		Assert.assertEquals("JavaByKiran | Add User", driver.getTitle());
	   
	}
	
	@When("^user enter \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_enter(String Username, String Mobile, String Email, String Courses, String Gender, String State, String Password, String FriendMobile) throws Throwable {
	    
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(Username);
		driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys(Mobile);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(Email);
		driver.findElement(By.xpath("//*[@id=\"course\"]")).sendKeys(Courses);
		
		WebElement Radio = driver.findElement(By.id("Male"));
		
		Radio.click();
		
	Select drpstate = new Select (driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select")));
	drpstate.selectByVisibleText(State);
	
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(Password);
	driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[3]/div/input"))
			.sendKeys(FriendMobile);
	driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
	}

	@Then("^user see a alert msg$")
	public void user_see_a_alert_msg() throws Throwable {
		
	Alert alert=	driver.switchTo().alert(); 
	alert.accept();
	  
	}



}
