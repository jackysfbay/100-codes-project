package com.ontargetcloud.util;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

import net.jsourcerer.webdriver.jserrorcollector.JavaScriptError;

/**
 * Tests with Firebug ensuring that we get JS errors & console content.
 * 
 * @author Marc Guillemot
 * @version $Revision: $
 */
@Ignore // don't know why but Firebug doesn't automatically open. Need to
		// investigate
public class FirebugConsoleTest {
	static WebDriver driver;

	@BeforeClass
	public static void setup() throws Exception {

		File firebug = new File("firebug-2.0.1.xpi");
		File netExport = new File("netExport-0.9b7.xpi");

		FirefoxProfile profile = new FirefoxProfile();
		try {
			profile.addExtension(firebug);
			profile.addExtension(netExport);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Setting Firebug preferences
		profile.setPreference("extensions.firebug.currentVersion", "2.0");
		profile.setPreference("extensions.firebug.addonBarOpened", true);
		profile.setPreference("extensions.firebug.console.enableSites", true);
		profile.setPreference("extensions.firebug.script.enableSites", true);
		profile.setPreference("extensions.firebug.net.enableSites", true);
		profile.setPreference("extensions.firebug.previousPlacement", 1);
		profile.setPreference("extensions.firebug.allPagesActivation", "on");
		profile.setPreference("extensions.firebug.onByDefault", true);
		profile.setPreference("extensions.firebug.defaultPanelName", "net");

		// Setting netExport preferences
		profile.setPreference("extensions.firebug.netexport.alwaysEnableAutoExport", true);
		profile.setPreference("extensions.firebug.netexport.autoExportToFile", true);
		profile.setPreference("extensions.firebug.netexport.Automation", true);
		profile.setPreference("extensions.firebug.netexport.showPreview", false);

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("firefox");
		capabilities.setPlatform(org.openqa.selenium.Platform.ANY);
		capabilities.setCapability(FirefoxDriver.PROFILE, profile);

		 driver = new FirefoxDriver(capabilities);

	}

	@AfterClass
	public static void tearDown() {
//		driver.quit();
	}

	/**
	 *
	 */
	@Test
	public void simple() throws Exception {
		try {
			Thread.sleep(10000);
			driver.get("http://www.google.com");
			Thread.sleep(10000);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}

	// private String getResource(final String string) {
	// String resource =
	// getClass().getClassLoader().getResource(string).toExternalForm();
	// if (resource.startsWith("file:/") && !resource.startsWith("file:///")) {
	// resource = "file://" + resource.substring(5);
	// }
	// return resource;
	// }
}
