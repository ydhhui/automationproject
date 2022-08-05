package com.log.pack;

import org.testng.annotations.Test;

import com.abc.main.broswerlaunch;
import com.pom.pack.home_page;
import com.pom.pack.login_page;

public class home_pageestcases  {
	
/*		broswerlaunch obj = new broswerlaunch();
		obj.launch();
		home_page home = new home_page();
		home.HomePage("Admin", "admin123");
		home.GetTheDisplayInformation();
		// test case-1
/*		if (home.getDisplayAbout().isDisplayed()) {
			System.out.println(" test case-pass  ");
			System.out.println(home.getDisplayAbout().getText());
		} else {
			System.out.println("test case- fail");
		}
	}
	// test case-3
*/
	@Test(description="Verify that user should get the Company inforation ")
	public void TC3() {
	//	broswerlaunch obj = new broswerlaunch();
	//	obj.launch();

		home_page home = new home_page("Admin","admin123");
	//	home.HomePage("Admin","admin123");
		home.GetTheDisplayInformation();

		if (home.getDisplayAbout().isDisplayed()) {
			System.out.println("test case-pass");
			System.out.println(home.getDisplayAbout().getText());
		} else {
			System.out.println("test case- fail");
		}
	}
}
	
