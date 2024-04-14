package org.Appium_POM;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.Test;

import org.Appium_POM.Android.theScore_Category_screen;
import org.Appium_POM.Android.theScore_ChooseTeams_screen;
import org.Appium_POM.Android.theScore_Landing_screen;
import org.Appium_POM.Android.theScore_Leagues_screen;
import org.Test_Base_Configs.Android_BaseTest;


public class TA_20_theScore_assignment extends Android_BaseTest 
{
	
	@Test(groups = {"smoke"})
	public void GeneralStore() throws MalformedURLException, InterruptedException
	{
		// Object for the class score_Screens
		theScore_Landing_screen Score_Landing_screen = new theScore_Landing_screen(driver);
		theScore_ChooseTeams_screen Score_ChooseTeams_screen = new theScore_ChooseTeams_screen(driver);
		theScore_Category_screen Score_Category_screen = new theScore_Category_screen(driver);
		theScore_Leagues_screen Score_Leagues_screen = new theScore_Leagues_screen(driver);
		
		
		Score_Landing_screen.click_Getstarted();
		Score_Landing_screen.Flick_to_F1();
		Score_Landing_screen.click_F1();
		Score_Landing_screen.click_continue();
		
		Score_ChooseTeams_screen.click_MayBeLater();
		Score_ChooseTeams_screen.click_Tor_raptors();
		Score_ChooseTeams_screen.click_continue();
		Score_ChooseTeams_screen.click_done();
		Score_ChooseTeams_screen.click_singUp_MayBeLater();
		
		Score_Category_screen.click_Dismiss();
		Score_Category_screen.click_Leagues();
		
		String League = Score_Leagues_screen.get_text_Leagues();
		Assert.assertEquals(League, "Leagues");
		Score_Leagues_screen.click_Formula_one();
		String F1 = Score_Leagues_screen.get_text_Formula_one();
		Assert.assertEquals(F1, "Formula 1");
		String Leagues = Score_Leagues_screen.get_text_Leagues();
		Assert.assertEquals(Leagues, "Leagues");		

	}
	

}
