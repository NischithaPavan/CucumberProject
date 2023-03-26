package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLibrary.TestBase;
import utilities.TestUtils;

public class VerifySearchRecipesPage extends TestBase {

	
	@FindBy(xpath="//a[text()='SUPPORT']")
	public WebElement clickSupportTab;

	@FindBy(xpath="//div[text()='Recipes']")
    public WebElement clickOnReceipes;

	@FindBy(xpath="//input[@type='search']")
	public WebElement clickOnSearch;
	@FindBy(xpath="//span[@class='int-subscribe-close']")

	public WebElement skipthePopup;
	
	
	public VerifySearchRecipesPage() throws IOException {
		PageFactory.initElements(driver, this);

		}
	
	public void verifySupporttab() throws InterruptedException {
		if (skipthePopup.isDisplayed()) {
			TestUtils.click(skipthePopup, driver);

		}

		
		Thread.sleep(4000);
		TestUtils.click(clickSupportTab, driver);
		
	}
	public void veifyReceipestab() {
		TestUtils.click(clickOnReceipes, driver);

	}
	
	public void verifySearch() throws InterruptedException {
		TestUtils.sendkeys(clickOnSearch, "Cake Shake", driver);		
		Thread.sleep(4000);
        TestUtils.enter(driver);
		Thread.sleep(4000);

	}
	
	

}
