package com.Testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Designkeyword.UIKeywords;
import com.baseclass.Baseclass;
import com.testingshastra.pages.SignUpPage;

public class SignUpPageTest extends Baseclass{
	UIKeywords keyword = UIKeywords.getInstance();

	@Test
	public void verifyUserCanMakeAccountUsingSignUp() throws InterruptedException {
		SignUpPage page = PageFactory.initElements(keyword.driver, SignUpPage.class);
		page.clickOnSignUpTab();
		page.enterFullName();
		page.enterCompanyName();
		page.enterEmailIdName();
		page.enterMobileNo();
		page.enterPassword();
		page.clickOnViewPassword();
		Thread.sleep(2000);
		page.clickOnViewPassword();
		keyword.switchToFrame(0);
		page.clickOnIMNotRobot();
		Thread.sleep(30000);
		keyword.switchTodefaultContent();
		page.clickOnSignUpButton();
		Thread.sleep(5000);

	}
	@Test
	public void m1() {
    System.out.println("SignUpPageTest Chages");
	}

}
