package BaseLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	
	public static WebDriver driver;
	public static Properties prop;
	
	
//	public TestBase() throws IOException {
//		try {
//			prop=new Properties();
//			
//			FileInputStream ip=new FileInputStream("C:\\Users\\nisch\\eclipse-workspace\\FlipkartProject\\"
//					+ "src\\main\\java\\com\\flipkart\\qa\\config\\config.properties");
//			prop.load(ip);
//			
//		}
//		catch(FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		catch(IOException e) {
//			e.printStackTrace();
//		}
//		
//	}
//	
	public void initialization() {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(co);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
		driver.get("https://www.hmrprogram.com/");

    }
	
	public void teardown() {
		driver.quit();
		
	}
	
	
	
	
	
}
