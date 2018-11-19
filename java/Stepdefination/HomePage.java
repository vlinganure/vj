package Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.ConfigProperties;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


//this is homepage
public class HomePage   {
	

	public  WebDriver driver;
	
	
	ConfigProperties config = new ConfigProperties();
	

	
    
	
	
   	


  	
//	public void init() throws InterruptedException {
//		try {
//			Timesheetpage 			= Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Timesheet Entry')][@href='#']")));
//			Submit 	= Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type=\"button\"][@value=\"Submit\"]")));
//		
//		} catch (Exception exceptionMsg) {
//			System.out.println(exceptionMsg.getMessage());
//			
//		
//	}
//		
//	}
	
	

	

	public void setup()
	{
		System.setProperty("webdriver.Chrome.driver", config.getChromedriver());
		//System.setProperty("webdriver.gecko.driver", "driver\\geckodriver.exe");
	driver = new ChromeDriver();
		driver.manage().window().maximize();
   		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(config.geturl());

	}
		
	

	
}
	
	