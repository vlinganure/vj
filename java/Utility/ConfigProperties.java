package Utility;

import java.io.File;
import java.io.FileInputStream;
	
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfigProperties {
	
	
	
	static Properties pro;
	
	
	public ConfigProperties()
	
	{
		
		
		try {
			File src = new File ("C:\\Users\\User\\eclipse-workspace\\cucumber\\Config.properties");
			
			
			FileInputStream fs = new FileInputStream(src);
			
			pro= new Properties();
			
			
			pro.load(fs);
		} catch (Exception e) {
			
			System.out.println("file not found"+e.getMessage());
		}
		
	}
	//this is config class
	
	
	public String geturl()
	{
		
		return pro.getProperty("URL");
	}
	
	public String getChromedriver()
	
	{
		return pro.getProperty("ChromeDriver");
	}
	
	public String getUsername()
	{
		return pro.getProperty("Username");
	}

	public String getPassword()
	{
		return pro.getProperty("Password");
	}



		
}
