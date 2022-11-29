package com.H2K.TestCases;

import org.testng.annotations.Test;

import com.H2K.PageObject.LandingPage;
import com.H2K.PageObject.LogingPage;

public class TC_Landing_002 extends BaseClasses{
	
	@Test
	public void landing() {
		logger.info("url is open");
		LogingPage loging = new LogingPage(driver);
		LandingPage l= new LandingPage(driver);
		loging.setuname(username);
		loging.setpassword(password); 
		loging.clicloging();
		l.setuname();
		logger.info("set username");
		l.customername();
		logger.info("put customer name");
		l.selectfemale();
		logger.info("select gender");
		l.dateofbirth("mm","dd","yy");
		logger.info("put date of birth");
		l.textbox();
		logger.info("write on text box");
		l.city();
		logger.info("select city");
		l.state();
		logger.info("select state");
		l.pinnum();
		logger.info("set pin"); 
		l.phonenum();
		logger.info("set phonenumber");
		l.email();
		logger.info("set email");
		l.password();
		logger.info("set password");
		l.resetuser();
		logger.info("reset user");
		
		
		
		
		
		
		
		
		
		
	}

}
