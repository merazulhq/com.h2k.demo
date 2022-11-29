package com.H2K.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperties {
	Properties pro;
	public ReadProperties() {

		try {
			File src = new File("./Configuaration/config.properties");

			FileInputStream fi = new FileInputStream(src);

			 pro = new Properties();
			pro.load(fi);
 
		} catch (Exception e) {
			System.out.println("exception is: " + e.getMessage());
		}
	}
	public String setUsername() {
		String username=pro.getProperty("username");
		return username;
		
	}
	public String setPassword() {
		String password =pro.getProperty("password");
		return password;
	}
	public String seturl() {
		String url = pro.getProperty("baseURL");
		return url;
	}
	
	public String setBrowser() {
		String browser= pro.getProperty("browser");
		return browser;
	}
	
	
	
	
	
	
	
}
