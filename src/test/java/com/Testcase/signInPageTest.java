package com.Testcase;

import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Designkeyword.UIKeywords;
import com.baseclass.Baseclass;
import com.testingshastra.pages.JoinMeetingPage;
import com.testingshastra.pages.signInPage;
import com.testingshastra.util.WaitFor;

public class signInPageTest extends Baseclass {
	private static final Logger log = Logger.getLogger(signInPageTest.class);
	UIKeywords keyword = UIKeywords.getInstance();

	@Test(priority = 0)
	public void checkForvalidSignInData() throws InterruptedException {

		signInPage page = PageFactory.initElements(keyword.driver, signInPage.class);
		log.info("click on signIn tab");
		page.clickOnSignInTab();
		page.getEmailAddress();
		page.getPassword();
		page.clickOnViewPasswordIcon();
		page.clickOnRememberme();
		Thread.sleep(2000);
		page.clickOnViewPasswordIcon();

		page.getClickOnSignInButton();
		Thread.sleep(3000);
	}

	@Test(priority = 1)
	public void checkForInvalidData() throws InterruptedException {
		signInPage page = PageFactory.initElements(keyword.driver, signInPage.class);
		page.clickOnSignInTab();
		page.invalidEmail();
		page.invalidPassword();
		page.getClickOnSignInButton();
		Thread.sleep(2000);
	}

	@Test(priority = 2)
	public void resetPasswordbyEnteringEmail() throws InterruptedException {
		signInPage page = PageFactory.initElements(keyword.driver, signInPage.class);

		page.clickOnSignInTab();
		page.getEmailAddress();
		page.clickOnForgotPassword();
		page.resetPasswordEmailAddress();
		page.clickOnPasswordResetLink();
		page.clickOnLogIntab();
		page.getEmailAddress();
		page.getPassword();
		Thread.sleep(3000);
		page.getClickOnSignInButton();
	}
}
