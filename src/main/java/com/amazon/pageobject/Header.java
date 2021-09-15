package com.amazon.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.amazon.uistore.HeaderUI;
import com.amazon.reusablecomponent.ReusableMethods;

public class Header{
	
	HeaderUI h = new HeaderUI();
	
	private WebDriver driver;
	
	public Header(WebDriver driver) {
		this.driver = driver;
	}
	
	//-----------------------------------------------------------------
	public WebElement getSearchBox() {
		return ReusableMethods.getElement(driver, h.searchbox);
	}
	
	//-----------------------------------------------------------------
	public WebElement getLoginButton() {
		return ReusableMethods.getElement(driver, h.loginbutton);
	}
	
	//-----------------------------------------------------------------
	public WebElement getBestSeller() {
		return ReusableMethods.getElement(driver, h.bestseller);
	}
	
	//-----------------------------------------------------------------
	public WebElement getMobiles() {
		return ReusableMethods.getElement(driver, h.mobiles);
	}
	
	//-----------------------------------------------------------------
	public WebElement getAmazonPay() {
		return ReusableMethods.getElement(driver, h.amazonpay);
	}
	
	//-----------------------------------------------------------------
	public WebElement getFashion() {
		return ReusableMethods.getElement(driver, h.fashion);
	}
	
	//-----------------------------------------------------------------
	public WebElement getElectronics() {
		return ReusableMethods.getElement(driver, h.electronics);
	}
	
	//-----------------------------------------------------------------
	public WebElement getPrime() {
		return ReusableMethods.getElement(driver, h.prime);
	}
	
	//-----------------------------------------------------------------
	public WebElement getCustomerService() {
		return ReusableMethods.getElement(driver, h.customerservice);
	}
	
	//-----------------------------------------------------------------
	public WebElement getNewReleases() {
		return ReusableMethods.getElement(driver, h.newreleases);
	}
	
	//-----------------------------------------------------------------
	public WebElement getComputers() {
		return ReusableMethods.getElement(driver, h.computers);	
	}
}
