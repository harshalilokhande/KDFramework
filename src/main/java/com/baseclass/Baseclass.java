package com.baseclass;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.Designkeyword.UIKeywords;

public class Baseclass {

	UIKeywords keyword = UIKeywords.getInstance();
	public RemoteWebDriver driver = null;
	Application app = new Application();

	@BeforeMethod
	public void setUp() {
		keyword.openBrowser("chrome");
		this.driver = keyword.getDriver();
		driver.get("https://www.ijmeet.com");
	}

	@AfterMethod
	public void tearDown() {
		keyword.quitBrowser();
	}
}
