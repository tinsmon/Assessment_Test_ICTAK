package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utilities.PageUtility;

public class AddEmployee {
	
public WebDriver driver;
	
	
	@FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder1$txtName']")
	private WebElement name;
	
	@FindBy(id="ContentPlaceHolder1_txtEmployeeId")
	private WebElement employeeid;
	
	@FindBy(id="ContentPlaceHolder1_txtPassword")
	private WebElement password1;
	
	@FindBy(id="ContentPlaceHolder1_txtConfirmPassword")
	private WebElement confpassword;
	
	@FindBy(id="ContentPlaceHolder1_txtEmail")
	private WebElement email;
	
	
	@FindBy(id="ContentPlaceHolder1_txtMobileNumber")
	private WebElement mobile;
	
	@FindBy(xpath="//option[@value = '5']//parent::select//following-sibling::option[6]")
	private WebElement designation;
	
	@FindBy(xpath="//option[text()='Permanant']")
	private WebElement emptyp;
	
	@FindBy(xpath="//option[text()='Admin']" )
	private WebElement rptng;
	
	@FindBy(id="ContentPlaceHolder1_ChkReportingStaff")
	private WebElement chkbox;
	
	@FindBy(id="ContentPlaceHolder1_txtAddress")
	private WebElement address;
	
	@FindBy(xpath="//option[text()='Staff']")
	private WebElement memberof;
	
	@FindBy(id="ContentPlaceHolder1_btnSubmit")
	private WebElement submit;
	
	
	
	
	public AddEmployee(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Name(String fname) {
		
		PageUtility.sendKeys(name, fname);
	}
	
	public void eid(String id) {
		
		PageUtility.sendKeys(employeeid, id);
	}
	
	public void pass(String pass1) {
	
	PageUtility.sendKeys(password1, pass1);
	}

	public void conf(String conpass) {
	
	PageUtility.sendKeys(confpassword, conpass);
	}

	public void mail(String email1) {
	
	PageUtility.sendKeys(email, email1);
	}
	public void mob(String mob1) {
		
	PageUtility.sendKeys(mobile, mob1);
	}
	
	public void emptype() {
		
		PageUtility.clickEle(emptyp, driver);
		}

	public void desig() {
	
	PageUtility.clickEle(designation, driver);
	}
	
	
	public void reportingTo() {
		
		PageUtility.clickEle(rptng, driver);
		}
	
	public void checkbox() {
		
		PageUtility.clickEle(chkbox, driver);
		}
	
	public void address1(String addr) {
		
		PageUtility.sendKeys(address,addr );
		}
	
	public void memberOf() {
		
		PageUtility.clickEle(memberof, driver);
		}
	
	public void submit1() {
		
		PageUtility.clickEle(submit, driver);
		}
	
	
	

}
