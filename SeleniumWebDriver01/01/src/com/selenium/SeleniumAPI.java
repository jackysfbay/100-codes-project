package com.selenium;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumAPI {

	@Test
	public void test() throws Exception {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://localhost:8080/jenkins/");
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("New Item")).click();;
		
		driver.findElement(By.id("name")).sendKeys("Test");
//		driver.navigate().back();
//		driver.navigate().refresh();
//		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.close();//only close current window
//		driver.quit(); //close all windows
			
	}

}
