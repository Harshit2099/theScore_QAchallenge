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

public class theScore_Leagues_screen extends Android_Gestures 

{
	
	AndroidDriver driver;
	
	// constructor
	public theScore_Leagues_screen(AndroidDriver driver)
	{
		// instance variable
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	
	}	
	
	@AndroidFindBy(xpath = "//*[@text='Leagues']")
	private WebElement get_text_Leagues;
	
	@AndroidFindBy(xpath = "//*[@text='Edit']")
	private WebElement click_edit;
	
	@AndroidFindBy(xpath = "//*[@text='Done']")
	private WebElement click_done;
	
	@AndroidFindBy(xpath = "//*[@text='Formula 1']")
	private WebElement Formula1;


	
	public String get_text_Leagues()
	{		
		String League = get_text_Leagues.getText();
		return League;
	}	
	
	
	public void click_Formula_one()
	{
		click_edit.click();
		click_done.click();
		Formula1.click();
	}
	
	public String get_text_Formula_one()
	{
		String F1_text = Formula1.getText();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		return F1_text;
	}
		
	
}
