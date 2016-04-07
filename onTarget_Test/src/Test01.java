import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.commons.*;
import org.apache.commons.lang3.StringUtils;
import bsh.commands.dir;
import org.apache.commons.*;

public class Test01 {

	private WebDriver driver;

	@Before
	public void init() {
		

	}

	@Test
	public void test() throws Exception {
		driver = new FirefoxDriver();
		driver.get("http://52.87.243.57:8080/ontarget/#/page/signin");
		Thread.sleep(4000);
		
		WebElement username = driver.findElement(By.xpath("//div//input[@name='username']"));
		System.out.println(" 1  "+StringUtils.isBlank(username.getAttribute("value")));

		username.sendKeys("asd");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='modal-footer']//button[@type='button']")).click();
//
		System.out.println(StringUtils.isBlank(username.getText()));
		System.out.println("--------------------");
		Thread.sleep(2000);
		username.sendKeys("asd");
		System.out.println(StringUtils.isBlank(username.getAttribute("value")));
		Thread.sleep(2000);
		driver.close();
	}

}
