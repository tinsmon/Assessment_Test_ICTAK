package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utilities.PageUtility;

public class LoginPage {
	
	public WebDriver driver;
	
	
	@FindBy(id="txtUsername")
	private WebElement username;
	
	@FindBy(id="txtPassword")
	private WebElement password;
	
	@FindBy(id="btnSubmit")
	private WebElement loginbtn;
	
	
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void userName(String uname) {
		
		PageUtility.sendKeys(username, uname);
	}
	
	public void pass(String pwd) {
		
		PageUtility.sendKeys(password, pwd);
	}
	
	public void login() {
		PageUtility.clickEle(loginbtn, driver);
	}
	
	
	

}
