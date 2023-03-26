package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLibrary.TestBase;
import utilities.TestUtils;

public class VerifyDeatilsInPopup extends TestBase {
	

@FindBy(xpath="//label[@id='intSubscribeEmail-error']")
public WebElement captureErrorMsg;

@FindBy(xpath="//button[text()='Get Offer']")

public WebElement getOfferBtn;

@FindBy(xpath="//p[text()='Time Limited Offer']")

public WebElement timeLimitedOfferTxt;

@FindBy(xpath="//p[text()='Time Limited Offer']")

public WebElement TermsOfUsetxt;


public VerifyDeatilsInPopup() throws IOException {
PageFactory.initElements(driver, this);

}

public void verifyerrormsg() {
	TestUtils.click(getOfferBtn, driver);
}
}