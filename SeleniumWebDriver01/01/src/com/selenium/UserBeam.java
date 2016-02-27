package com.selenium;

import org.openqa.selenium.WebDriver;

public class UserBeam {

	private String URL;
	WebDriver driver;
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
}
