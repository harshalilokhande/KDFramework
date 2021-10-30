package com.Testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Designkeyword.UIKeywords;
import com.testingshastra.pages.HostMeetingPage;

public class HostMeetingPageTest {

	UIKeywords keyword = UIKeywords.getInstance();

	@Test
	public void validHostMeetingTestCases() {
		HostMeetingPage page = PageFactory.initElements(keyword.driver, HostMeetingPage.class);
		page.clickOnHostMeetingTab();
	}

}
