package com.testingshastra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Designkeyword.UIKeywords;

public class JoinMeetingPage {
	UIKeywords keyword = new UIKeywords();
	@FindBy(css = "div.joinmeeting") //1st approach we follow
	public WebElement quickJoinMeetingTitle;
//	public By quickJoinMeetingTitle = By.cssSelector("div.joinmeeting");//2nd approach

	//public JoinMeetingPage() {
	//	PageFactory.initElements(keyword.driver, this);
	//}

	public String getQuickJoinMeetingTitle() {
		 return quickJoinMeetingTitle.getText();
		//return keyword.driver.findElement(quickJoinMeetingTitle).getText();
	}
}
