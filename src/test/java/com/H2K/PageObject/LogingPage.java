package com.H2K.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogingPage {
	
	public static  WebDriver driver;
	
	public LogingPage(WebDriver rdriver) {
		driver= rdriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="uid")	WebElement txtuname;
	public void setuname(String uname) {
		txtuname.sendKeys(uname);
	}
		@FindBy(name="password") WebElement txtpasword;
		public void setpassword(String pwd) {
			txtpasword.sendKeys(pwd);
		}
		@FindBy(name="btnLogin") WebElement txtbtnlog;
		public void clicloging() {
			txtbtnlog.click();
		}

		@FindBy(xpath="//a[normalize-space()='Log out']")WebElement logoutbtn;
		public void logOut() {
			logoutbtn.click();
			driver.switchTo().alert().accept();
		}
		public String gettitle() {
			return driver.getTitle();
		}
	
		
	}

