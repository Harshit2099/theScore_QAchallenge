package org.Appium_Utilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.appium.java_client.AppiumDriver;

public class Report_Listeners extends Common_Utilities implements ITestListener 
{			
		  ExtentReports extent = Extend_Report.Get_Report();
		  ExtentTest test;
		  AppiumDriver driver;
		  @Override
	  	  public void onTestStart(ITestResult result) 
	  	  {
			  test = extent.createTest(result.getMethod().getMethodName());
		  }

		  /**
		   * Invoked each time a test succeeds.
		   *
		   * @param result <code>ITestResult</code> containing information about the run test
		   * @see ITestResult#SUCCESS
		   */
		  @Override
	  	  public void onTestSuccess(ITestResult result) 
		  {
		    test.log(Status.PASS, "Test Passed");
		  }

		  /**
		   * Invoked each time a test fails.
		   *
		   * @param result <code>ITestResult</code> containing information about the run test
		   * @see ITestResult#FAILURE
		   */
		  @Override
	  	  public void onTestFailure(ITestResult result) 
		  {
		    test.fail(result.getThrowable());
		    try 
		    {
		    driver = (AppiumDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		    }
		    catch(Exception e1)
		    {
		    	e1.printStackTrace();
		    }
		    
		    try 
		    {
		    test.addScreenCaptureFromPath(GetScreenShot_path(result.getMethod().getMethodName(),driver), result.getMethod().getMethodName());
		    } 
		    catch(IOException e)
		    {
		    	e.printStackTrace();
		    }
		  }

		  /**
		   * Invoked each time a test is skipped.
		   *
		   * @param result <code>ITestResult</code> containing information about the run test
		   * @see ITestResult#SKIP
		   */
		  @Override
	  	  public void onTestSkipped(ITestResult result) 
		  {
		    // not implemented
		  }

		  /**
		   * Invoked each time a method fails but has been annotated with successPercentage and this failure
		   * still keeps it within the success percentage requested.
		   *
		   * @param result <code>ITestResult</code> containing information about the run test
		   * @see ITestResult#SUCCESS_PERCENTAGE_FAILURE
		   */
		  @Override
		  public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
		  {
		    // not implemented
		  }

		  /**
		   * Invoked each time a test fails due to a timeout.
		   *
		   * @param result <code>ITestResult</code> containing information about the run test
		   */
		  @Override
		  public void onTestFailedWithTimeout(ITestResult result) 
		  {
		    onTestFailure(result);
		  }

		  /**
		   * Invoked before running all the test methods belonging to the classes inside the &lt;test&gt;
		   * tag and calling all their Configuration methods.
		   *
		   * @param context The test context
		   */
		  @Override
		  public void onStart(ITestContext context) 
		  {
		    // not implemented
		  }

		  /**
		   * Invoked after all the test methods belonging to the classes inside the &lt;test&gt; tag have
		   * run and all their Configuration methods have been called.
		   *
		   * @param context The test context
		   */
		  @Override
		  public void onFinish(ITestContext context) 
		  {
		    extent.flush();
		  }
}
