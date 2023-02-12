package com.liveproject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.liveproject.base.Base;
import com.liveproject.framework.Elements;



public class HeadersSection {

	public HeadersSection()
	{
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(xpath="//span[text()='My Account']")
	public static WebElement myAccountLink;

	@FindBy(linkText="Register")
	public static WebElement register;
	
	@FindBy(linkText="Login")
	public static WebElement login;
	
	@FindBy(name = "Search")
	public static WebElement searchBoxField;
	
	@FindBy(css= "button[class$='btn-lg']")
	public static WebElement searchButton;
	
	@FindBy(xpath= "//span[text()='Shopping Cart']")
	public static WebElement viewShoppingCartOption;
	
	public static void navigateToLoginPage() {
		Elements.click(HeadersSection.myAccountLink);
		Elements.click(HeadersSection.login);
	}
	public static void searchProduct()
	{
		Elements.TypeText(searchBoxField,Base.reader.getProduct());
		Elements.click(searchButton);
		
	}
	
	
	public static void navigateToSoppingCartPage()
	{
		Elements.click(HeadersSection.viewShoppingCartOption);
	}
	
}
