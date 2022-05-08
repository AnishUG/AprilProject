package com.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.pages.RegistrationPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationStepDefs {

	WebDriver driver;

	@Before

	public void setup() {

		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");

		driver = new ChromeDriver();

	}

	@After

	public void teardown() {

		driver.close();
	}

	@Given("^user is on Registration Page$")
	public void user_is_on_Registration_Page() throws Throwable {

		driver.get(
				"file:///E:/Automation%20testing/Class%20video%20link/Offline%20website/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/register.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("^user enters all mandatory fields \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_enters_all_mandatory_fields(String Name, String Mobile, String Email, String Password)
			throws Throwable {
		RegistrationPage RP = new RegistrationPage(driver);
		RP.RegistrationUser(Name, Mobile, Email, Password);
	}

	@Then("^Alert msg should get displayed$")
	public void alert_msg_should_get_displayed() throws Throwable {

		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

	@When("^user miss to enter data in any fields \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_miss_to_enter_data_in_any_fields(String Name, String Mobile, String Email, String Password)
			throws Throwable {

		RegistrationPage RP = new RegistrationPage(driver);
		RP.ValidationforRegistrationofuser(Name, Mobile, Email, Password);

	}

	@Then("^Error msg should get displayed$")
	public void error_msg_should_get_displayed() throws Throwable {

		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Registration Page");

	}

}
