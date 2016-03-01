package com.bimanywhere;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IssueArchive {
	WebDriver driver;

	@Test
	public void archive() throws InterruptedException {
		GetUserSeesion session = new GetUserSeesion();
		driver = session.getSeesion();
		Thread.sleep(2000);

		WebElement projectsTable = driver.findElement(By.className("table"));
		List<WebElement> projects = projectsTable.findElements(By.xpath(".//tbody/tr"));
		WebElement firstProject = projects.get(0);
		firstProject.click();
		Thread.sleep(2000);
		WebElement issuesTable = driver.findElement(By.className("table"));
		List<WebElement> isssuesRows = issuesTable.findElements(By.xpath(".//tbody/tr"));
		WebElement issueDetails = isssuesRows.get(0);
		
		System.out.println(issueDetails.getText());
		
		
//		issueDetails.click();
		
		
//		
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("button.btn.btn-info.archive")).click();;
//		Thread.sleep(2000);
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
//		Thread.sleep(1000);
//		driver.findElement(By.cssSelector("ul.nav.nav-tabs.tab-shadow > li.active > a")).click();
//		Thread.sleep(1000);
//		String listURL =driver.getCurrentUrl();
//		driver.get(listURL+"/archived/");
//		Thread.sleep(1000);
		
	
	}

	@After
	public void exit() {
		// driver.quit();
	}
}
