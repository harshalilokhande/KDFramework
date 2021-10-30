package com.testingshastra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Designkeyword.UIKeywords;

public class signInPage {

	UIKeywords keywords = UIKeywords.getInstance();
	@FindBy(css = "div#navbarContent li:nth-child(4) a")
	public WebElement signInTab;

	@FindBy(css = "input#email")
	public WebElement email;

	@FindBy(css = "input#password")
	public WebElement password;

	@FindBy(css = "em#icon-change")
	public WebElement viewPassword;

	@FindBy(css = "input#remember")
	public WebElement remember;

	@FindBy(css = "button[type=\"submit\"]")
	public WebElement signIn;

	@FindBy(css = "div.row a:nth-child(2)")
	public WebElement forgotYourPassword;

	@FindBy(css = "input#forget-email")
	public WebElement emailAddress;

	@FindBy(css = "button[type=\"submit\"]")
	public WebElement passwordResetLink;

	@FindBy(css = "div.container-scroller a")
	public WebElement logInTab;

	public void clickOnSignInTab() {
		signInTab.click();
	}

	public void getEmailAddress() {
		email.sendKeys("harshulokhande1005@gmail.com");
	}

	public void getPassword() {
		password.sendKeys("Harshali@1005");
	}

	public void clickOnViewPasswordIcon() {
		viewPassword.click();
	}

	public void clickOnRememberme() throws InterruptedException {
		remember.click();
	}

	public void getClickOnSignInButton() {
		signIn.click();
	}

	public void invalidEmail() {
		email.sendKeys("harshalilokhande123@gmail.com");
	}

	public void invalidPassword() {
		password.sendKeys("Harshali@105");
	}

	public void clickOnForgotPassword() {
		forgotYourPassword.click();
	}

	public void resetPasswordEmailAddress() {
		emailAddress.sendKeys("harshulokhande1005@gmail.com");
	}

	public void clickOnPasswordResetLink() {
		passwordResetLink.click();
	}

	public void clickOnLogIntab() {
		logInTab.click();

	}
}
