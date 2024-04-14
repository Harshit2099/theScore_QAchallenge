package org.Appium_Utilities;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Common_Utilities 
{

	public AppiumDriverLocalService service;
	
	public AppiumDriverLocalService Start_Appium_Server(String ip_Address, int Port_Number)
	{
		service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\<username>\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress(ip_Address).usingPort(Port_Number).build();
			service.start();
			return service;
	}
	
	public double Remove_Unite_Give_Price(String price_symbol)
	{
		double price = Double.parseDouble(price_symbol.substring(1));
		return price;
	}
	
	
	public void Wait_for_element_to_appear(WebElement Element, String ElementText, AppiumDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.attributeContains(Element,"text",ElementText));
		
	}
	
	public List<HashMap<String, String>> GetJsonData(String JsonFilePath) throws IOException
	{
		//to convert Json to Json String
		String JsonContent = FileUtils.readFileToString(new File(JsonFilePath),StandardCharsets.UTF_8);
		
		
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String, String>> data = mapper.readValue(JsonContent,
				new TypeReference<List<HashMap<String,String>>>()
				{});
		return data;
	}
	
	public String GetScreenShot_path(String TestCase_Name,AppiumDriver driver) throws IOException
	{
		File source = driver.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+TestCase_Name+".png";		
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;
		
	}

}
