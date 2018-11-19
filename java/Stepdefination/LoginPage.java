package Stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends HomePage {
	
	//this is login page
	  
    @FindBy(how=How.ID,using="USER")
    private WebElement USername;
    
    @FindBy(how=How.ID,using="PASSWORD")
    private WebElement Password;
    
    
    @FindBy(how=How.XPATH,using="//*[@id=\"login_button\"]")
    private WebElement Loginbutton;
	

	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Timesheet Entry')][@href='#']")

	private WebElement Timesheetpage;
	

	
	@FindBy(how = How.XPATH, using ="//input[@type=\"button\"][@value=\"Submit\"]")
	private WebElement Submit;
	

	
	public LoginPage(WebDriver driver )
	
	{
	
	
		
		PageFactory.initElements(driver, LoginPage.class);
		
		
		
}

	
	public void Username()
	
	
	
	{
		System.out.println(config.getUsername());
		
		
		USername.sendKeys(config.getUsername());
		
	}
	
	
	public void password()
	{
		Password.sendKeys(config.getPassword());
	}
	
	public void login()
	
	{
		Loginbutton.click();
	}
	
	

}
