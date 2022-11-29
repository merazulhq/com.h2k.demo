package com.H2K.TestCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.H2K.PageObject.LogingPage;
import com.H2K.utility.ExcelLib;

public class TC_Loging_001 extends BaseClasses {
	@Test(dataProvider="data")
	public void logingTest(String uname, String pwd) {
driver.get(baseURL);
		LogingPage p = new LogingPage(driver);
		p.setuname(username);
		logger.info("send username");
		p.setpassword(password);
		logger.info("send password");
		p.clicloging();
		logger.info("click loging button");
		p.logOut();
		logger.info("successfully logout");
logger.fatal("nogood");
 String actual =p.gettitle();
 System.out.println(actual);
		
	}
	@Test(priority=1)
	public void validatetest() {
		
		Assert.assertEquals(true, false);
	}
	@DataProvider(name="data")
	public Object[][] getdata() {
		ExcelLib xl = new ExcelLib("./Excel/excl.xlsx");
	int row=	xl.getRowcount(0);
	Object [][] data = new Object [row][2];
	for (int i=0;i<row;i++)	{
		data[i][0]=xl.getCelldata(0, i, 0);
		data[i][1]=xl.getCelldata(0, i, 1);
	}
		return data;  
	}

}
