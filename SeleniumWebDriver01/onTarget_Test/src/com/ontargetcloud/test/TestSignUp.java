package com.ontargetcloud.test;
/**
 * @author Jacky
 */
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ontargetcloud.util.CheckElement;
import com.ontargetcloud.util.EmailVerify;
import com.ontargetcloud.util.GetTestData;
import com.ontargetcloud.util.ParseUrl;
import com.ontargetcloud.util.PasswordVerify;
import com.ontargetcloud.util.RamdonString;

public class TestSignUp {
	private CheckElement checkElement;
	private String emailAccount;
	private String passwordAccount;
	private WebDriver driver;
	private String url;
	private RamdonString ramStr;
	private EmailVerify emailVerify;
	private PasswordVerify passwordVerify;
	private GetTestData getUrl;
	private ParseUrl parseUrl;

	@Before
	public void inti() throws Exception {
		checkElement = new CheckElement();
		parseUrl = new ParseUrl();
		ramStr = new RamdonString();
		driver = new FirefoxDriver();
		emailVerify = new EmailVerify();
		getUrl = new GetTestData();
		passwordVerify = new PasswordVerify();
		url = getUrl.getTestData("signInUrl");
		emailAccount = ramStr.ramdonValidEmail();
		passwordAccount = ramStr.ramdonPassword();
		parseUrl = new ParseUrl();
		
	}

	@After
	public void exit() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	public void signUp() throws Exception {

		// open (Sign in) url
		driver.get(url);
		Thread.sleep(1000);

		// // Test page connection
		// int reqCode = testUrl.testUrlStatus(url);
		// assertEquals("Http connection is " + reqCode, 200, reqCode);
		// System.out.println("reqCode - " + reqCode);

		// Verify Sign Up page
		driver.findElement(By.xpath("//div//a[text()='Sign Up']")).click();
		Thread.sleep(1000);
		String[] str = parseUrl.parseUrlWithSlash(driver.getCurrentUrl());
		String str1 = str[str.length - 1];
		assertEquals("This is not a SignUp page", "signup", str1);

		// Get error message locator, error password message locator
		By locator = By.xpath("//div[@class='error-summary ng-scope']//ul/li");
		By passwordLocator = By.xpath("//div[@class='vertical-bottom password-conditions']//li[@class='active']");

		// Get sign-up submit button
		WebElement submiBtn = driver.findElement(By.xpath("//div//button[@type='submit']"));

		// Test all empty inputs
		submiBtn.click();
		Thread.sleep(1000);
		Boolean isAllElementExsit = checkElement.isElementExsit(driver, locator);
		if (isAllElementExsit) {
			List<WebElement> allElements = driver.findElements(locator);
			assertEquals("Should total 5 empty inputs, but not", 5, allElements.size() - 1);
		}

		// Input firstName, lastName
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div//input[@name='firstName']")).sendKeys(ramStr.ramdonName("First"));
		driver.findElement(By.xpath("//div//input[@name='lastName']")).sendKeys(ramStr.ramdonName("Last"));

		// Get email element
		WebElement email = driver.findElement(By.xpath("//div//input[@name='email']"));

		// Test invalid Email in list
		ArrayList<String> list = emailVerify.invalidEmailList();
		for (int i = 0; i < list.size(); i++) {
			email.clear();
			email.sendKeys(list.get(i));
			Thread.sleep(1000);
			Boolean invalidEmailTest = checkElement.isElementExsit(driver, locator);
			if (!invalidEmailTest) {
				assertEquals("email: " + list.get(i) + " is correct", false, true);
			}
		}
		
		//Input valid email
		email.clear();
		email.sendKeys(emailAccount);

		// Input compamy name
		driver.findElement(By.xpath("//div//input[@name='companyName']")).sendKeys(ramStr.ramdonTitle());

		// Get password element
		WebElement password = driver.findElement(By.xpath("//div//input[@name='password']"));

		// Test invalid password in list
		ArrayList<String> invalidPasswordList = passwordVerify.invalidPasswordList();
		Boolean validPassword = false;
		for (int i = 0; i < invalidPasswordList.size(); i++) {
			password.clear();
			password.sendKeys(invalidPasswordList.get(i));
			Thread.sleep(1000);
			Boolean invalidPasswordTest = checkElement.isElementExsit(driver, passwordLocator);
			List<WebElement> passwordCheck = driver.findElements(passwordLocator);
			if (invalidPasswordTest) {
				if (passwordCheck.size() == 5) {
					validPassword = true;
					assertEquals("Invalid Password: " + invalidPasswordList.get(i) + " is correct", false,
							validPassword);
				}
			}
		}
		
		//Input valid password
		password.clear();
		password.sendKeys(passwordAccount);
		Thread.sleep(1000);
		
		//Get confirm password element
		WebElement confirmPass = driver.findElement(By.xpath("//div//input[@name='confirmpassword']"));
		
		//Test invalid confirm password
		Thread.sleep(1000);
		confirmPass.sendKeys("invalidConfirmPassword");
		Boolean invalidPW = checkElement.isElementExsit(driver, locator);
		if(!invalidPW){
			assertEquals("Invalid password has error", false, true);
		}
		
		//Input valid confirm password
		Thread.sleep(1000);
		confirmPass.clear();
		confirmPass.sendKeys(passwordAccount);
		Thread.sleep(1000);
		
		//Test create account
		submiBtn.click();
		Thread.sleep(2000);
		String[] parseList = parseUrl.parseUrlWithSlash(driver.getCurrentUrl());
		boolean isCreated = (parseList[parseList.length - 1]).contains("signupsuccess");
		assertEquals("Create account is not succeed", true, isCreated);
	
	}
}
