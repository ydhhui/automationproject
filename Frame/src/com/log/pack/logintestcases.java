package com.log.pack;

import java.sql.Driver;

import org.apache.poi.hslf.record.Document;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.abc.main.broswerlaunch;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.pom.pack.login_page;

public class logintestcases extends broswerlaunch {
	public  static ExtentReports report;
	public static ExtentSparkReporter spark;
	public static ExtentTest testcase;
	
	@BeforeClass()
	public void extentreportgenerate() {
		report=new ExtentReports();
		spark=new ExtentSparkReporter("Result/Result.html");
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("automation-orange hrms");
		spark.config().setReportName("orange hrms");
		report.attachReporter(spark);	
		
		
		
		
	}
	
/*	
	public static void main(String[] args) {
	//	broswerlaunch obja=new broswerlaunch();
	//	obja.launch();
		login_page log=new login_page();
		log.login("Admin1","admin123");
		//---testcase1
		log.getusername().sendKeys("Admin1");;
		log.getpassword().sendKeys("admin123");;
		log.getlogin().click();;                      
        if(!driver.getCurrentUrl().contains("dashboard")) {
			System.out.println(" test case-pass user not  navigate on home page");
		}else {
			System.out.println(" test case-fail user can navigate on home page");
		}
        //--test case2
      //---testcase1
        log.login("Admin","admin123");
        log.getusername().sendKeys("Admin");;
		log.getpassword().sendKeys("admin123");;
	    log.getlogin().click();;                       
              if(driver.getCurrentUrl().contains("dashboard")) {
      			System.out.println(" test case-pass user navigate on home page");
      		}else {
      			System.out.println(" test case-fail user can not navigate on ho me page");
      		}
	}  
	/*
	                               
	 */
//@Test(groups = { "sanity"})
	@Test(groups= {"smoke"})
	public void TC1() {
	//	broswerlaunch obja = new broswerlaunch();
	//	obja.launch();
		
		login_page log = new login_page();
		testcase=report.createTest("login with invalid credetilas").assignCategory("smoke");
		testcase.log(Status.INFO, "user eter the userame");
		testcase.log(Status.INFO, "user eter the password");
		testcase.log(Status.INFO, "click on log in buttton");
		log.login("Admin1", "admin123");
		if (!driver.getCurrentUrl().contains("dashboard")) {
			testcase.log(Status.PASS," user will not be navigate or login ");
			System.out.println(" test case-pass user not  navigate on home page");
		} else {
			testcase.log(Status.FAIL, "user able to log in on home page ");
			System.out.println(" test case-fail user can navigate on home page");
		}

	}
	@Test(groups= {"sanity"})
	public void TC2() {
		//broswerlaunch obja = new broswerlaunch();
	//	obja.launch();
		login_page log = new login_page();
		testcase=report.createTest("login with valid credetilas").assignCategory("sanity");
		testcase.log(Status.INFO, "user eter the userame");
		testcase.log(Status.INFO, "user eter the password");
		testcase.log(Status.INFO, "click on log in buttton");
		log.login("Admin", "admin123");
		if (driver.getCurrentUrl().contains("dashboard")) {
			testcase.log(Status.PASS, "user log in with valid credentials");
			System.out.println(" test case-pass user  navigate on home page");
		} else {
			testcase.log(Status.FAIL,"user will not log in on homepage");
			System.out.println(" test case-fail user can not navigate on home page");
		}
		
	}
	   @AfterClass()
	   public void closereport() {
	      report.flush();
	    }
	

}
