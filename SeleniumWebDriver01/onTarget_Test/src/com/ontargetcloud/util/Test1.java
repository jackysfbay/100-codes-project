package com.ontargetcloud.util;

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

public class Test1 {
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
		driver.get("http://52.87.243.57:8080/ontarget/#/page/signup");
		Thread.sleep(3000);
//		WebElement submiBtn =driver.findElement(By.xpath("//div//button[@type='submit']"));
//		submiBtn.click();
//		Thread.sleep(1000);
		By locator = By.xpath("//div[@class='error-summary ng-scope']//ul/li");
		driver.findElement(By.xpath("//div//input[@name='password']")).sendKeys("Quest2012!");
		WebElement confirmPass = driver.findElement(By.xpath("//div//input[@name='confirmpassword']"));
		confirmPass.sendKeys("2222");
		Thread.sleep(1000);
		WebElement confirmError = driver.findElement(locator);
		System.out.println(confirmError.getText());

		
	}

	@After
	public void afterTest() throws Exception {
		Thread.sleep(10000);
		driver.quit();
	}
}
