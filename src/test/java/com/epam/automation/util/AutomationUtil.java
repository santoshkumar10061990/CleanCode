package com.epam.automation.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

public class AutomationUtil {
	
	private static final Logger LOGGER =  
            Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private AutomationUtil() {
		
	}
	static Properties prop;
	
	public static void loadProperties() {
		prop =  new Properties();
		try {
			prop.load(new FileInputStream(new File("properties.properties")));
		} catch (FileNotFoundException e) {
			LOGGER.info(e.getMessage());
		} catch (IOException e) {
			LOGGER.info(e.getMessage());
		}
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
