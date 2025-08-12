package com.example.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.base;
import pages.LoginPage;
import utils.Screenshotutil;
import utils.excelutil;

public class LoginTest extends base {

	
	LoginPage loginpage;
	
	@BeforeClass
	public void setup()
	{
		
		SetupReport();
		launchbrowser();
		loginpage=new LoginPage(driver);
		   
		}
	
	
	/*@Test
	public void logintest() throws Exception
	{
		
		Test=extent.createTest("Login");
		
	    loginpage=new LoginPage(driver);
	    Test.pass("Browser launched successfully");
		
		loginpage.enterusername("Admin");
		Test.pass("Username Entered");
		
		loginpage.enterpassword("admin123");
		Test.pass("password Entered");
		
		
		loginpage.clicklogin();
		Test.pass("Login Button clicked");
		
		
		Screenshotutil s=new Screenshotutil();
		s.captureScreenshot(driver,"logintest");
		
		System.out.println("Login test executed successfully");
	
	} */
	
	@Test
	public void logintestExcelRead() throws Exception {

	Test=extent.createTest("Login using Excel")	;
	String filepath=System.getProperty("user.dir")+"/src/test/resources/Testdata/login data.xlsx";
	String username=excelutil.getExceldata(filepath, "sheet1", 1, 0);
	String password=excelutil.getExceldata(filepath, "sheet1", 1, 1);
	
  loginpage.enterusername(username);
  loginpage.enterpassword(password);
  loginpage.clicklogin();
  Test.pass("Login with Excel credentials");
	}
  @AfterClass
   
  public void tear()
  
  {
	  flushreport();
	  driver.quit();
	  
  }
  }