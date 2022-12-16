package com.qa.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SrceenshotUtility {
	
	public static void screenshot(WebDriver driver) throws IOException
	{
		//SceenshotUtility.screenshot(ele);
		
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		
		long unique = System.currentTimeMillis();
		
		FileUtils.copyFile(screenshot, new File("D:\\SeleniumWorkspace\\bootcamp2\\Sreenshots"+methodname+"_"+unique+".png"));

		
	}

}
