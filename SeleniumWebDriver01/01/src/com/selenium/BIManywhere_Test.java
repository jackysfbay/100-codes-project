package com.selenium;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BIManywhere_Test {

	@Test 
	public void login() throws Exception{
		WebDriver driver = new FirefoxDriver();
		String url = "https://cpanel.bimanywhere.com/Users/login";
		driver.get(url);
		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement btn = driver.findElement(By.className("btn"));
	
		username.sendKeys("jacky163@msn.com");
		password.sendKeys("rdis2fun");
		Thread.sleep(1000);
		btn.click();
		Thread.sleep(2000);
		
		String getCurrentUrl = driver.getCurrentUrl();
		String assertURL ="https://cpanel.bimanywhere.com/Projects/dashboard?r=true&type=welcome_back";
		
		assertEquals(assertURL, getCurrentUrl);
		driver.quit();
	}

}
