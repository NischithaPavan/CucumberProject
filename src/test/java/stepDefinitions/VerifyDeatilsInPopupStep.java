package stepDefinitions;

import java.io.IOException;

import BaseLibrary.TestBase;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageObjects.VerifyDeatilsInPopup;
import utilities.TestUtils;

public class VerifyDeatilsInPopupStep extends TestBase {
	
	TestUtils testUtil;
	VerifyDeatilsInPopup vp;

	@Given("I launch chrome browser")
	public void i_launch_chrome_browser() throws IOException {
		initialization();
		vp=new VerifyDeatilsInPopup();
		

	    
	}

	@When("Click on getoffer without emailid and verify error message")
	public void click_on_getoffer_without_emailid_and_verify_error_message() {
		vp.verifyerrormsg();
		String actmsg=vp.captureErrorMsg.getText();
		Assert.assertEquals(actmsg, "Please enter your email address");
        
		
	}

	@And("I capture the popup header text {string}")
	public void i_capture_the_popup_header_text(String string) {
		String headertxt=vp.timeLimitedOfferTxt.getText();
		Assert.assertEquals(headertxt, "Time Limited Offer");
	    
	}
	

	
	@When("Verify Terms of use link")
	public void verify_terms_of_use_link() {
	   
	}







}
