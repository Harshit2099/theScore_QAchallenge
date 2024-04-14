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

public class theScore_ChooseTeams_screen extends Android_Gestures 

{
	
	AndroidDriver driver;
	
	// constructor
	public theScore_ChooseTeams_screen(AndroidDriver driver)
	{
		// instance variable
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	
	}	
	
	@AndroidFindBy(xpath = "//*[@text='Maybe Later']")
	private WebElement Select_MayBeLater;
	
	@AndroidFindBy(xpath = "//*[@text='Toronto Raptors']")
	private WebElement Select_TOR_Raptors;	

	@AndroidFindBy(id = "com.fivemobile.thescore:id/action_button_text")
	private WebElement Continue;
		
	@AndroidFindBy(id = "com.fivemobile.thescore:id/btn_primary")
	private WebElement Done;
	
	@AndroidFindBy(xpath = "//*[@text='Maybe Later']")
	private WebElement singUp_MayBeLater;
	
	public void click_MayBeLater()
	{
		Select_MayBeLater.click();
	}
	
	public void click_Tor_raptors()
	{
		Select_TOR_Raptors.click();
	}
	
	public void click_continue()
	{		
		Continue.click();
	}	
	
	public void click_done()
	{		
		Done.click();
	}
	
	public void click_singUp_MayBeLater()
	{		
		singUp_MayBeLater.click();
	}
	

		
	
}
