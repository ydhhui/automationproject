package com.abc.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.log.pack.utilitymethods_1;

public class broswerlaunch {
	public static WebDriver driver;
	@BeforeSuite(alwaysRun = true)
	public void launch() {
		utilitymethods_1 utility=new utilitymethods_1();
	     utility.loadproperties();
	 //    System.out.println(utilitymethods_1.prop.getProperty("broswername"));
	  //   System.out.println(utilitymethods_1.prop.getProperty(url));
	     
		if(utilitymethods_1.prop.getProperty("broswername").equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","resource\\chromedriver.exe");
		 driver=new ChromeDriver();
	//	driver.get("https://opensource-demo.orangehrmlive.com/");
		}
		else if(utilitymethods_1.prop.getProperty("broswername").equalsIgnoreCase("firefox")) {
		  
		System.setProperty("webdriver.gecko.driver","resource\\chromedriver.exe");
		 driver=new FirefoxDriver();
	//	driver.get("https://opensource-demo.orangehrmlive.com/");
		}
		else {
		
		System.setProperty("webdriver.chrome.driver","resource\\chromedriver.exe");
		 driver=new EdgeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		}
		driver.get(utilitymethods_1.prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	@AfterSuite(alwaysRun = true)
    public void close() {
	driver.close();
}
}
