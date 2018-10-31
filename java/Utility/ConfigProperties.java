package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {
	
	
	
	Properties pro;
	
	
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
	
	
	
	public String geturl()
	{
		
		return pro.getProperty("URL");
	}
	
	public String getChromedriver()
	
	{
		return pro.getProperty("ChromeDriver");
	}
	

}
