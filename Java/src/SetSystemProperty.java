import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class SetSystemProperty {

	static String profilepath = "config.properties";

	private static Properties props = new Properties();
	static {
		try {
			props.load(new FileInputStream(profilepath));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(-1);
		} catch (IOException e) {
			System.exit(-1);
		}
	}

	public static String getTestData(String key) {
		return props.getProperty(key);
	}

	public static void writeProperties(String keyname, String keyvalue) {
		try {

			OutputStream fos = new FileOutputStream(profilepath);
			props.setProperty(keyname, keyvalue);
			props.store(fos, "Update '" + keyname + "' value");
		} catch (IOException e) {
			System.err.println("config.properties updated failed!");
		}
	}


	public static void updateProperties(String keyname, String keyvalue) {
		try {
			props.load(new FileInputStream(profilepath));
			OutputStream fos = new FileOutputStream(profilepath);
			props.setProperty(keyname, keyvalue);
			props.store(fos, "Update '" + keyname + "' value");
		} catch (IOException e) {
			System.err.println("config.properties updated failed!");
		}
	}

	public static void main(String[] args) {
		writeProperties("MAIL_SERVER_INCOMING", "3.com");
		updateProperties("MAIL_SERVER_INCOMIsasdsad222NG", "1");
		
		System.out.println("done");
		System.out.println(getTestData("MAIL_SERVER_INCOMING"));
	}
}
