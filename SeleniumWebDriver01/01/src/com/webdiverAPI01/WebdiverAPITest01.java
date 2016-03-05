package com.webdiverAPI01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.sun.corba.se.spi.orbutil.fsm.Action;

public class WebdiverAPITest01 {
	WebDriver driver;

	@Test
	public void test() throws InterruptedException {
		driver = new FirefoxDriver();

		// driver.manage().window().maximize();

		driver.get("http://localhost:63343/JS_Test01/selapi.html");

		// get title
		String title = driver.getTitle();
		// verify title
		assertEquals("selenium api demo", title);

		// get label name
		String lableName = driver.findElement(By.xpath("//div[input[@id='userName']]/label")).getText();
		System.out.println(lableName);

		// clean input text
		driver.findElement(By.xpath("//div//input[@id='userName']")).clear();

		// get webelement type
		String type = driver.findElement(By.name("sex")).getAttribute("type");
		System.out.println(type);

		// get getCSSValue
		String isDisplay = driver.findElement(By.name("hiddenLabel")).getCssValue("display");
		System.out.println(isDisplay);

		// verify radio M is selected
		WebElement rd_sex_f = driver.findElement(By.xpath("//label[text()='F:']/following-sibling::input"));
		System.out.println(rd_sex_f.isSelected());

		// test select
		WebElement red = driver.findElement(By.name("select")).findElement(By.xpath("//option[@value='1']"));
		System.out.println("is red selected: "+red.isSelected());
		Select select = new Select(driver.findElement(By.name("select")));
		select.selectByVisibleText("blue");
		
		//test alert
		driver.findElement(By.xpath("//div//input[@value='testAlert']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		//test prompt
		WebElement btn_test_testPrompt = driver.findElement(By.xpath("//input[@value='testPrompt']"));
		btn_test_testPrompt.click();

		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("i'm bruce");
		Thread.sleep(1000);
		prompt.accept();
		
		//double click
		WebElement div_double_click = driver.findElement(By.id("doubleClickDiv"));
		Actions actions = new Actions(driver);
		actions.doubleClick(div_double_click).build().perform();
		Thread.sleep(1000);

		WebElement div_mouse_clickAndHold_release = driver.findElement(By.xpath("//span[text()='click and hold here']"));
		actions.clickAndHold(div_mouse_clickAndHold_release).build().perform();
		Thread.sleep(1000);
		
//		WebElement txt_test_key_event = driver.findElement(By.id("test_key_event"));
//		txt_test_key_event.click();
//		actions.keyDown(txt_test_key_event, Keys.SHIFT).sendKeys(txt_test_key_event, "w")
//		.keyUp(txt_test_key_event, Keys.SHIFT).perform();
//		Thread.sleep(1000);
		
		driver.findElement(By.id("test_key_event")).sendKeys("asdas");;
		actions.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		System.out.println("done");

	}

	@After
	public void quit() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}

}
