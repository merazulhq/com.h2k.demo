package com.H2K.TestData;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerNg extends TestListenerAdapter {
	
	
	ExtentReports extent;
	ExtentTest logger;
	public void onStart (ITestContext testcontext) {
		
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter sp = new ExtentSparkReporter(path);
		 extent = new ExtentReports();
		extent.attachReporter(sp);
		extent.setSystemInfo("Hostname", "LocalHost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("User", "Merazul");
		
		
		sp.config().setDocumentTitle("merazul automation");
		sp.config().setReportName("Funtional Test Automation");
		sp.config().setTheme(Theme.DARK);
	}
		public void onTestSuccess(ITestResult tr) {
			 logger = extent.createTest(tr.getName());
			 logger.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
		}
		public void onTestFailure(ITestResult tr) {
			 logger = extent.createTest(tr.getName());
			 logger.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
		
			 String screenshotPath=System.getProperty("user.dir")+"\\Screenshots\\"+tr.getName()+".png" ;
			
		File f = new File(screenshotPath);
		if(f.exists()) {
			logger.fail("Screenshots is below:"+ logger.addScreenCaptureFromPath(screenshotPath));
		}
		
		}

		public void onTestSkipped(ITestResult tr) {
			
			 logger = extent.createTest(tr.getName());
			 logger.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.ORANGE));
			
		}
		public void onFinish(ITestContext testcontext) {
			
			
			extent.flush();
		}
		
	
	
	

}
