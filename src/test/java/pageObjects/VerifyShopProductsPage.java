package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLibrary.TestBase;
import utilities.TestUtils;

public class VerifyShopProductsPage extends TestBase{
	
	
	@FindBy(xpath="//span[@class='int-subscribe-close']")

	public WebElement skipthePopup;
	
	
	@FindBy(xpath="//a[text()='SHOP']")
	public WebElement clickShop ;
	
	@FindBy(xpath="//div[text()='Express Shop']")
	public WebElement clickExpressShop ;
	
	@FindBy(xpath="//span[@class='input-group-btn']")
	List <WebElement> ClickOn1stPlus;

	@FindBy(xpath="//a[text()='Add to Cart']")
	public WebElement clickOnAddToCart ;
	
	@FindBy(xpath="//h1[text()='My Shopping Cart']")
	public WebElement verifyMyShoopingCart;
	
	@FindBy(xpath="//h2[text()='Express Shop']")
	public WebElement verifyExpressShopHeader;
	
	@FindBy(xpath="//select[@class='cart-quantity-select']")
	public WebElement selectQuantity ;
	
	@FindBy(xpath="//div[@class='cart-product-name cart-product-total']")
	public WebElement captureTotal;
	
	@FindBy(xpath="//div[normalize-space(text())='Bar Variety 24 pack - 5 Bar Combo']/following-sibling::div/div[contains(text(),'Price')]")
	public WebElement capturePrice;
	
	public VerifyShopProductsPage() throws IOException {
		PageFactory.initElements(driver, this);

		}
	
	public void clickOnShopTab() throws InterruptedException {
		if (skipthePopup.isDisplayed()) {
			TestUtils.click(skipthePopup, driver);

		}
     TestUtils.click(clickShop, driver);
		
		Thread.sleep(4000);
	
     }
	public void clickOnExpressShop() {
	     TestUtils.click(clickExpressShop, driver);

	}
	public void clickPlusIcon() {
	  System.out.println(ClickOn1stPlus.size()-1);
		   ClickOn1stPlus.get(1).click();
			
		}
	
	public void clickAddToCartButton() {
		TestUtils.scrollDown(driver);
	    TestUtils.click(clickOnAddToCart, driver);
	    
	  }
	public void VerifyAddToCartPage() {
		TestUtils.selectByIndex(driver, selectQuantity);
		
		    
		
		
	}
	
	
}