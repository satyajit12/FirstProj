package com.actitime.projectandcustomer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingOfCalenderPopups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver" , "C:\\Users\\SATYAJIT\\Desktop\\FireFoxDriver\\geckodriver.exe");

WebDriver driver = new FirefoxDriver();
driver.manage().deleteAllCookies();
driver.get("https://www.makemytrip.com/flights");
//FirefoxProfile profile = new FirefoxProfile();
//profile.setAssumeUntrustedCertificateIssuer(false);
//Thread.sleep(5000);
//driver.findElement(By.xpath("//span[text()='Flights']")).click();

//WebDriverWait wait = new WebDriverWait(driver, 180);
//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='DEPARTURE']")));

System.out.println("hi");
Thread.sleep(5000);
driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
Thread.sleep(5000);
//driver.findElement(By.xpath("//a[@title='Next']")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("//td[@fare-date='28-1-2017']")).click();

int count =0;
while (count>12) {
	System.out.println("hi");
	

try{
	System.out.println("halo");
driver.findElement(By.xpath("//td[@fare-date='28-5-2017']")).click();

break;
}
catch(Throwable e){
	System.out.println(e.getMessage());
	driver.findElement(By.xpath("//a[@title='Next']")).click();
	count++;
	System.out.println(count);
}

}

	}

}
