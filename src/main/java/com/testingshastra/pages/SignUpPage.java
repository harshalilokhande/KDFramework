package com.testingshastra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage {

	@FindBy(css = "div#navbarContent li:nth-child(5) a")
	public WebElement signUpTab;

	@FindBy(css = "input#name")
	public WebElement fullName;

	@FindBy(css = "input#company_name")
	public WebElement companyName;

	@FindBy(css = "input#email")
	public WebElement emailId;

	@FindBy(css = "input#contact")
	public WebElement mobileNo;

	@FindBy(css = "input#password")
	public WebElement password;

	@FindBy(css = "em#icon-change")
	public WebElement viewPassword;

	@FindBy(css = "div.recaptcha-checkbox-border")
	public WebElement checkBoxRobot;

	@FindBy(css = "button[type='submit']")
	public WebElement signUpButton;

	@FindBy(css = "")
	public WebElement signInWithGoogle;

	@FindBy(css = "")
	public WebElement signInWithFacebook;

	@FindBy(css = "")
	public WebElement signInWithFederation;

	public void clickOnSignUpTab() {
		signUpTab.click();
	}

	public void enterFullName() {
		fullName.sendKeys("harshali lokhande");
	}

	public void enterCompanyName() {
		companyName.sendKeys("testing shastra");
	}

	public void enterEmailIdName() {
		emailId.sendKeys("harshalilokhande1005@gmail.com");
	}

	public void enterMobileNo() {
		mobileNo.sendKeys("9689058194");
	}

	public void enterPassword() {
		password.sendKeys("Harshali@1005");
	}

	public void clickOnViewPassword() {
		viewPassword.click();
	}

	public void clickOnIMNotRobot() {
		checkBoxRobot.click();
	}

	public void clickOnSignUpButton() {
		signUpButton.click();
	}

	public void clickOnSignInwithGoogle() {
		signInWithGoogle.click();
	}

	public void clickOnSignInwithFacebook() {
		signInWithFacebook.click();

	}

	public void clickOnSignInWithFederation() {
		signInWithFederation.click();
	}

}