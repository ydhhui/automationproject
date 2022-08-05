package com.abc.main;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenhot {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "resource\\chromedriver.exe");

		WebDriver driver = driver = new ChromeDriver();
		TakesScreenshot sh = (TakesScreenshot) driver;
		File srcfile = sh.getScreenshotAs(OutputType.FILE);
		File destfile = new File("resource/file.png");
		try {
			FileUtils.copyFile(srcfile, destfile);
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

}
