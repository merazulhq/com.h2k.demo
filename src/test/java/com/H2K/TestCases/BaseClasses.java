package com.H2K.TestCases;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.H2K.utility.ReadProperties;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClasses {
	
	ReadProperties properties= new ReadProperties();
	public String username=properties.setUsername();
	public String password=properties.setPassword();
	public String baseURL=properties.seturl();
public	WebDriver driver;
public Logger logger;
@BeforeClass
	public void setup() {
		  logger = LogManager.getLogger(TC_Loging_001.class);
		  
		  String browser= properties.setBrowser();
		  if(browser.equals("chrome")) {
			  WebDriverManager.chromedriver().setup();
			  driver = new ChromeDriver();
		  } 
		  else if(browser.equals("firefox")) {
			  WebDriverManager.firefoxdriver().setup();
			  driver= new FirefoxDriver();
			
		  }
			driver.get(baseURL);
			  driver.manage().window().maximize();
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
@AfterClass
public void tearDown() {
	driver.close();
	
	
	
}

}
