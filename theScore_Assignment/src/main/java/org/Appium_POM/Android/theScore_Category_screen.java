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

public class theScore_Category_screen extends Android_Gestures 

{
	
	AndroidDriver driver;
	
	// constructor
	public theScore_Category_screen(AndroidDriver driver)
	{
		// instance variable
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	
	}	
	
	@AndroidFindBy(id = "com.fivemobile.thescore:id/dismiss_modal")
	private WebElement Dismiss;
	
	@AndroidFindBy(id = "com.fivemobile.thescore:id/navigation_bar_item_icon_view")
	private List<WebElement> Select_Leagues;
	

	
	public void click_Dismiss()
	{
		Dismiss.click();
	}
	
	public void click_Leagues()
	{
		Select_Leagues.get(4).click();
	}
	
}
