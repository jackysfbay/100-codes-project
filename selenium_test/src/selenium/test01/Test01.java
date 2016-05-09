package selenium.test01;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test01 {

	@Test
	public void test() throws Exception{
		
		 System.setProperty("webdriver.firefox.bin","/Applications/Firefox.app/Contents/MacOS/firefox-bin");
		    WebDriver driver = new FirefoxDriver();
		
		    driver.get("http://www.google.com/");
	}

}
