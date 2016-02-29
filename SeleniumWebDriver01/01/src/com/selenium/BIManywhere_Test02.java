package com.selenium;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BIManywhere_Test02 {

	@Test
	public void userLogStage() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String url = "http://stage-cpanel.bimanywhere.com/Users/login";
		driver.get(url);
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("tester@zimfly.com");
		driver.findElement(By.name("password")).sendKeys("zimfly");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		;

		Thread.sleep(3000);
		String userURL = driver.getCurrentUrl();
		String welcome_back = "welcome_back";
		assertEquals((userURL.split("="))[2], welcome_back);
	}

	@Test
	public void createProject() throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://stage-cpanel.bimanywhere.com/Users/login");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("tester@zimfly.com");
		driver.findElement(By.name("password")).sendKeys("zimfly");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a.btn.btn-primary.pull-right")).click();
		
		
		Thread.sleep(2000);
		driver.findElement(By.name("project_name")).sendKeys("AutoTestPrject01");
		driver.findElement(By.name("description")).sendKeys("This is auto Test Prject 01");
		Select licenses = new Select(driver.findElement(By.id("pay-id")));
		licenses.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
		WebDriverWait wait = new WebDriverWait(driver, 5);
			String createdURL = wait.until(new ExpectedCondition<String>(){
				@Override
				public String apply(WebDriver driver) {
					return driver.getCurrentUrl();
				}
			});
			
			String[] list = createdURL.split("=");
			String keyStr = list[2];
//			System.out.println(keyStr);
			assertEquals("project_create", keyStr);
	}
}
