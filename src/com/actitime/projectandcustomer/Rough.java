package com.actitime.projectandcustomer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rough {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\SATYAJIT\\Desktop\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    Thread.sleep(5000);
    driver.get("https://mail.google.com");
    driver.getCurrentUrl();
    //driver.findElement(By.id("")).sendKeys("");


	}

}
