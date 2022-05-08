package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UsefulLinkPage {
	
	WebDriver driver;
	
	By Usefullinkbtn = By.xpath("/html/body/div/aside[1]/section/ul/li[5]/a/span");
	By GoBtn=By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[3]/a/span");
	
	public UsefulLinkPage (WebDriver driver) {
		this.driver= driver;
	}
	
	public void CheckUsefulLink () {
		
		driver.findElement(Usefullinkbtn).click();
		driver.findElement(GoBtn).click();
	}

}
