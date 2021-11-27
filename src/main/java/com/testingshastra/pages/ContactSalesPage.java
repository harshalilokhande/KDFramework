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
	@FindBy(css = "input[type=\"text\"]")
	public WebElement nameField;

	public void getTextOfName() {
		nameField.sendKeys("Harshali lokhande");
	}
	@FindBy(css = "input[type=\"email\"]")
	public WebElement emailField;

	public void getTextOfEmail() {
		emailField.sendKeys("harshulokhamde1005@gmail.com");
	}
	@FindBy(css = "textarea.form-control")
	public WebElement typeMessage;

	public void enterTextInMessageField() {
		typeMessage.sendKeys("I am using ijmeet software");
	}
	@FindBy(css = "div.recaptcha-checkbox-border")
	public WebElement IMNotRobot;

	public void clickOnIMNotRobotCheckbox() {
		IMNotRobot.click();
	}
	@FindBy(css = "button[type='submit']")
	public WebElement sendButton;

	public void clickOnSendButton() {
		sendButton.click();
	}
	
}
