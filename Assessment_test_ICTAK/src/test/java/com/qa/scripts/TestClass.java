package com.qa.scripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.qa.base.Base;
import com.qa.pages.AddEmployee;
import com.qa.pages.DashBoard;
import com.qa.pages.ListEmployee;
import com.qa.pages.LoginPage;
import com.qa.utilities.ExcelUtility;

public class TestClass extends Base {
	
	
	public LoginPage objLogin;
	public DashBoard objDash;
	public ListEmployee objEmp;
	public AddEmployee objEmpAdd;
	
	
		
	@Test(priority=1)
		public void validLogin() throws IOException {
			objLogin = new LoginPage(driver);
			String username1= ExcelUtility.getCellData(0, 0);
			String password1 = "123";
			objLogin.userName(username1);
			objLogin.pass(password1);
			objLogin.login();
			
						
		}
	
	@Test(priority=2)
	public void dashBoard() {
		objDash =new DashBoard(driver);
		objDash.empButton();
		
	}
	@Test(priority=3)
	public void addbtn() {
		objEmp = new ListEmployee(driver);
		objEmp.addButton();
	}
	
	@Test(priority=4)
	public void addemp() throws IOException {
		objEmpAdd = new AddEmployee(driver);
		String name1= ExcelUtility.getCellData(1, 0);
		String empid1 = ExcelUtility.getCellData(2, 0);
		String passwd1= "12345";
		String confp1= "12345";
		String mail1= ExcelUtility.getCellData(3, 0);
		String mob2="8156919822";
		objEmpAdd.Name(name1);
		objEmpAdd.eid(empid1);
		objEmpAdd.pass(passwd1);
		objEmpAdd.conf(confp1);
		objEmpAdd.mail(mail1);
		objEmpAdd.mob(mob2);
	    objEmpAdd.desig();
	    objEmpAdd.emptype();
	    objEmpAdd.reportingTo();
	    objEmpAdd.checkbox();
	    String address1 = ExcelUtility.getCellData(4, 0);
	    objEmpAdd.memberOf();
	    objEmpAdd.submit1();
		
		
	}
	
	
	
		
		
	

}
