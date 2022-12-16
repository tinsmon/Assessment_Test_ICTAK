package com.qa.utilities;

import java.awt.Desktop.Action;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PageUtility 
{
	
	public static void sendKeys(WebElement ele,String input)
	{
		
		ele.clear();
		ele.sendKeys(input);
		
	}
	public static void clickEle(WebElement ele,WebDriver driver)
	{
		
		WaitUtility.waitForElementToBe(driver, ele);
		ele.click();
	}
	
	public static void scrollWindow(WebDriver driver,WebElement ele)
	{
		((JavascriptExecutor)driver).executeScript("arguments[0],scrollIntoView(true);",ele);
	}
	
	public static String takeText(WebElement ele)
	{
		return ele.getText();
	}
	
	public static boolean display(WebElement ele)
	{
		return ele.isDisplayed();
	}
	
	public static boolean selected(WebElement ele)
	{
		return ele.isSelected();
	}
	
	public static void selectChekbox(WebElement ele)
	{
		if(ele.isSelected())
		{
			ele.click();
		}
	}
	
	 public static void clickElement(WebElement ele,WebDriver driver)
	    {
	        WaitUtility.waitForElementToBe(driver, ele);
	        ele.click();
	    }
	
	public void actionClick(WebElement ele,WebDriver driver)
    {
        Actions action= new Actions(driver);
        action.click().build().perform();
    }
	public void doubleClick(WebElement ele,WebDriver driver)
    {
        Actions action= new Actions(driver);
        action.doubleClick(ele).build().perform();
    }
    public void rightClick(WebElement ele,WebDriver driver) 
    {
        Actions action= new Actions(driver);
        action.contextClick(ele).build().perform();
        
    }
    
    public void hoverClick(WebElement ele,WebDriver driver)
    {
        Actions action= new Actions(driver);
        action.click().build().perform();
    }
    
    public void enterKey(WebElement ele,WebDriver driver) {
    	Actions action = new Actions(driver);
    	action.sendKeys(Keys.ENTER);
    }

}
