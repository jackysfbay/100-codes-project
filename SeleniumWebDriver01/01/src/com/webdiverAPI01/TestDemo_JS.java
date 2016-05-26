package com.webdiverAPI01;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestDemo_JS {
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
		driver.get("http://www.google.com");
	}
	
	public void jsClick(WebElement element){
		
		if (element.isEnabled() && element.isDisplayed()){
			System.out.println("JS 在给调用");
			((JavascriptExecutor)driver).executeScript("arguments[0].click(", element);
		}
	}
}
