package org.Appium_POM.Android;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.Appium_Utilities.Android_Gestures;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class theScore_Landing_screen extends Android_Gestures 

{
	
	AndroidDriver driver;
	
	// constructor
	public theScore_Landing_screen(AndroidDriver driver)
	{
		// instance variable
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	
	}	
	
	
	@AndroidFindBy(xpath = "//*[@text='Get Started']")
	private WebElement Get_Started;
	
	@AndroidFindBy(xpath = "//*[@text='NFL Fantasy News']")
	private WebElement NFL;
	
	@AndroidFindBy(xpath = "//*[@text='Formula 1 Racing']")
	private WebElement F1;
	
	@AndroidFindBy(xpath = "//*[@text='Continue']")
	private WebElement Continue;
	
	
	public void click_Getstarted()
	{
		Get_Started.click();
	}
	
	
	public void Flick_to_F1()
	{
		WebElement ele =  NFL;
		flingGesture(ele);
	}	

	
	public void click_F1()
	{		
		F1.click();
	}
	
	public void click_continue()
	{		
		Continue.click();
	}
		
	
}
