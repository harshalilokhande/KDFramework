package com.testingshastra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Designkeyword.UIKeywords;

public class ContactSalesPage {
	UIKeywords keyword = UIKeywords.getInstance();

	@FindBy(css = "div#navbarContent li:nth-child(3)")
	public WebElement contactSales;

	public void clickOnContactSalesTab() {
		contactSales.click();
	}
}
