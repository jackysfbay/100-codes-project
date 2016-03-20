package com.bimanywhere;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateIssue {
	WebDriver driver;

	@Test
	public void newIssue() throws InterruptedException {
		RamdonMehtod rd = new RamdonMehtod();
		GetUserSeesion session = new GetUserSeesion();
		driver = session.getSeesion();
		Thread.sleep(1000);
		WebElement table = driver.findElement(By.className("table"));
		List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));
		WebElement row = rows.get(0);
		row.click();
		String issueName =rd.title();
		driver.findElement(By.id("add-issue-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("issue-name")).sendKeys("Issue - " +issueName );
		driver.findElement(By.id("issue-description")).sendKeys("Issue description - " + rd.title());
		driver.findElement(By.id("issue-description")).sendKeys("Issue description - " + rd.title());
		Select trades = new Select(driver.findElement(By.id("issue-trade")));
		trades.selectByIndex(1);
		Select assigned = new Select(driver.findElement(By.id("issue-assigned")));
		assigned.selectByIndex(1);
		Select priority = new Select(driver.findElement(By.id("issue-priority")));
		priority.selectByIndex(1);
		Select type = new Select(driver.findElement(By.id("issue-type")));
		type.selectByIndex(1);
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//button[@id='add-issue-btn']"));
		WebElement createBTN = list.get(1);
		createBTN.click();
		Thread.sleep(2000);

		WebElement alert = driver.findElement(By.className("alert"));
		String msg = alert.getText();
		 Boolean isCreated = msg.contains(issueName);
		 assertEquals(true, isCreated);
			Thread.sleep(2000);

	}
	@After
	public void exit(){
		driver.quit();
	}
}
