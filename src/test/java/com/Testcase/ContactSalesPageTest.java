package com.Testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Designkeyword.UIKeywords;
import com.baseclass.Baseclass;
import com.testingshastra.pages.ContactSalesPage;


@Test
public class ContactSalesPageTest extends Baseclass {

	UIKeywords keyword = UIKeywords.getInstance();

	public void VerifyContactSalesPage() throws InterruptedException {
		ContactSalesPage page = PageFactory.initElements(keyword.driver, ContactSalesPage.class);
		page.clickOnContactSalesTab();
		page.getTextOfName();
		page.getTextOfEmail();
		page.enterTextInMessageField();
		page.clickOnIMNotRobotCheckbox();
		Thread.sleep(10000);
		page.clickOnSendButton();

	}
}
