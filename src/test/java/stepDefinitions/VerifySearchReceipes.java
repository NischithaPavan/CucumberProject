package stepDefinitions;

import java.io.IOException;

import BaseLibrary.TestBase;
import io.cucumber.java.en.*;
import pageObjects.VerifySearchRecipesPage;
import utilities.TestUtils;

public class VerifySearchReceipes extends TestBase {
	
	TestUtils testutil;
	VerifySearchRecipesPage sp;
	
	@Given("I launch my chrome browser")
	public void i_launch_my_chrome_browser() throws IOException {
		initialization();
		sp=new VerifySearchRecipesPage();
		
	    
	}

	@When("I click on support tab")
	public void i_click_on_support_tab() throws InterruptedException {
		sp.verifySupporttab();
	   
	}

	@Then("I click on Receipes tab")
	public void i_click_on_receipes_tab() {
		sp.veifyReceipestab();
	   
	}

	@Then("I Search the Recepies {string}")
	public void i_search_the_recepies(String string) throws InterruptedException {
		sp.verifySearch();
	  
	}

	


}
