package com.testingshastra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Designkeyword.UIKeywords;

public class HostMeetingPage {

	UIKeywords key = UIKeywords.getInstance();
	@FindBy(css = "div#navbarContent li:nth-child(2)")
	public WebElement hostMeetingTab;

//@FindBy(css="div#navbarContent li:nth-child(2)")
//public WebElement ;
//@FindBy(css="div#navbarContent li:nth-child(2)")
//public WebElement ;
//@FindBy(css="div#navbarContent li:nth-child(2)")
//public WebElement ;
//@FindBy(css="div#navbarContent li:nth-child(2)")
//public WebElement ;
//	

public void clickOnHostMeetingTab() {
hostMeetingTab.click();
	
}

}
