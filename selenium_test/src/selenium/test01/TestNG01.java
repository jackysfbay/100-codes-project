package selenium.test01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class TestNG01 {
	private WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
	}

	@AfterClass
	public void afterClass() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	@Test
	public void test01() throws Exception {
		driver.get("http://www.baidu.com");
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
	}

}
