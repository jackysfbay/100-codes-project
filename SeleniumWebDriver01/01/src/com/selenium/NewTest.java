package com.selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver driver = new FirefoxDriver();
	@BeforeMethod
	public void beforeMethod() {
		
	}

	@Test
	public void f() throws InterruptedException {
		driver.get("http://localhost:63342/JS_Test01/test.html");
		
		driver.findElement(By.id("btn1")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@AfterMethod
	public void afterMethod() {
	}

}
