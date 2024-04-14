package org.Appium_Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extend_Report 
{
	static ExtentReports Extent; 
	public static ExtentReports Get_Report()
	{
		// ExtentSparkReporter and ExtentReports were used
		String Path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter Reporter = new ExtentSparkReporter(Path);
		Reporter.config().setReportName("Appium Automation Report");
		Reporter.config().setDocumentTitle("Test Results");
		Extent = new ExtentReports();	//its declared globally
		Extent.attachReporter(Reporter);
		Extent.setSystemInfo("Tester", "Appium Tester");
		return Extent;
	}

}
