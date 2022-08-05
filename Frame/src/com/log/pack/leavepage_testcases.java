package com.log.pack;

import org.testng.annotations.Test;

import com.abc.main.broswerlaunch;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.pom.pack.login_page;

public class leavepage_testcases extends broswerlaunch {
	@Test()
	public void TC4() {
		ExtentReports report=new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter("Result/result.html");
		report.attachReporter(spark);
		ExtentTest testcase=report.createTest("this is only for test");
		
		login_page log = new login_page();
		testcase.log(Status.INFO, "user eter the userame");
		testcase.log(Status.INFO, "user eter the password");
		testcase.log(Status.INFO, "click on log in buttton");
		log.login("Admin1", "admin123");
		if (!driver.getCurrentUrl().contains("dashboard")) {
			System.out.println(" test case-pass user not  navigate on home page");
			testcase.log(Status.PASS, "user can not navigate on home page");
		} else {
			System.out.println(" test case-fail user can navigate on home page");
		}
		report.flush();
	}
}
