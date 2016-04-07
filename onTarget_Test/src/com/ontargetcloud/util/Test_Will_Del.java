package com.ontargetcloud.util;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_Will_Del {
	private CheckElement checkElement;
	private WebDriver driver;
	private String url;
	private RamdonString ramStr;
	private ParseUrl parseUrl;
	private TestUrl testUrl;
	private EmailVerify emailVerify;
	private PasswordVerify passwordVerify;
	private GetTestData getUrl;

	@Before
	public void init() throws Exception {
		checkElement = new CheckElement();
		ramStr = new RamdonString();
		driver = new FirefoxDriver();
		parseUrl = new ParseUrl();
		testUrl = new TestUrl();
		emailVerify = new EmailVerify();
		getUrl = new GetTestData();
		passwordVerify = new PasswordVerify();

	}

	@Test
	public void testSignUp() throws Exception {
		
		File file = new File("text.txt");
		String str= file.getAbsolutePath();
		System.out.println(str);
		
	}

	@After
	public void afterTest() throws Exception {
		Thread.sleep(4000);
		driver.quit();
	}
	
	public static void main(String[] args) {
		
	}
}
