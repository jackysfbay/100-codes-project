package com.webdiverAPI01;

import java.util.Properties;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestDemo_2 {
	WebDriver driver;
	JavascriptExecutor js;

	@BeforeTest
	public void init() {
		driver = new FirefoxDriver();
	}

	@AfterTest
	public void exit() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	public void test() throws Exception {
//		driver.get("http://jqueryui.com/resources/demos/datepicker/other-months.html");
//		driver.findElement(By.id("datepicker")).sendKeys("12/31/2015");
		
		Properties props=System.getProperties();
		String osName = props.getProperty("os.name");
		System.out.println(osName);
	}
	
	
}
