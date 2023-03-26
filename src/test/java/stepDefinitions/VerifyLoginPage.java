package stepDefinitions;

import BaseLibrary.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.LoginPage;
import utilities.TestUtils;

public class VerifyLoginPage extends TestBase {
	
	TestUtils testUtil;
	LoginPage lp;
	
	@Given("Launch chrome browser")
	public void launch_chrome_browser() {
	 initialization();
	 lp=new LoginPage();
	 
	 
		
	}

	@Given("Click on SignIn")
	public void click_on_sign_in() {
		lp.clickSignIn();
	   
	}

	@When("User enters Email as  {string} and Password as {string}")	
	public void user_enters_email_as_and_password_as(String email, String password) {	   
		lp.setUserName(email);
	    lp.setPassword(password);
	    
		
	}

	@Then("Click on Submit")
	public void click_on_submit() {
		lp.clickSubmit();
		
	    
	}
	@Then("Page title should be {string}")
	public void page_title_should_be(String title) {
		Assert.assertEquals(title,"Fast weight loss. Lasting change.");
	    
	}

	@Then("close browser")
	public void close_browser() {
	    driver.close();
	}


	

}
