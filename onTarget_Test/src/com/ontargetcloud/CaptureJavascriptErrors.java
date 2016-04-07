package com.ontargetcloud;

import java.util.List;

import net.jsourcerer.webdriver.jserrorcollector.JavaScriptError;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CaptureJavascriptErrors {
	private static WebDriver driver;

	@BeforeClass
	public void setUp() throws Exception {
		FirefoxProfile ffProfile = new FirefoxProfile();
		JavaScriptError.addExtension(ffProfile);
		
		driver = new FirefoxDriver(ffProfile);

		
	}

	@AfterClass
	public void tearDown() {
		List<JavaScriptError> jsErrors = JavaScriptError.readErrors(driver);
		System.out.println("jsErrors"+jsErrors.size());
		System.out.println("###start displaying errors");
		for (int i = 0; i < jsErrors.size(); i++) {
//			System.out.println("1"+jsErrors.get(i).getErrorMessage());
//			System.out.println(jsErrors.get(i).getLineNumber());
//			System.out.println(jsErrors.get(i).getSourceName());
			System.out.println(jsErrors.get(i));
		}
		System.out.println("###start displaying errors");
		driver.close();
		driver.quit();
	}

	@Test
	public void returnJavascriptErrors() throws InterruptedException {
		driver.get("http://www.163.com");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div//input[@name='firstName']")).sendKeys("First");
//		driver.findElement(By.xpath("//div//input[@name='lastName']")).sendKeys("Last");
//		driver.findElement(By.xpath("//div//input[@name='email']")).sendKeys("asd@msn.com");
//		driver.findElement(By.xpath("//div//input[@name='companyName']")).sendKeys("asdasd");
//		driver.findElement(By.xpath("//div//input[@name='password']")).sendKeys("Quest2012!");;
//		driver.findElement(By.xpath("//div//input[@name='confirmpassword']")).sendKeys("Quest2012!");
//		driver.findElement(By.xpath("//div//button[@type='submit']")).click();
//		Thread.sleep(2000);
	}
}
