package com.testingshastra.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	// get value from any file
	public static String getProperty(String FileName, String key) {
		String dir = System.getProperty("user.dir");
		String value = " ";

		try {
			FileInputStream fsi = new FileInputStream(dir + FileName);
			Properties pr = new Properties();
			pr.load(fsi);
			value = pr.getProperty(key);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}

	// get values from objectRepository
	public static String getObject(String key) {
		
		return getProperty("src/main/resources/application.properties",key);
	}
}
