package com.log.pack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.abc.main.broswerlaunch;

public class utilitymethods_1 {
	public static Properties prop;
	public void loadproperties() {
		prop =new Properties();
		try {
			prop.load(new FileInputStream("config.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(prop.getProperty("broswername"));
		System.out.println(prop.getProperty("url"));
	}
		

}
