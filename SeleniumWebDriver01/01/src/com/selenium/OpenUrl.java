package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenUrl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		String url1 = "https://www.ggu.edu/";
		String url2 = "https://www.google.com";
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		// use get
//		driver.get(url);
		// use  navigate - can go back or go next
		driver.navigate().to(url1);
		Thread.sleep(3000);
		driver.navigate().to(url2);
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.quit();
	}

}
