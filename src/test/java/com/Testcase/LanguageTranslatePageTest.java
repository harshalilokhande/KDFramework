package com.Testcase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Designkeyword.UIKeywords;
import com.baseclass.Baseclass;
import com.testingshastra.pages.LanguageTranslatePage;

public class LanguageTranslatePageTest extends Baseclass {
	UIKeywords keywords = UIKeywords.getInstance();

	@Test
	public void VerifyLanguageTranslatePage() throws InterruptedException {
		LanguageTranslatePage page = PageFactory.initElements(keywords.driver, LanguageTranslatePage.class);
		page.clickOnLanguageTranslate();
		Thread.sleep(3000);
		page.clickOnBackToEnglishTab();
	}

}
