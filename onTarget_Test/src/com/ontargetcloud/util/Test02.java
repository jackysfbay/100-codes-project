package com.ontargetcloud.util;

import java.io.File;
import java.util.Date;
import java.util.logging.Level;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.logging.Logs;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Test02 {

	public static void main(String[] args) throws Exception {
		String firebugPath = "firebug-2.0b8.xpi";
		FirefoxProfile profile = new FirefoxProfile();
		profile.addExtension(new File(firebugPath));
		// profile.setPreference("extensions.firebug.currentVersion", "45.0.1");

		profile.setPreference("extensions.firebug.allPagesActivation", "on");
		// DesiredCapabilities caps = DesiredCapabilities.firefox();
		// LoggingPreferences logPrefs = new LoggingPreferences();
		// logPrefs.enable(LogType.BROWSER, Level.ALL);
		// caps.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);
		WebDriver driver = new FirefoxDriver(profile);
		driver.get("http://www.youtueb.com");

		// Thread.sleep(3000);
		// driver.navigate().refresh();
		 Thread.sleep(3000);

		LogEntries logEntries = driver.manage().logs().get("browser");
		for (LogEntry entry : logEntries) {
			System.out.println(entry.getMessage() + " : " + entry.getLevel());
		}

	}
}
