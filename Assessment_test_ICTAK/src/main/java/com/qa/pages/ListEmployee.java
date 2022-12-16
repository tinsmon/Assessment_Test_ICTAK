package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utilities.PageUtility;

public class ListEmployee {
	
	public WebDriver driver;
	
	@FindBy(id="addButton")
	private WebElement addbtn;
	
	public ListEmployee(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void addButton() {
		PageUtility.clickEle(addbtn, driver);
	}

}
