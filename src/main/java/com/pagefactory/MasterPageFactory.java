package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	public MasterPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);//handle the null pointer exception
	}
	
	@FindBy(xpath="(//a[contains(text(), 'Sign In')])[1]")
	private WebElement signinbtnHomePage;
	
	@FindBy(xpath="//input[@id='signInName']")
	private WebElement emailfield;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement passwordfield;
	
	@FindBy(xpath="//button[contains(text(), 'Sign In')]")
	private WebElement signinbtn;
	
	@FindBy(xpath="//button[contains(text(), 'Account')]")
	private WebElement accountbtn;
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@class='button']")
	private WebElement loginbtnPB;
	
	@FindBy(xpath="//a[contains(text(), 'Log Out')]")
	private WebElement logoutbtnPB;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtnPB() {
		return loginbtnPB;
	}

	public WebElement getLogoutbtnPB() {
		return logoutbtnPB;
	}

	public WebElement getSigninbtnHomePage() {
		return signinbtnHomePage;
	}

	public WebElement getEmailfield() {
		return emailfield;
	}

	public WebElement getPasswordfield() {
		return passwordfield;
	}

	public WebElement getSigninbtn() {
		return signinbtn;
	}

	public WebElement getAccountbtn() {
		return accountbtn;
	}

}
