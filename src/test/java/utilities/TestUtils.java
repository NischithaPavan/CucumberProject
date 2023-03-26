package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPage;

public class TestUtils  {
	
	
	
	public static WebDriver driver;
	public static long PAGE_LOAD_TIMEOUT=80;
	public static long IMPLICIT_WAIT=80;
	
	
	
	
		public static String getVisibleAreaScreenshot(WebDriver driver,String screenshotName)
	 {
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 String dest = System.getProperty("user.dir")+"//VisibleViewScreenshots//"+screenshotName+".png";
		 File destination =new File(dest);
		 try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return dest;
	 }
   
   //Switch To Frame
   
   public void switchToFrame(WebDriver driver) {
		driver.switchTo().frame("mainpanel");
		
	}
   
   //Mouse Hover
	
	public static void mouseHover(WebElement element, WebDriver driver) {
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
		
	}
	
	//Check the Element status whether it is visible
	
	public static void waitForVisibility(WebElement element, WebDriver driver) {
		
		new WebDriverWait(driver,Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(element));
		
		
	}
	
	//Check the status for all elements visibility
	
	public static void waitForAllVisiblity(List<WebElement> eleLocation,WebDriver driver ) {
		new WebDriverWait(driver,Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOfAllElements((List<WebElement>) eleLocation));
	}
	
	//Check the Element Status whether it is clickable
	
	public static void waitForClickable(WebElement element,WebDriver driver) {
		
		new WebDriverWait(driver,Duration.ofSeconds(90)).until(ExpectedConditions.elementToBeClickable(element));
	}
	
	//Check the visibility before clickable
	
	public static void click(WebElement element, WebDriver driver) {
		waitForVisibility(element, driver);
		waitForClickable(element, driver);
		element.click();
	}
	
	
	 public static void sendkeys(WebElement element, String value,WebDriver driver) {
		 waitForVisibility(element, driver);
		 waitForClickable(element, driver);
		 element.sendKeys(value);
	 }
	 
	 public static void selectDateByJS(WebDriver driver,WebElement element,String dateVal) {
		 
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].setAttribute('value','"+dateVal+"')",element);
		
	 }
	 
	 public static void selectValueFromDropDownBy(WebDriver driver,WebElement element,String value) {
		 Select sel=new Select(element);
		 sel.deselectByVisibleText(value);
		 
	 }
	 public static void selectByIndex(WebDriver driver,WebElement element) {
		 Select sel=new Select(element);
		 sel.selectByIndex(2);
		 
		 
	 }
	 public static void enter(WebDriver driver)
	 {
		 Actions act= new Actions(driver);
		 act.sendKeys(Keys.ENTER);
	 }
	 public static void scrollDown(WebDriver driver) {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1350)", "");
	 }
	 public static String randomString() {
		 String generatedString=RandomStringUtils.randomAlphabetic(5);
		return (generatedString);
		 
		 
	 }
	 
	 
	 
	 public static void excelData(String sSheet, String sTestCaseid) throws IOException {
		 String excelfilepath=".\\datafiles\\datasheet.xlsx";
		 FileInputStream inputstream=new FileInputStream(excelfilepath);
		 XSSFWorkbook workbook=new XSSFWorkbook(inputstream);
		 XSSFSheet sheet=workbook.getSheet("datasheet.xlsx");
		 int rows=sheet.getLastRowNum();
		 int cols=sheet.getRow(1).getLastCellNum();
		 
		 for(int r=0;r<=rows;r++) {
			 
			 XSSFRow row=sheet.getRow(r);
			 for(int c=0;c<cols;c++) {
				 XSSFCell cell=row.getCell(c);
				 switch(cell.getCellType())
				 {
				 case STRING: System.out.println(cell.getStringCellValue());break;
				 case NUMERIC: System.out.println(cell.getNumericCellValue());break;
				 case BOOLEAN:System.out.println(cell.getBooleanCellValue());break;
				 
				 }
				 System.out.println(" | ");
				 
				}
			 
			 System.out.println();
		 }
		 
	 }
	
	

}
