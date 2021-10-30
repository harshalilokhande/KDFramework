package com.baseclass;

import org.testng.annotations.BeforeMethod;

import com.testingshastra.util.PropertiesFile;

public class Application {

	private static final String FILEPATH = "/src/main/resources/application.properties";

	@BeforeMethod
	public String getBrowser() {
		 return PropertiesFile.getProperty(FILEPATH, "keyword.browser");

	}

	public String getAppurl() {
		return PropertiesFile.getProperty(FILEPATH, "keyword.dev.app.url");
	}

	public void getFullName() {
}
}