package com.Designkeyword;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This classs contains UIkeywords which are applicable for webElements and
 * general actions. this is a singleton class.To create object of this class we
 * use {@code getInstance()}
 * 
 * @author Harshalishelar
 *
 */

public class UIKeywords {

	public RemoteWebDriver driver = null;
	private static UIKeywords uikeywords;
	static {
		uikeywords = new UIKeywords();
	}

	public static UIKeywords getInstance() {
		return uikeywords;
	}

	public void openBrowser(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		} else {
			System.err.println("Invalid browser name: " + browserName);
		}
	}

	public void launchBrowser(String url) {
		driver.get(url);

	}

	public void launchUrl(String url) {
		driver.get(url);

	}

	public void Click(WebElement element) {
		element.click();
	}

	public String getTitleofPage() {
		return driver.getTitle();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();

	}

	public RemoteWebDriver getDriver() {
		return driver;

	}

//overloading
	public void enterText(WebElement element, String textToEnter) {// why use 2 methods /overloading
		element.sendKeys(textToEnter); // find element using webelement
	}

	/**
	 * In next version of framework , this method will be deleted.Instead you can
	 * use enterText(String object,String textToEnter)
	 * 
	 * @param LocatorType
	 * @param LocatorValue
	 * @param TextToEnter
	 */
	@Deprecated
	public void enterText(String LocatorType, String LocatorValue, String TextToEnter) {

		getWebElement(LocatorType, LocatorValue).sendKeys(TextToEnter);
	}// if anyone not able to find from webelement they give locatortype and
		// locatorvalue to get webelement

	public WebElement findElement(By cssSelector) {
		return null;

	}

	public WebElement getWebElement(String locatorType, String locatorValue) {
		WebElement element = null;
		if (locatorType.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(locatorValue)).click();
		}

		if (locatorType.equalsIgnoreCase("id")) {
			element = driver.findElement(By.id(locatorValue));
		}
		if (locatorType.equalsIgnoreCase("css")) {
			element = driver.findElement(By.cssSelector(locatorValue));
		}
		if (locatorType.equalsIgnoreCase("name")) {
			element = driver.findElement(By.name(locatorValue));
		}
		if (locatorType.equalsIgnoreCase("class")) {
			element = driver.findElement(By.className(locatorValue));
		}

		if (locatorType.equalsIgnoreCase("tag")) {
			element = driver.findElement(By.tagName(locatorValue));
		}
		return element;

	}

	public void Click(By cssSelector) {

	}

	public void navigateTo() {
		driver.navigate().forward();
	}

	public void switchToFrame(int index) {
		driver.switchTo().frame(index);
	}

	public void switchToFrame(String idorName) {
		driver.switchTo().frame(idorName);
	}

	public void switchTodefaultContent() {

		driver.switchTo().defaultContent();
	}

	public void Click(String locatorType, String locatorValue) {
		getWebElement(locatorType, locatorValue).click();

		/*
		 * if (locatorType.equalsIgnoreCase("xpath")) {
		 * driver.findElement(By.xpath(locatorValue)).click(); }
		 * 
		 * if (locatorType.equalsIgnoreCase("id")) {
		 * driver.findElement(By.id(locatorValue)).click(); } if
		 * (locatorType.equalsIgnoreCase("css")) {
		 * driver.findElement(By.cssSelector(locatorValue)).click(); } if
		 * (locatorType.equalsIgnoreCase("name")) {
		 * driver.findElement(By.name(locatorValue)).click(); } if
		 * (locatorType.equalsIgnoreCase("class")) {
		 * driver.findElement(By.className(locatorValue)).click(); }
		 * 
		 * if (locatorType.equalsIgnoreCase("tag")) {
		 * driver.findElement(By.tagName(locatorValue)).click(); }
		 */
	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();

	}

	public void enterText(String object, String textToEnter) {
		String[] parts = object.split("##");
		getWebElement(parts[0], parts[1]).sendKeys(textToEnter);
	}

	public void Click(String iamnotrobot) {
		// TODO Auto-generated method stub

	}

	public void sendKeys(String input) {

	}

	public void sendKeys(String input, Keys name) {

	}

}
