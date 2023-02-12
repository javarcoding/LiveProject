package com.liveproject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.liveproject.base.Base;
import com.liveproject.framework.Elements;



public class LoginPage {

	public LoginPage()
	{
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(id="input-email")
	public static WebElement emailField;
	
	@FindBy(id="input-password")
	public static WebElement passwordField;
	
	@FindBy(css="input[type='submit'][value='Login']")
	public static WebElement loginButton;

	@FindBy(css="div[class$='alert-dismissible']")
	public static WebElement mainWarning;

	@FindBy(linkText="forgotten Password")
	public static WebElement forgotPassword;

	
	
	public static void dologin(String email, String password) {
		Elements.TypeText(LoginPage.emailField, email);
		Elements.TypeText(LoginPage.passwordField, password);
		Elements.click(LoginPage.loginButton);
	} 
	
	public static void dologin()
	{
		Elements.TypeText(emailField, Base.reader.getUsername() );
		Elements.TypeText(emailField, Base.reader.getPassword() );
		Elements.click(loginButton);
	}
}
