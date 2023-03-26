package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLibrary.TestBase;
import utilities.TestUtils;

public class VerifyListOfFoodsPage extends TestBase {
	
	
	@FindBy(xpath="//a[text()='SHOP']")
	public WebElement clickOnShop;
	
	@FindBy(xpath="//div[text()='Our Food']")
	public WebElement clickOnOurFood;
	
	@FindBy(xpath="//div[@class='category-item-container']")
	List<WebElement> foodlist;
	
	public VerifyListOfFoodsPage() throws IOException {
		PageFactory.initElements(driver, this);

		}

	public void clickShoptab() {
		TestUtils.click(clickOnShop, driver);
	}
	public void clickOnOurFoodtab() {
		TestUtils.click(clickOnOurFood, driver);
	}

public void verifyAllTheListOfOurFoods() throws InterruptedException {
	
	System.out.println(foodlist.size());

	
	for(int i=0;i<foodlist.size()-1;i++) {
	     foodlist.get(i).click();
		Thread.sleep(6000);
		driver.navigate().back();
		Thread.sleep(6000);

			
		}
}
}
	
	

