package org.Appium_Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Android_Gestures extends Common_Utilities
{
	AndroidDriver driver;
	public Android_Gestures(AndroidDriver driver)
	{
		
		this.driver = driver;
	}

	
	
	public void flingGesture(WebElement ele)
	{
	((JavascriptExecutor) driver).executeScript("mobile: flingGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) ele).getId(),
			    "direction", "down",
			    "speed", 4000
			));
	}
}
