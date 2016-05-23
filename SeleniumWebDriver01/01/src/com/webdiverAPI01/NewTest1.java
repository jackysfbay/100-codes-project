package com.webdiverAPI01;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest1 {
	public WebDriver driver;
	@BeforeTest
	public void init(){
		 driver = new FirefoxDriver();
	}
	
	@AfterTest
	public void exit() throws Exception{
		Thread.sleep(2000);
		driver.quit();
	}
	
  @Test
  public void test() {
	  
	  driver.get("http://www.baidu.com");
	  System.out.println("done");
  }
}
