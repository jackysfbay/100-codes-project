package com.bimanywhere;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IssuesFilter {
	WebDriver driver;

	@Test
	public void filterIssue() throws InterruptedException {
		GetUserSeesion session = new GetUserSeesion();
		driver = session.getSeesion();
		Thread.sleep(1000);
		WebElement projectsTable = driver.findElement(By.className("table"));
		List<WebElement> projectRows = projectsTable.findElements(By.xpath(".//tbody/tr"));
		(projectRows.get(0)).click();
		Thread.sleep(2000);

		driver.findElement(By.className("form-control")).sendKeys("Issue");
		Thread.sleep(5000);
		WebElement issuesTable = driver.findElement(By.className("table"));
		List<WebElement> isssuesRows = issuesTable.findElements(By.xpath(".//tbody/tr"));
		String rowSize = isssuesRows.size() + "";
		String filterNo = driver.findElement(By.className("pagedisplay")).getText();
		String str1 = filterNo.replaceAll("[^0-9]*([0-9]*)[^0-9]*", "$1\'");
		String[] str2 = str1.split("'");
		Boolean result = rowSize.equals(str2[2]);
		assertEquals(true, result);
		Thread.sleep(2000);
	}

	@After
	public void exit() {

		driver.quit();
	}

}
