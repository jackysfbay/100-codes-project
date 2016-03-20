package com.bimanywhere;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetUserSeesion {
	private String index = "http://stage-cpanel.bimanywhere.com/";
	private WebDriver driver;

	public WebDriver getSeesion() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get(index);

		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("tester@zimfly.com");
		driver.findElement(By.name("password")).sendKeys("zimfly");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button.btn.btn-primary.pull-right")).click();

		WebDriverWait driverWait = new WebDriverWait(driver, 5);
		String getResponeURL = driverWait.until(new ExpectedCondition<String>() {
			@Override
			public String apply(WebDriver driver) {
				return driver.getCurrentUrl();
			}
		});
		String keywords = (getResponeURL.split("="))[1];
		assertEquals("true&type", keywords);
		// System.out.println("done");
		return driver;
	}

	public static void main(String[] args) throws InterruptedException {
		GetUserSeesion session = new GetUserSeesion();
		session.getSeesion();
	}
}
