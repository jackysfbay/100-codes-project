package com.selenium;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;;

public class Testwait {

	@Test
	public void testwait() {

		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.baidu.com");

		// driver.manage().timeouts().implicitlyWait(1000,
		// TimeUnit.MILLISECONDS);//find element in each 1 sec in goalbal.
		WebDriverWait wait = new WebDriverWait(driver, 5000);
		wait.until(ExpectedConditions.titleContains("Baidu"));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("doLogin")));

		WebElement element = wait.until(new ExpectedCondition<WebElement>() {
			@Override
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.id("doLogin"));
			}
		});

		driver.findElement(By.id("doLogin")).click();
	}
	
	@Test
	public void testAlert() throws Exception{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:63342/JS_Test01/test.html");
		Thread.sleep(3000);
		 driver.findElement(By.id("btn1")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(3000);
		
		
		
		
		
		
		
	}
}
