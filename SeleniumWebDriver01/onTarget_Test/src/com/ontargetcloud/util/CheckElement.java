package com.ontargetcloud.util;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckElement {

	public Boolean isElementExsit(WebDriver driver, By locator) {
		boolean flag = false;
		try {
			WebElement element = driver.findElement(locator);
			flag = null != element;
		} catch (NoSuchElementException e) {
			
//			System.out.println("Element:" + locator.toString() + " is not exsit!");
		}
		return flag;
	}
}
