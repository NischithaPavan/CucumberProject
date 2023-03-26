package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLibrary.TestBase;
import utilities.TestUtils;

public class VerifyAllTheTabs extends TestBase {
	

@FindBy(xpath="//a[text()='HOW IT WORKS']")
public WebElement tabHowItWorks;
	
@FindBy(xpath="//a[text()='SUCCESS STORIES']")
public WebElement tabSuccessStory;

@FindBy(xpath="//a[text()='SUPPORT']")

public WebElement tabSupport;

@FindBy(xpath="//a[text()='SHOP']")

public WebElement tabShop;

@FindBy(xpath="//ul[@class='nav navbar-nav navbar-right no-collapse visible-lg-inline visible-md-inline visible-sm-inline']/li[1]")

public WebElement tabCart;

@FindBy(xpath="//span[text()='Sign In']/parent::a[@class='hmrSignIn']")

public WebElement tabSignIn;

@FindBy(xpath="//span[@class='int-subscribe-close']")

public WebElement skipthePopup;



public VerifyAllTheTabs() throws IOException {
PageFactory.initElements(driver, this);

}

public void SkipPopup() throws InterruptedException {
	
	if (skipthePopup.isDisplayed()) {
		TestUtils.click(skipthePopup, driver);

	}
	
}
public void howItWorksTab() {
	
	boolean how_it_Works_tab=tabHowItWorks.isDisplayed();
	
}
	
}