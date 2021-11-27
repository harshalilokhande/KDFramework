package com.testingshastra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Designkeyword.UIKeywords;

public class LanguageTranslatePage {
	UIKeywords keyword = UIKeywords.getInstance();
	@FindBy(css = "span.language-trance img")
	public WebElement LanguageTranslate;

	public void clickOnLanguageTranslate() {
		LanguageTranslate.click();

	}
	@FindBy(css = "span.language-trance-arabic ")
	public WebElement BackToEnglish;

	public void clickOnBackToEnglishTab() {
		BackToEnglish.click();

	}
	
}
