package stepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import BaseLibrary.TestBase;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import pageObjects.LoginPage;
import pageObjects.VerifyAllTheTabs;
import utilities.TestUtils;

public class VerifyAllTheTabsStep extends TestBase {
	TestUtils testUtil;
	VerifyAllTheTabs Vt;



	@Given("I open chrome browser")
	public void i_open_chrome_browser() throws IOException {	
		initialization();
		Vt=new VerifyAllTheTabs();

	}


	@When("title of the login page is {string}")
	public void title_of_the_login_page_is(String title) throws InterruptedException {
		Thread.sleep(3000);
		Vt.SkipPopup();
		Thread.sleep(10000);
		Assert.assertEquals(title, driver.getTitle());

	}

 @And("Verify How it works tab")
public void verify_how_it_works_tab() throws InterruptedException {
		Thread.sleep(3000);

	 System.out.println("Executing how it works");
	boolean how_it_Works_tab=Vt.tabHowItWorks.isDisplayed();
	Assert.assertTrue(how_it_Works_tab);
}

@Then("verify Success Stories tab")
public void verify_success_stories_tab() throws InterruptedException {
	Thread.sleep(3000);

	boolean success_story_tab=Vt.tabSuccessStory.isDisplayed();
	Assert.assertTrue(success_story_tab);
}

@And("Verify Support tab")
public void verify_support_tab() {
	boolean support_tab=Vt.tabSupport.isDisplayed();
	Assert.assertTrue(support_tab);
}

@Then("Verify Add to cart")
public void verify_add_to_cart() {
	boolean cart_tab=Vt.tabCart.isDisplayed();
	Assert.assertTrue(cart_tab);
}

@Then("Verify SignIn tab")
public void verify_sign_in_tab() {
	boolean signIn_tab=Vt.tabSignIn.isDisplayed();
	Assert.assertTrue(signIn_tab);
}



















}
