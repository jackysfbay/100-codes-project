package test.seleniumsebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstExampe {

	public static void main(String[] args) {

//		WebDriver driver = new FirefoxDriver();
//		driver.get("http://www.google.com.hk");
//		WebElement element = driver.findElement(By.name("q"));
//		element.sendKeys("Hello, Selenium");
//		element.submit();
//
//		try {
//			Thread.sleep(3000);
//
//		} catch (InterruptedException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		driver.quit();
		
		 try{
	            FirefoxDriver driver = new FirefoxDriver();
	            driver.get("http:www.yahoo.com");
	        } catch(Exception e){
	            e.printStackTrace();
	        }
	}

}
