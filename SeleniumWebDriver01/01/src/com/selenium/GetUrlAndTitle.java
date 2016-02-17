package com.selenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetUrlAndTitle {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		String url1 = "http://localhost:63342/JS_Test01/test.html";

		driver.get(url1);

		String title = driver.getTitle();
		
		String winHandle = driver.getWindowHandle();
		
		Set winHandles = driver.getWindowHandles();
		
		String pageSource = driver.getPageSource();

		String getCurrentURL = driver.getCurrentUrl();

		System.out.println("Title: "+title + "\n" +"Current URL:"+ getCurrentURL);
		System.out.println("Page Source: "+pageSource);
		System.out.println("Window Handle:"+winHandles);
		System.out.println("Window Handles size: "+ winHandles.size());
		System.out.println("Window Handles: "+ winHandles);


	}

}
