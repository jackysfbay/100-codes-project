package com.selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ExecuteScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://localhost:63342/JS_Test01/test.html");
//		((JavascriptExecutor)driver).executeScript("alert(\"hello,this is a alert!\")");
	}

}
