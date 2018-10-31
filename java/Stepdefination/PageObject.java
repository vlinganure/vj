package Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PageObject {
	
	WebDriver driver;
	WebDriverWait Wait;
	
	public PageObject(WebDriver webdriver)
	
	
	{
		
		this.driver = webdriver;	
	   // Wait = new WebDriverWait(this.driver, 15);
		PageFactory.initElements(webdriver, this);
		
		
	}
	
	 
	

	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Timesheet Entry')][@href='#']")

	private WebElement Timesheetpage;
	
	
	@FindBy(how = How.XPATH, using ="//input[@type=\"button\"][@value=\"Submit\"]")
	private WebElement Submit;
	
	
	public void init() throws InterruptedException {
		try {
			Timesheetpage 			= Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Timesheet Entry')][@href='#']")));
			Submit 	= Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type=\"button\"][@value=\"Submit\"]")));
		
		} catch (Exception exceptionMsg) {
			System.out.println(exceptionMsg.getMessage());
			
		
	}
		
	}

	public void	 opentimesheetpage()
	{
	Timesheetpage.click();
	System.out.println(Timesheetpage);
	}
		
	
}
	
	