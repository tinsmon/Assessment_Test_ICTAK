package com.qa.base;



import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.time.Duration;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class Base {
	public static WebDriver driver;
	public static Properties properties;
	
	@Test
	public static void Base() throws Exception{
		  
		  properties=new Properties();
		  FileInputStream inputstream = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
		  properties.load(new InputStreamReader(inputstream,Charset.forName("UTF-8")));
		  }
	 @BeforeTest
	  public void OnSetUp() throws Exception {
		  
				Base();
				if(properties.getProperty("browser").equals("chrome")) {
					
					driver=new ChromeDriver();
				}
				else if(properties.getProperty("browser").equals("ff")) {
					
					driver=new FirefoxDriver();
				}
				else if(properties.getProperty("browser").equals("edge")) {
					driver=new EdgeDriver();
				}
				
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
			driver.get(properties.getProperty("url"));
			driver.manage().window().maximize();
			System.out.println("SetUp Completed Successfully");
	  }
	  

	  @AfterTest
	  public void afterTest() throws InterruptedException  {
			  System.out.println("Execution Completed Successfully");
			  //Thread.sleep(5000);
			  //driver.close();
		  }

}

//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.nio.charset.Charset;
//import java.util.Properties;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//
//public class Base {
//
//	public WebDriver driver;
//	public static Properties properties;
//	
//	public void initialization() throws IOException
//	{
//		if(properties.getProperty("browser").equals("chrome")) {
//			
//			driver=new ChromeDriver();
//		}
//		
//		else if(properties.getProperty("browser").equals("edge"))
//		{
//			driver=new EdgeDriver();
//		}
//		properties=new Properties();
//		  FileInputStream inputstream = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\qa\\config\\config.properties");
//		  properties.load(new InputStreamReader(inputstream,Charset.forName("UTF-8")));
//		  
//	 
//	}
//}
	


