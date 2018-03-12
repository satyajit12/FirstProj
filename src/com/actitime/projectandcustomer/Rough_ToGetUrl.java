package com.actitime.projectandcustomer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rough_ToGetUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver" , "C:\\Users\\SATYAJIT\\Desktop\\FireFoxDriver\\geckodriver.exe");

		//System.setProperty("webdriver.chrome.driver" , "C:\\Users\\SATYAJIT\\Desktop\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false#identifier");
        System.out.println(driver.getCurrentUrl());
       
	}

}
