package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class UserPage {

	WebDriver driver;
	By UserSideTab = By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a/span");
	By Userbutton = By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button");
	By UserName = By.id("username");
	By UserMobile = By.id("mobile");
	By UserEmail = By.id("email");
	By UserCourses = By.id("course");
	By UserGender = By.id("Male");
	By UserState = By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select");
	By UserPassword = By.id("password");
	By UserFriendMobile = By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[3]/div/input");
	By UserSubmitBtn = By.xpath("//button");

	public UserPage(WebDriver driver) {
		this.driver = driver;
	}

	public void Usercliksonuserbtn() {

		driver.findElement(UserSideTab).click();

	}

	public void UsercliksonAdduserbtn() {

		driver.findElement(Userbutton).click();

	}

	public void CreateUser(String username, String mobile, String email, String course, String Gender, String State,
			String password, String friendmobile) throws Exception {

		driver.findElement(UserName).sendKeys(username);
		driver.findElement(UserMobile).sendKeys(mobile);
		driver.findElement(UserEmail).sendKeys(email);
		driver.findElement(UserCourses).sendKeys(course);

		WebElement radio = driver.findElement(UserGender);
		radio.click();

		Select drpstate = new Select(driver.findElement(UserState));
		drpstate.selectByVisibleText(State);

		driver.findElement(UserPassword).sendKeys(password);
		driver.findElement(UserFriendMobile).sendKeys(friendmobile);
		driver.findElement(UserSubmitBtn).click();
		Thread.sleep(3000);

	}

}
