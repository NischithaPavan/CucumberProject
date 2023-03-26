package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import BaseLibrary.TestBase;
import io.cucumber.java.en.*;
import pageObjects.VerifyShopProductsPage;
import utilities.TestUtils;

public class VerifyShopProducts extends TestBase{
	
	TestUtils testutil;
	VerifyShopProductsPage vs;
	
	
	@Given("I land on login page and click on shop")
	public void i_land_on_login_page_and_click_on_shop() throws IOException, InterruptedException {
		initialization();
		vs=new VerifyShopProductsPage();
		vs.clickOnShopTab();
		
	    
	}

	@When("I click on Express shop")
	public void i_click_on_express_shop() {
		vs.clickOnExpressShop();
	    
	}

	@When("I verify Express shop page")
	public void i_verify_express_shop_page() {
		
		String express= vs.verifyExpressShopHeader.getText();
	   Assert.assertEquals(express, "Express Shop");
	}

	@When("I select vanilla and chocolate")
	public void i_select_vanilla_and_chocolate() {
		vs.clickPlusIcon();
	    
	}

	@Then("I scroll the page and click on Add to Cart")
	public void i_scroll_the_page_and_click_on_add_to_cart() {
	    vs.clickAddToCartButton();
        vs.VerifyAddToCartPage();
        
       
		

	}



}
