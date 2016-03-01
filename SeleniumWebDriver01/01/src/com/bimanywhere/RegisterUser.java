package com.bimanywhere;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterUser {
	WebDriver driver ;
	private String index = "http://bimanywhere.com/index.php";

	@Test
	public void userReg() throws InterruptedException {
		RamdonMehtod mth = new RamdonMehtod();
		String emailStr = mth.email();
		 driver = new FirefoxDriver();
		driver.get(index);
		driver.findElement(By.linkText("Sign Up")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("company-name")).sendKeys(mth.title());
		driver.findElement(By.id("first-name")).sendKeys("Jack");
		driver.findElement(By.id("last-name")).sendKeys("Ben");
		driver.findElement(By.id("city")).sendKeys("SF");
		driver.findElement(By.id("state")).sendKeys("CA");
		driver.findElement(By.name("email")).sendKeys(emailStr);
		driver.findElement(By.id("password")).sendKeys("Rdis2fun");
		driver.findElement(By.id("confirm")).sendKeys("Rdis2fun");
		driver.findElement(By.id("phone")).sendKeys("321022203320");

		Select ipadNo = new Select(driver.findElement(By.id("ipad")));
		ipadNo.selectByIndex(1);
		Select lead_source = new Select(driver.findElement(By.id("lead_source")));
		lead_source.selectByIndex(2);
		driver.findElement(By.id("accept-conditions")).click();
		Thread.sleep(1000);

		driver.findElement(By.cssSelector("button.btn.btn-primary.pull-right")).click();
		Thread.sleep(5000);
		String regUserURL = driver.getCurrentUrl();
		String userEmail = (regUserURL.split("="))[1];
		assertEquals(emailStr, userEmail);
	}
	@After
	public void ex(){
		driver.quit();
	}
}
