package com.bimanywhere;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateNewProject {
	WebDriver driver;

	@Test
	public void createNewProject() throws InterruptedException {
		RamdonMehtod rd = new RamdonMehtod();
		GetUserSeesion session = new GetUserSeesion();
		driver = session.getSeesion();
		String projectTitle = "Project-"+rd.title();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a.btn.btn-primary.pull-right")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("project_name")).sendKeys(projectTitle);
		driver.findElement(By.name("description")).sendKeys("This is Project"+rd.title());
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
			assertEquals("project_create", keyStr);
			Thread.sleep(2000);

	}
	@After
	public void ex(){
		
		driver.quit();
	}
}
