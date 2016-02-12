package test.seleniumsebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstExampe {

	public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
		driver.get("http://www.baidu.com");
//		WebElement element = driver.findElement(By.name("q"));
//		element.sendKeys("Hello, Selenium");
//		element.submit();
		
		driver.findElement(By.id("kw")).sendKeys("hello Selenium");
		driver.findElement(By.id("su")).click();

		try {
			Thread.sleep(3000);

		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
	}
		
		driver.quit();
		 
	}

}
