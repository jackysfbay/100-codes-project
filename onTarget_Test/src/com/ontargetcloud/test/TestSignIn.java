package com.ontargetcloud.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

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

public class TestSignIn {
	private CheckElement checkElement;
	private WebDriver driver;
	private GetTestData getTestData;
	private String url;
	private String userName;
	private String testPassword;
	private ParseUrl parseUrl;
	private EmailVerify emailVerify;

	@Before
	public void inti() throws Exception {
		emailVerify = new EmailVerify();
		checkElement = new CheckElement();
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
	public void signIn() throws Exception {

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

		// Test cancel button, should reset user account and password
		username.sendKeys("test");
		password.sendKeys("test");
		driver.findElement(By.xpath("//div[@class='modal-footer']//button[@type='button']")).click();
		Thread.sleep(1000);
		assertEquals("The Cancel button did not reset the username:" + username.getAttribute("value"), 0,
				(username.getAttribute("value").length()));
		assertEquals("The Cancel button did not reset the password:" + password.getAttribute("value"), 0,
				(password.getAttribute("value").length()));

		// Test invalid Email in list
		ArrayList<String> list = emailVerify.invalidEmailList();
		for (int i = 0; i < list.size(); i++) {
			username.clear();
			username.sendKeys(list.get(i));
			Thread.sleep(1000);
			Boolean invalidEmailTest = checkElement.isElementExsit(driver,
					By.xpath("//li[text()='Email is not valid']"));
			if (!invalidEmailTest) {
				assertEquals("email: " + list.get(i) + " is correct", false, true);
			}
		}

		// Test email does not exist
		username.clear();
		username.sendKeys("Auto_Email_Test@testemail.com");
		password.sendKeys("test");
		signInBtn.click();
		Thread.sleep(2000);
		String errorMeg = (driver.findElement(By.xpath("//ul//li"))).getText();
		boolean isTrue = errorMeg.contains("doesn't exist");
		if (!isTrue) {
			assertEquals("Test email does not exist has error", true, false);
		}

		// Test invail password, return message ="Bad credential"
		username.clear();
		password.clear();
		username.sendKeys(userName);
		password.sendKeys("A123@");
		signInBtn.click();
		Thread.sleep(1000);
		Boolean isBadCredentials = checkElement.isElementExsit(driver, By.xpath("//ul//li[text()='Bad credentials']"));
		assertEquals("The invail password does not match the message of Bad credentials", true, isBadCredentials);

		// Test account login succeed
		username.clear();
		password.clear();
		username.sendKeys(userName);
		password.sendKeys(testPassword);
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

		// Test User logout
		Thread.sleep(1000);
		WebElement userProfileMenu = driver
				.findElement(By.xpath("//div[@class='pull-right']//div[@class='user-profile-name dropdown']//span"));
		userProfileMenu.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//li[3]")).click();
		Thread.sleep(2000);
		Boolean isLogout = driverWait.until(new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver driver) {
				String[] parseList = parseUrl.parseUrlWithSlash(driver.getCurrentUrl());
				boolean isCreated = (parseList[parseList.length - 1]).equals("signin");
				return isCreated;
			}
		});
		assertEquals("User logout has errors, please check console log!", true, isLogout);
	}

}
