package com.epam.automation.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class AutomationUtil {
	
	private AutomationUtil() {
		
	}
	static Properties prop;
	
	public static void loadProperties() throws FileNotFoundException, IOException {
		prop =  new Properties();
		prop.load(new FileInputStream(new File("properties.properties")));
	}
	
	public static String getURL() {
		return prop.getProperty("URL");
	}
	
	public static String getUserName() {
		return prop.getProperty("USERNAME");
	}
	
	public static String getPassword() {
		return prop.getProperty("PASSWORD");
	}
	
}
