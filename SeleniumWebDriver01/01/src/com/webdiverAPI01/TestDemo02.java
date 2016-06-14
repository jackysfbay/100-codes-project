package com.webdiverAPI01;

import static org.junit.Assert.*;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.velocity.texen.util.FileUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.gargoylesoftware.htmlunit.javascript.host.Element;
import com.thoughtworks.selenium.webdriven.commands.Highlight;

public class TestDemo02 {
	WebDriver driver;

	@Before
	public void init() {
		driver = new FirefoxDriver();
	}

	@After
	public void exit() throws Exception {
		Thread.sleep(2000);
//		driver.quit();
	}

	@Test
	public void test() throws Exception{
		driver.get("https://jqueryui.com/draggable/");
//		File screenshot =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		Thread.sleep(3000);
//		FileUtils.copyFile(screenshot, new File("testImage.jpg"));
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		
		WebElement draggable = driver.findElement(By.id("draggable"));
		System.out.println(draggable.isDisplayed());
		
		new Actions(driver).dragAndDropBy(draggable, 50, 50).build().perform();
		
		
	}



}
