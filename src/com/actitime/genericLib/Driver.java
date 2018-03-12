package com.actitime.genericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
// System.setProperty("webdriver.gecko.driver" , "C:\\Users\\SATYAJIT\\Desktop\\FireFoxDriver\\geckodriver.exe");

 public static WebDriver driver ;
	

	public static WebDriver getdriver(String browser){
		
		if(browser.equals("firefox")){
			System.setProperty("webdriver.gecko.driver" , "C:\\Users\\SATYAJIT\\Desktop\\FireFoxDriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		
		
		return driver;
		
	}
	
}
