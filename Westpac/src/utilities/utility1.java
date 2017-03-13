package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class utility1 {

	WebDriver driver;

	public WebDriver openUrl(String url, WebDriver driver) {
		driver.get(url);
		return driver;
	}

	public String getInput(String key) {
		String path = System.getProperty("user.dir");
		// System.out.println(path);
		File file = new File(path + "\\" + "data.properties");

		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();

		// load properties file
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return prop.getProperty(key);

	}
}
