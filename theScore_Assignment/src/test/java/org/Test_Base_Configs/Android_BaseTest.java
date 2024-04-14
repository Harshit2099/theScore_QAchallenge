package org.Test_Base_Configs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import org.Appium_Utilities.Common_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Android_BaseTest extends Common_Utilities
{
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	@BeforeClass(alwaysRun=true)
	public void ConfigureAppium() throws IOException
	{		
		Properties prop = new Properties();
		FileInputStream FLS = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\org\\Appium_POM\\Resources\\Data.properties"); 
		prop.load(FLS);
		String IP =System.getProperty("ip_Address") !=null ? System.getProperty("ip_Address") : prop.getProperty("ip_Address");
		String port = prop.getProperty("Port");
		String Device_name = prop.getProperty("DeviceName");
		int Using_Port = Integer.parseInt(port);	// converting string 'port' to int and storing it in 'Using_Port'  
		
		service = Start_Appium_Server(IP,Using_Port);		
	
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName(Device_name);
		// for real device
		//options.setDeviceName("Android Device");
		options.setApp("C:\\<dir to update>\\Appium_POM\\src\\test\\java\\resources\\theScore_24.6.0App.apk");
		driver = new AndroidDriver(service.getUrl(), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	
	@AfterClass(alwaysRun=true)
	public void TearDown()
	{
		driver.quit();
		service.stop();
	}
	
}
