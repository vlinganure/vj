package Stepdefination;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.ConfigProperties;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {

	
	WebDriver driver;
	
	ConfigProperties config = new ConfigProperties();
	PageObject obj = new PageObject(driver);
	
	
	
	
	
	@Given("^I have url of Facebook$")
	public void i_have_url_of_Facebook() throws Throwable {

		System.setProperty("webdriver.gecko.driver", "driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");

	}

	/*
	 * @When("^I set username as \"(.*?)\"$") public void i_set_username_as(String
	 * uname) throws Throwable {
	 * driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(uname);
	 * 
	 * }
	 * 
	 * @When("^i set password as \"(.*?)\"$") public void i_set_password_as(String
	 * passw) throws Throwable {
	 * driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(passw); }
	 */

	@When("^I set username as(.+)$")
	public void i_set_username_as(String username) throws Throwable {
		// driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
		driver.findElement(By.id("USER")).sendKeys(username);

	}

	@And("^i set password as(.+)$")
	public void i_set_password_as(String password) throws Throwable {
		// driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
		driver.findElement(By.id("PASSWORD")).sendKeys(password);
	}

	@Then("^I am able to login application successfully$")
	public void i_am_able_to_login_application_successfully() throws Throwable {
		/*
		 * driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click(); String abc =
		 * driver.getTitle();
		 * 
		 * Assert.assertTrue("please check user credentails are correct",
		 * abc.equals("Facebook"));
		 */

		driver.findElement(By.xpath("//*[@id=\"login_button\"]")).click();

		String Title = driver.getTitle();
		System.out.println(Title);
		// org.testng.Assert.assertTrue(Title.equals("UltimatixHome"), "please check
		// user credentails are correct");
	}

	@Given("^I have url of Ultimatix$")
	public void i_have_url_of_ultimatix() throws Throwable {
		
		System.setProperty("webdriver.Chrome.driver", config.getChromedriver());
		//System.setProperty("webdriver.gecko.driver", "driver\\geckodriver.exe");
		driver = new ChromeDriver();
   		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(config.geturl());

	}

	@And("^I click on TimesheetEntry link$")
	public void i_click_on_timesheetentry_link() throws Throwable {
 
 obj.opentimesheetpage();
		
	}

	@And("^I am able to navigate to TimesheetEntry page$")
	public void i_am_able_to_navigate_to_timesheetentry_page() throws Throwable {
		String title = driver.getTitle();
		System.out.println(title);

		//Assert.assertTrue(title.equals("Home : Ultimatix - Digitally Connected !"),
		//		"Timesheet page not loaded properly");
		
		
		
			
	}

	@And("^I click on Current allocation link$")
	public void i_click_on_current_allocation_link() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		WebElement element = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[@data-toggle][contains(text(),'Current Allocation')]")));

		// WebElement element =
		// driver.findElement(By.xpath("//a[@data-toggle][contains(text(),'Current
		// Allocation')]"));

		if (element.isDisplayed())

		{
			element.click();
			System.out.println("element is displayed " + element);

		}

		else

		{
			driver.navigate().back();
		}

	}

	
	@And("^I click on submit button$")
	public void i_click_on_submit_button() throws Throwable {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type=\"button\"][@value=\"Submit\"]")));
		
		element.click();


		
		//driver.findElement(By.xpath("//input[@type=\"button\"][@value=\"Submit\"]")).click();

	}
	
	

    @And("^I insert \"([^\"]*)\" in allocation$")
    public void i_insert_something_in_allocation(String strArg1) throws Throwable {
    	
    //	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    	WebDriverWait wait = new WebDriverWait(driver,10);

    	//WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@id='effortAssign')]")));
    	
    	
    	WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"effortAssign30\"]")));

    	if(ele.isDisplayed())
    	{
    		ele.click();
    	}
    	else
    	{
    		driver.quit();

    		
    			

    	}
    	
    	
    	//driver.findElement(By.xpath("//input[@id=\"effortAssign30\"]")).sendKeys(strArg1);
    }

    	
    	
//    	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
//    	
//    	driver.findElement(By.xpath("//input[@id='effortAssign30']")).sendKeys(strArg1);


	}

    
