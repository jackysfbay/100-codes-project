package com.selenium;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import bsh.commands.dir;

public class Test1 {

	@Test
	public void test() throws Exception{
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://localhost:8080/jenkins/login?from=%2Fjenkins%2F");
//		driver.findElement(By.cssSelector("")
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement username= (WebElement) js.executeScript("document.getElementById('j_username')");
		WebElement password= (WebElement) js.executeScript("document.getElementById(\"j_password\")");
//		Thread.sleep(4000);
//		username.clear();
//		password.clear();
		Thread.sleep(2000);
		System.out.println(username);
//		username.sendKeys("admin");
//		password.sendKeys("admin");
//		Thread.sleep(2000);
//		WebElement btn =driver.findElement(By.className("yui-button"));
//		btn.submit();
	}

}
