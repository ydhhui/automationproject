package com.pom.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abc.main.broswerlaunch;

public class login_page extends broswerlaunch {
	// public WebElement getusername() {
	@FindBy(id = "txtUsername")
	public WebElement Username;

	@FindBy(id = "txtPassword")
	public WebElement Password;
	
	
	@FindBy(id ="btnLogin")
	public WebElement login;

	public WebElement getusername() {
		return Username;
	}

	public WebElement getpassword() {
		return Password;
	}
	
	
	public WebElement getlogin() {
     return login;
	}
	// public WebElement getpassword() {
	// return driver.findElement(By.id("txtPassword"));

	// }

	// public WebElement getlogin() {
	// return driver.findElement(By.id("btnLogin"));

	// }
	public void login(String username, String password) {
		getusername().sendKeys(username);
		getpassword().sendKeys(password);;
		getlogin().click();;

	}
	 public login_page() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

}
