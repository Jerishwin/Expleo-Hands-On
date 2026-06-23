package api.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	public static String getProperty(String key) {
		Properties prop = new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream("src/test/resources/config.properties");
			prop.load(fis);
			return prop.getProperty(key);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			prop.clear();
		}
		return null;
	}
}
