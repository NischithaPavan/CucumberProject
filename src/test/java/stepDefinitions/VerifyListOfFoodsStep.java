package stepDefinitions;

import java.io.IOException;

import BaseLibrary.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.VerifyAllTheTabs;
import pageObjects.VerifyListOfFoodsPage;
import utilities.TestUtils;

public class VerifyListOfFoodsStep extends TestBase {
	TestUtils testUtil;
	VerifyListOfFoodsPage fp;
	VerifyAllTheTabs vt;
	
	
	

	@Given("I launch My chrome browser")
	public void i_launch_my_chrome_browser() throws IOException {
		initialization();
		fp=new VerifyListOfFoodsPage();
		vt=new VerifyAllTheTabs();
	   
	   
	}


	@When("I click on Shops")
	public void i_click_on_shops() throws InterruptedException {
		vt.SkipPopup();
		fp.clickShoptab();
		
	    
	}

	@And("I go to our foods")
	public void i_go_to_our_foods() {
	    fp.clickOnOurFoodtab();
	}

	@Then("I verify all the foods")
	public void i_verify_all_the_foods() throws InterruptedException {
		fp.verifyAllTheListOfOurFoods();
	   
	}
	

}
