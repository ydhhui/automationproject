package com.pom.pack; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abc.main.broswerlaunch;

public class home_page extends login_page {


	public  home_page(String username ,String Password) {
		 
			PageFactory.initElements(driver, this);
		
	
		if (!getWelcome().isDisplayed()) { 
			login(username, Password);
		}
		
	}
	
	
	
	@FindBy(id="welcome")
	private WebElement welcome;
	
	
	@FindBy(id="aboutDisplayLink")
	private WebElement aboutDisplayLink;
	
	
	@FindBy(id="displayAbout")
	private WebElement displayAbout;
	
	
	
	public WebElement getWelcome() {
		return welcome;
	}
	
	public WebElement getAbout() {
		return aboutDisplayLink;
		
	}
	
	public WebElement getDisplayAbout() {
		return displayAbout;
	}

	public void GetTheDisplayInformation() {
		getWelcome().click();
		getAbout().click();
		
	}
	
	

}
           