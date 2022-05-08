package com.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.pages.LoginPage;
import com.pages.UserPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UserStepDefs {
	
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
	
	@Given("^User is on LoginPage$")
	public void user_is_on_LoginPage() throws Throwable {
	   
		driver.get("file:///E:/Automation%20testing/Class%20video%20link/Offline%20website/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	

	@When("^User enters valid credentials$")
	public void user_enters_valid_credentials() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button")).click();
		
	}

	@Then("^User should be on Dashboard Page$")
	public void user_should_be_on_Dashboard_Page() throws Throwable {
		
	Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");	
	    
	}

	@When("^User clickes on user side tab$")
	public void user_clickes_on_user_side_tab() throws Throwable {
		
		UserPage UP = new UserPage(driver);
		UP.Usercliksonuserbtn();
	   
	}

	@Then("^User should be on UserPage links and clicks on Add user btn$")
	public void user_should_be_on_UserPage_links_and_clicks_on_Add_user_btn() throws Throwable {
		
		UserPage UP = new UserPage(driver);
		UP.UsercliksonAdduserbtn();
	   
	}

	@When("^User enter data in all mandatory fields \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_enter_data_in_all_mandatory_fields(String username, String mobile, String email, String course,String Gender, String State,
			String password, String friendmobile) throws Throwable {
	  
		UserPage UP = new UserPage(driver);
		UP.CreateUser(username, mobile, email, course, Gender, State, password, friendmobile);
		
	}

	@Then("^user gets the alert msg for sucesfully creating user$")
	public void user_gets_the_alert_msg_for_sucesfully_creating_user() throws Throwable {
		Alert alert= driver.switchTo().alert();
		alert.accept();
	}

}
