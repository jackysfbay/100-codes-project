package com.bimanywhere;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserLoginStage {
	private String index = "http://stage-cpanel.bimanywhere.com/";
	WebDriver driver ;
	
	@Before
	public void loadFirefoxDriver(){
		driver = new FirefoxDriver();
	}
	
	@Test
	public void userlogin() throws InterruptedException {
//		WebDriver driver = new FirefoxDriver();
		driver.get(index);
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("tester@zimfly.com");
		driver.findElement(By.name("password")).sendKeys("zimfly");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button.btn.btn-primary.pull-right")).click();

		WebDriverWait driverWait = new WebDriverWait(driver, 5);
		String getResponeURL = driverWait.until(new ExpectedCondition<String>() {
			@Override
			public String apply(WebDriver driver) {
				return driver.getCurrentUrl();
			}
		});
		String keywords = (getResponeURL.split("="))[1];
		
		assertEquals("true&type", keywords);

	}

}
