package com.testingshastra.pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Designkeyword.UIKeywords;

public class HomePage {

	UIKeywords keyword = UIKeywords.getInstance();

	@FindBy(css = "div#navbarContent li:nth-child(1)") // automatically call driver instance call find element and set
														// variable with this locator
	public WebElement joinMeetingTab;// set the variable with css locator

	@FindBy(css = "div.footer-last-view-support ul")
	public List<WebElement> infoLinks;

	public WebElement navbarContent;// if not write locator it find it bydefault using id or name written as
									// webelement

	@FindBy(css = "div.mv-icons-add-views img")
	public WebElement androidIcon;

	@FindBy(css = "div.mv-icons-add-views:nth-child(2) img")
	public WebElement appleIcon;

	@FindBy(css = "div.mv-icons-add-views:nth-child(3) img")
	public WebElement windowIcon;

	public HomePage() {
		PageFactory.initElements(keyword.driver, this);
	}

	public void clickOnJoinMeetingTab() {
		joinMeetingTab.click();
	}

	public void getTextOfInfoLinks() {
		Iterator<WebElement> itr = infoLinks.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().getText());
		}
	}

	public void rightClickOnNavBar() {
		Actions act = new Actions(keyword.driver);
		act.contextClick(navbarContent).build().perform();
	}

	public void clickOnAndroidIcon() {
		androidIcon.click();
	}

	public void clickOnAppleIcon() {
		appleIcon.click();
	}

	public void clickOnWindowsIcon() {
		windowIcon.click();
	}
}
