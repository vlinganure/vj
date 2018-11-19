package Stepdefination;

import Utility.ConfigProperties;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest extends HomePage {
	
	
	//this is glue coe
	
	ConfigProperties config = new ConfigProperties();
	
	LoginPage obj = new LoginPage(driver);

	 @When("^I set username$")
	    public void i_set_username() throws Throwable {
		 obj.Username();
	    }

	    @And("^i set password$")
	    public void i_set_password() throws Throwable {
	    	obj.password();
	    }
	

	@Then("^I am able to login application successfully$")
	public void i_am_able_to_login_application_successfully() throws Throwable {
		
	obj.login();

		
	}

	@Given("^I have url of Ultimatix$")
	public void i_have_url_of_ultimatix() throws Throwable {
		
	   obj.setup();
	}

	@And("^I click on TimesheetEntry link$")
	public void i_click_on_timesheetentry_link() throws Throwable {
		//	obj.opentimesheetpage();
	
 

		
	}

	@And("^I am able to navigate to TimesheetEntry page$")
	public void i_am_able_to_navigate_to_timesheetentry_page() throws Throwable {
	//	String title = driver.getTitle();
		//System.out.println(title);

		//Assert.assertTrue(title.equals("Home : Ultimatix - Digitally Connected !"),
		//		"Timesheet page not loaded properly");
		
		
		
			
	}

	@And("^I click on Current allocation link$")
	public void i_click_on_current_allocation_link() throws Throwable {

//		WebDriverWait wait = new WebDriverWait(driver, 30);

	//	WebElement element = wait.until(ExpectedConditions
//				.elementToBeClickable(By.xpath("//a[@data-toggle][contains(text(),'Current Allocation')]")));

		// WebElement element =
		// driver.findElement(By.xpath("//a[@data-toggle][contains(text(),'Current
		// Allocation')]"));

	//	if (element.isDisplayed())

///		{/	element.click();//
	//		System.out.println("element is displayed " + element);

		}

	//	else

		//{
		//	driver.navigate().back();
	//	}

	//}

	
	@And("^I click on submit button$")
	public void i_click_on_submit_button() throws Throwable {
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		
	//	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type=\"button\"][@value=\"Submit\"]")));
		
		//element.click();


		
		//driver.findElement(By.xpath("//input[@type=\"button\"][@value=\"Submit\"]")).click();

	}
	
	

   @And("^I insert \"([^\"]*)\" in allocation$")
   public void i_insert_something_in_allocation(String strArg1) throws Throwable {
   	
   //	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
   	//WebDriverWait wait = new WebDriverWait(driver,10);

   	/////WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@id='effortAssign')]")));
   	
   	
   	//WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"effortAssign30\"]")));

   	//if(ele.isDisplayed())
   	//{
   		//ele.click();
   	//}
   	//else
   	//{
   		//driver.quit();

   		
   			

   	}
   	
   	
   	//driver.findElement(By.xpath("//input[@id=\"effortAssign30\"]")).sendKeys(strArg1);
   }

   	
   	
//   	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
//   	
//   	driver.findElement(By.xpath("//input[@id='effortAssign30']")).sendKeys(strArg1);


	//}

   



