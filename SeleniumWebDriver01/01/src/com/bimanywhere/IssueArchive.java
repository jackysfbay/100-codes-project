package com.bimanywhere;

import static org.junit.Assert.*;

import java.util.ArrayList;
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
		String str = issueDetails.getText();
		String[] strs = str.split(" ");
		String issuesID = strs[0]+strs[1];
//		System.out.println(issuesID);
		issueDetails.click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button.btn.btn-info.archive")).click();;
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("ul.nav.nav-tabs.tab-shadow > li.active > a")).click();
		Thread.sleep(1000);
		String listURL =driver.getCurrentUrl();
		driver.get(listURL+"/archived/");
		Thread.sleep(1000);
		WebElement archivedTable = driver.findElement(By.className("table"));
		List<WebElement> archivedRows = archivedTable.findElements(By.xpath(".//tbody/tr"));
		ArrayList<String> list2 = new ArrayList<String>();
		for (int i = 0; i < archivedRows.size(); i++) {
			String[] tempList = ((archivedRows.get(i)).getText()).split(" ");
			list2.add(tempList[0] + tempList[1]);
		}
		String isSameIssue = "true";
		
		for (int i = 0; i <= list2.size()-1; i++) {
			if ((list2.get(i)).equals(issuesID)) {//issuesID
				isSameIssue = "true";
				break;
			}else{
				isSameIssue = "false";
			}
		}
	
			assertEquals("true", isSameIssue);
	}

	@After
	public void exit() {
		 driver.quit();
	}
}
