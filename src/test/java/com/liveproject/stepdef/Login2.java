package com.liveproject.stepdef;



import org.junit.Assert;

import com.liveproject.framework.Browser;
import com.liveproject.framework.Elements;
import com.liveproject.pages.HeadersSection;
import com.liveproject.pages.LoginPage;
import com.liveproject.pages.MyAccountPage;


import io.cucumber.java.en.*;

public class Login2 {

	LoginPage loginpage = new LoginPage();
	HeadersSection headersSection=new HeadersSection();
			
	
	@Given("I launch the application")
	public void i_launch_the_application() {
		Browser.openApplicationURL();
		HeadersSection.navigateToLoginPage();
		LoginPage.dologin();
	}

	@Given("I naviage to Account Login page")
	public void i_naviage_to_account_login_page() {
		Elements.click(HeadersSection.myAccountLink);
		Elements.click(HeadersSection.login);
	}

	@When("I login to the application using Username {string} and Password {string}")
	public void i_login_to_the_application_using_username_and_password(String email, String password) {
		LoginPage.dologin(email, password);
	}

	@Then("I should see that the User is able to successfully login")
	public void i_should_see_that_the_user_is_able_to_successfully_login() {
		Assert.assertTrue(Elements.isDisplayed(MyAccountPage.registerAffiliateAccount));
	}

}
