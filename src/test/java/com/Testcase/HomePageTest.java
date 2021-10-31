package com.Testcase;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.log4testng.Logger;

import com.Designkeyword.UIKeywords;
import com.baseclass.Baseclass;
import com.testingshastra.pages.ContactSalesPage;
import com.testingshastra.pages.HomePage;
import com.testingshastra.pages.HostMeetingPage;
import com.testingshastra.pages.JoinMeetingPage;
import com.testingshastra.pages.SignUpPage;

public class HomePageTest extends Baseclass {
	private static final Logger log = Logger.getLogger(HomePageTest.class);
	UIKeywords keyword = UIKeywords.getInstance();

	@Test(priority = -2)
	public void verifyClickOnAndroidIconImage() throws InterruptedException {
		HomePage home = PageFactory.initElements(keyword.driver, HomePage.class);
		home.clickOnAndroidIcon();
		Thread.sleep(2000);
	}

	@Test
	public void VerifyClickOnAppleIcon() {
		HomePage home = PageFactory.initElements(keyword.driver, HomePage.class);
		home.clickOnAppleIcon();
	}

	@Test
	public void VerifyClickOnWindowsIcon() {
		HomePage home = PageFactory.initElements(keyword.driver, HomePage.class);
		home.clickOnWindowsIcon();
	}
	@Test(priority = -1)
	public void verifyTitleOfHomePage() {
		String expectedTitle = "IJmeet";
		AssertJUnit.assertEquals(keyword.driver.getTitle(), expectedTitle);
		log.info(expectedTitle);
	}

	@Test(priority = 0)
	public void verifyUserRedirectToJoinMeetingPage() throws InterruptedException {
		HomePage home = new HomePage(); // other way make objectof page class &
		// write constructor in pageclass & call pagefactory in it
		// HomePage home = PageFactory.initElements(keyword.driver, HomePage.class);
		home.clickOnJoinMeetingTab();

		// JoinMeetingPage joinmeeting = new JoinMeetingPage();
		// WaitFor.VisibilityOfElement(joinmeeting.quickJoinMeetingTitle, 10);
		JoinMeetingPage joinmeeting = PageFactory.initElements(keyword.driver, JoinMeetingPage.class);
		String actual = joinmeeting.getQuickJoinMeetingTitle();
		home.rightClickOnNavBar();
		log.info("click on nav bar");
		Thread.sleep(3000);
		Assert.assertTrue(actual.contains("Quick"));
	}

	@Test(priority = 1)
	public void verifyUserRedirectToSignUpPage() {
		SignUpPage page = PageFactory.initElements(keyword.driver, SignUpPage.class);
		page.clickOnSignUpTab();
		log.info("User is on signUp page");
	}

	@Test(priority = 4)
	public void verifyUserRedirectToSignInPage() {
		SignUpPage page = PageFactory.initElements(keyword.driver, SignUpPage.class);
		log.info("User is on SignIn page");
		page.clickOnSignUpTab();
	}

	@Test(priority = 3)
	public void verifyUserRedirectToContactSales() {
		ContactSalesPage page = PageFactory.initElements(keyword.driver, ContactSalesPage.class);
		page.clickOnContactSalesTab();
	}

	@Test(priority = 2)
	public void verifyUserRedirectToHostMeetingPage() {
		HostMeetingPage page = PageFactory.initElements(keyword.driver, HostMeetingPage.class);
		log.info("User is on SignIn page");
		page.clickOnHostMeetingTab();
	}

	@Test(priority = 5)
	public void printAllInfoLinks() {
		HomePage page = new HomePage();
		page.getTextOfInfoLinks();
		log.info("print all links name");
	}
}
