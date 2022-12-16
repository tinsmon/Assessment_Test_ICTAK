package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utilities.PageUtility;

public class DashBoard {
	
	public WebDriver driver;
	
	@FindBy(xpath="//img[@src=\"img/customer.png\"] ")
	private WebElement emplbtn;
	
	public DashBoard(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void empButton() {
		PageUtility.clickEle(emplbtn, driver);
	}
	
	

}
