package com.ontargetcloud.test;

import static org.junit.Assert.*;

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

import com.ontargetcloud.util.CheckElement;
import com.ontargetcloud.util.EmailVerify;
import com.ontargetcloud.util.GetTestData;
import com.ontargetcloud.util.ParseUrl;
import com.ontargetcloud.util.RamdonString;

public class TestCreateProject {
	private CheckElement checkElement;
	private WebDriver driver;
	private GetTestData getTestData;
	private String url;
	private String userName;
	private RamdonString ramStr;
	private String testPassword;
	private ParseUrl parseUrl;

	@Before
	public void inti() throws Exception {
		checkElement = new CheckElement();
		ramStr = new RamdonString();
		driver = new FirefoxDriver();
		getTestData = new GetTestData();
		parseUrl = new ParseUrl();
		url = getTestData.getTestData("signInUrl");
		userName = getTestData.getTestData("testAccount");
		testPassword = getTestData.getTestData("testPassword");

	}

	@After
	public void exti() throws Exception {
		Thread.sleep(4000);
		 driver.quit();

	}

	@Test
	public void createProject() throws Exception {

		// To Signin page

		WebDriverWait driverWait = new WebDriverWait(driver, 60);
		Boolean isavailable = driverWait.until(new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver driver) {
				driver.get(url);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				WebElement signInTxt = driver.findElement(By.xpath("//div//h2[text()='Sign In']"));
				boolean isSignInText = (signInTxt.getText()).equals("Sign In");
				return isSignInText;
			}
		});
		assertEquals("The Sign In page is correct, please check the console log", true, isavailable);

		// Get Sign-in element
		WebElement signInBtn = driver.findElement(By.xpath("//div[@class='modal-footer']//button[@type='submit']"));


		// Get username and password element
		WebElement username = driver.findElement(By.xpath("//div//input[@name='username']"));
		WebElement password = driver.findElement(By.name("password"));

		

		// Input user acccount && password
		username.clear();
		username.sendKeys(userName);
		password.sendKeys(testPassword);
		Thread.sleep(1000);

		// Test account login succeed
		signInBtn.click();
		Boolean isLogIn = driverWait.until(new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver driver) {
				String[] parseList = parseUrl.parseUrlWithSlash(driver.getCurrentUrl());
				boolean isCreated = (parseList[parseList.length - 1]).equals("project");
				return isCreated;
			}
		});
		assertEquals("User account login is not succeed, please check your console log!", true, isLogIn);
		
		WebElement newProjectBtn = driver.findElement(By.xpath("//div/h2[text()='Start New Project']"));
		String newProjectName = ramStr.ramdonTitle();
		newProjectBtn.click();
		Thread.sleep(2000);
		boolean isDialogExsit = checkElement.isElementExsit(driver, By.xpath("//div[@class='modal-dialog modal-lg']"));
		
		if(isDialogExsit){
			
		}
	}

}
