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
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	public void init() throws Exception {
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
	public void signUpTest() throws Exception {
		// open (Sign in) url, the go to the sign up page.
		// Set timeout 60 sec for page loading.
		WebDriverWait driverWait = new WebDriverWait(driver, 60);
		WebElement signUpBtn = driverWait.until(new ExpectedCondition<WebElement>() {
			@Override
			public WebElement apply(WebDriver driver) {
				driver.get(url);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				WebElement signUpBtn = driver.findElement(By.xpath("//div//a[text()='Sign Up']"));
				return signUpBtn;
			}
		});
		// Verify Sign Up page
		signUpBtn.click();
		Thread.sleep(1000);
		String[] str = parseUrl.parseUrlWithSlash(driver.getCurrentUrl());
		String str1 = str[str.length - 1];
		assertEquals("This is not a SignUp page", "signup", str1);

		// Get error message locator, error password locator
		By locator = By.xpath("//div[@class='error-summary ng-scope']//ul/li");
		By passwordLocator = By.xpath("//div[@class='vertical-bottom password-conditions']//li[@class='active']");

		// Get sign-up submit button
		WebElement submiBtn = driver.findElement(By.xpath("//div//button[@type='submit']"));

		// Test all empty inputs
		submiBtn.click();
		Thread.sleep(1000);
		int count = 0;
		Boolean isAllElementExsit = checkElement.isElementExsit(driver, locator);
		if (isAllElementExsit) {
			ArrayList<String> errMsg = new ArrayList<String>();
			List<WebElement> allElements = driver.findElements(locator);
			for (int i = 0; i < allElements.size(); i++) {
				errMsg.add((allElements.get(i)).getText());
			}
			for (int i = 0; i < errMsg.size(); i++) {
				String msg = errMsg.get(i);
				if (msg.equals("Please provide first name") || msg.equals("Please provide last name")
						|| msg.equals("Please provide email") || msg.equals("Please provide company name")
						|| msg.equals("Please provide password")) {
					count++;
				}
			}
			assertEquals("Should total 5 empty inputs, but was " + count, 5, count);
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
			Boolean invalidEmailTest = checkElement.isElementExsit(driver,
					By.xpath("//li[text()='Email is not valid']"));
			if (!invalidEmailTest) {
				assertEquals("email: " + list.get(i) + " is correct", false, true);
			}
		}

		// Input valid email
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
					assertEquals("Invalid Password: " + invalidPasswordList.get(i) + " iscorrect", false,
							validPassword);
				}
			}
		}

		// Input valid password
		password.clear();
		password.sendKeys(passwordAccount);
		Thread.sleep(1000);

		// Get confirm password element
		WebElement confirmPass = driver.findElement(By.xpath("//div//input[@name='confirmpassword']"));

		// Test invalid confirm password
		Thread.sleep(1000);
		confirmPass.sendKeys("invalidConfirmPassword");
		Boolean invalidPW = checkElement.isElementExsit(driver,
				By.xpath("//li[text()='Password and confirm password not match']"));
		if (!invalidPW) {
			assertEquals("Invalid password has error", true, invalidPW);
		}

		// Input valid confirm password
		Thread.sleep(1000);
		confirmPass.clear();
		confirmPass.sendKeys(passwordAccount);
		Thread.sleep(1000);

		// Test create account
		submiBtn.click();
		Thread.sleep(2000);
		String[] parseList = parseUrl.parseUrlWithSlash(driver.getCurrentUrl());
		boolean isCreated = (parseList[parseList.length - 1]).contains("signupsuccess");
		assertEquals("Create account is not succeed", true, isCreated);

	}
}
