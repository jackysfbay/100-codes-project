package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import bsh.commands.dir;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

		driver.get("http://localhost:63342/JS_Test01/test.html");

		WebElement btn = driver.findElement(By.name("btn"));
		// query.sendKeys("selenium");

		// WebElement btn = driver.findElement(By.id("su"));
		Thread.sleep(5000);
		btn.click();
		Thread.sleep(5000);

		// System.out.println(driver.getTitle());
		driver.quit();

	}
}
