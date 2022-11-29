package com.H2K.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LandingPage {
	
	public static WebDriver driver;
	
	public LandingPage(WebDriver rdriver) {
		driver= rdriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText="New Customer")WebElement txtnewcustomer;
	public void setuname() {
		txtnewcustomer.click();
	}
		@FindBy(xpath="//input[@name='name']")WebElement txtcusname;
		
public void customername() {
	txtcusname.sendKeys("Merazul");
}
	@FindBy(xpath="//input[@value='f']")WebElement txtradiobuttonfemale;
public void selectfemale()	{
	txtradiobuttonfemale.click();
}
@FindBy(id="dob")WebElement txtdob;
public void dateofbirth(String mm,String dd, String yy) {
	txtdob.sendKeys("01");
	txtdob.sendKeys("25");
	txtdob.sendKeys("1985");
}
	@FindBy(name="addr")WebElement txtbox;
	public void textbox() {
		txtbox.sendKeys("hello my name is this and that");
	}
	@FindBy(xpath="//input[@name='city']")WebElement txtcity;

public void city() {
	txtcity.sendKeys("ATL");
}
@FindBy(xpath="//input[@name='state']")WebElement txtstate;
public void state() {
	txtstate.sendKeys("georgia"); 
}
@FindBy(xpath="//input[@name='pinno']")WebElement txtpin;
public void pinnum() {
	txtpin.sendKeys("123asd");
}
@FindBy(xpath="//input[@name='telephoneno']")WebElement txtphonenum;
public void phonenum() {
	txtphonenum.sendKeys("123456");
}
@FindBy(xpath="//input[@name='emailid']")WebElement txtemail;
public void email() {
	txtemail.sendKeys("user@gmail.com");
}
@FindBy(xpath="//input[@name='password']")WebElement txtpassword;
public void password() {
	txtpassword.sendKeys("1234dskkc");
}
@FindBy(xpath="//input[@name='res']")WebElement txtresetbuttn;
public void resetuser() {
	txtresetbuttn.click();
}

public void acceptpopup() {
	
driver.switchTo().alert().accept();
	
}




}

