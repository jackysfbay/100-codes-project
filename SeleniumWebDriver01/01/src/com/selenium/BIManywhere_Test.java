package com.selenium;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BIManywhere_Test {

	@Test
	public void login() throws Exception {
	
		
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
		String assertURL = "https://cpanel.bimanywhere.com/Projects/dashboard?r=true&type=welcome_back";
		assertEquals(assertURL, getCurrentUrl);
		driver.quit();
	}
	@Test
	public void Signup() throws Exception {
		 int x = (int) (Math.random()*5);
		 int y = (int) (Math.random()*10);
		 int z = (int) (Math.random()*100);
	
		 String emailStr = "AutoTestEmail"+x+z+y+"@gmail.com";
		WebDriver driver = new FirefoxDriver();
		driver.get("http://bimanywhere.com");
		WebElement signUp = driver.findElement(By.linkText("Sign Up"));
		signUp.click();
		
		Thread.sleep(4000);
		String regURL = driver.getCurrentUrl();
		String expectedRegURL = "https://cpanel.bimanywhere.com/Sign_up";
		assertEquals("URL is not right",expectedRegURL, regURL);
		Thread.sleep(2000);
		driver.findElement(By.name("company_name")).sendKeys("Test");
		driver.findElement(By.name("first_name")).sendKeys("Ben");
		driver.findElement(By.name("last_name")).sendKeys("AC");
		driver.findElement(By.name("city")).sendKeys("SF");
		driver.findElement(By.name("state")).sendKeys("CA");
		driver.findElement(By.name("email")).sendKeys(emailStr);
		driver.findElement(By.name("password")).sendKeys("Rdis2fun");
		driver.findElement(By.name("confirm")).sendKeys("Rdis2fun");
		driver.findElement(By.name("phone")).sendKeys("4153435593");
		Select iPadsNo = new Select(driver.findElement(By.id("ipad")));
		iPadsNo.selectByIndex(x);
		Select leadSource = new Select(driver.findElement(By.id("lead_source")));
		leadSource.selectByIndex(x);
		driver.findElement(By.id("accept-conditions")).click();
		driver.findElement(By.className("btn")).click();
		Thread.sleep(4000);
		String regUserURL = driver.getCurrentUrl();
		String userEmail = (regUserURL.split("="))[1];

		assertEquals(emailStr, userEmail);
		
		
	}
	
}
