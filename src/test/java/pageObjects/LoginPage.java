package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLibrary.TestBase;
import utilities.TestUtils;

public class LoginPage extends TestBase {
	
	
	@FindBy(xpath="//span[text()='Sign In']/parent::a[@class='hmrSignIn']")
	@CacheLookup
	WebElement clickOnSignIntab;
	
	@FindBy(xpath="//input[@id='globalLoginEmail']")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='globalLoginPassword']")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-login']")
	@CacheLookup
	WebElement btnSubmit ;
	
	@FindBy(xpath="//span[@class='int-subscribe-close']")

	public WebElement skipthePopup;
	
public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String uname) {
		txtEmail.clear();
		
		txtEmail.sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
		txtpassword.clear();
		txtpassword.sendKeys(pwd);
		
	}
	public void clickSignIn() {
		if (skipthePopup.isDisplayed()) {
			TestUtils.click(skipthePopup, driver);

		}
		
		TestUtils.click(clickOnSignIntab, driver);
	}
	public void clickSubmit() {
		TestUtils.click(btnSubmit, driver);

	}
	
	
	
	
	
	
	

}
