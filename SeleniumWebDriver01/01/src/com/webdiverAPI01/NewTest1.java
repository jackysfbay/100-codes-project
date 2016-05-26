package com.webdiverAPI01;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest1 {
	public WebDriver driver;

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
		driver.get("http://www.baidu.com");
		Thread.sleep(1000);
		driver.findElement(By.id("kw")).clear();
		System.out.println(driver.getWindowHandle());
		System.out.println("------------------");
		driver.findElement(By.id("kw")).sendKeys("周韦彤");
		driver.findElement(By.id("su")).click();
		String windowHandle1 = driver.getWindowHandle();
		Thread.sleep(1000);
		System.out.println(windowHandle1);
		System.out.println("------------------");
		Set<String> windowHandle2 = driver.getWindowHandles();
		String windowId = "";
		for (String handle : driver.getWindowHandles()) {
			System.out.println(handle);
			if (driver.switchTo().window(handle).getTitle().contains("周韦彤_百度百科")) {
			windowId = handle;
			break;
		}
		}
		driver.switchTo().window(windowId);
		
		System.out.println(driver.getTitle());

	}
}
