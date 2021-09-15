package com.amazon.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.amazon.reusablecomponent.ReusableMethods;
import com.amazon.uistore.LoginPageUI;

public class LoginPage {
	
	private WebDriver driver;
	LoginPageUI l = new LoginPageUI();
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getEmailID() {
		return ReusableMethods.getElement(driver, l.email);
	}
	
	public WebElement getContinue() {
		return ReusableMethods.getElement(driver,l.continuebutton);
	}
	
	public WebElement getConditions() {
		return ReusableMethods.getElement(driver,l.conditions);
	}
	
	public WebElement getPrivacyNotice() {
		return ReusableMethods.getElement(driver,l.privacynotice);
	}
	
	public WebElement getHelp() {
		return ReusableMethods.getElement(driver,l.help);
	}
	
	public WebElement forgotPassword() {
		return ReusableMethods.getElement(driver,l.forgotpassword);
	}
	
	public WebElement getOtherIssues() {
		return ReusableMethods.getElement(driver,l.otherissues);
	}
	
	//Page 2---------------------------------------------------------
	
	public WebElement getChange() {
		return ReusableMethods.getElement(driver,l.change);
	}
	
	public WebElement getPassword() {
		return ReusableMethods.getElement(driver,l.password);
	}
	
	public WebElement getSignin() {
		return ReusableMethods.getElement(driver,l.signin);
	}
	
	public WebElement getRememberMe() {
		return ReusableMethods.getElement(driver,l.rememberme);
	}
	
	public WebElement getDetails() {
		return ReusableMethods.getElement(driver,l.details);
	}

}
