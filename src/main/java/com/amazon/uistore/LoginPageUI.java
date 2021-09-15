package com.amazon.uistore;

import org.openqa.selenium.By;

public class LoginPageUI {
	
	public By email = By.xpath("//input[@id='ap_email']");

	public By continuebutton = By.xpath("//input[@id='continue']");

	public By conditions = By.xpath("//a[@href='/gp/help/customer/display.html/ref=ap_signin_notification_condition_of_use?ie=UTF8&nodeId=200545940']");

	public By privacynotice = By.xpath("//a[@href='/gp/help/customer/display.html/ref=ap_signin_notification_privacy_notice?ie=UTF8&nodeId=200534380']");

	public By help = By.cssSelector("span.a-expander-prompt");
	
	public By forgotpassword = By.xpath("//a[@id='auth-fpp-link-bottom']");
	
	public By otherissues = By.xpath("//a[@id='ap-other-signin-issues-link']");
	
	//Page 2---------------------------------------------------------
	
	public By change = By.xpath("//a[@id='ap_change_login_claim']");
	
	public By password = By.xpath("//input[@id='ap_password']");
	
	public By signin = By.xpath("//input[@id='signInSubmit']");
	
	public By rememberme = By.xpath("//input[@name='rememberMe']");
	
	public By details = By.xpath("//a[@id='remember_me_learn_more_link']");
	
	

}
