package com.actitime.projectandcustomer;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.buisnesslib.ProjectAndCustomerLib;
import com.actitime.genericLib.Driver;
import com.actitime.genericLib.Excellib;
import com.actitime.genericLib.Webdrivercommonlib;



public class projectAndCustomerTest  {
	   Webdrivercommonlib wlib = new Webdrivercommonlib();
	   Excellib elib = new Excellib();
	   ProjectAndCustomerLib plib = new ProjectAndCustomerLib();
       //Written by satyajit bihari
	 @BeforeMethod
public void BrowserSetup(){
		 WebDriver driver = Driver.getdriver("firefox");
			//Driver.driver.get("http://user-vaio/login.do");
	     driver.get("http://localhost/login.do");
			
	   }
	@Test
public void projectandcustomer() throws InvalidFormatException, IOException, InterruptedException{
		
		String username = elib.getExcelRowdata("data", 0, 0);
		String password = elib.getExcelRowdata("data", 0, 1);
		String customername = elib.getExcelRowdata("data", 0, 2);
		//WebDriver driver = new FirefoxDriver();
		//Login to Actitime
		plib.LoginToApp(username, password);
		
		
		//Navigate To ProjectAndCustomerPage
		plib.ProjectAndCustomerPage();
		
		//creation of customer
		plib.CreationOfCustomer(customername);
		
		//select 100 from the dropdown
		//wlib.selectstatement("//select[@name='recordsPerPage']", "100");
		
		//click over the customername
		//Driver.driver.findElement(By.linkText(customername)).click();
		
		
		//verify customer
		plib.CustomerInformation(customername);
		
		//Logout
		plib.Logout();
		
		//Driver.driver.quit();
	}
	
	
	
	
	//@Test
	public void VerifyPage() throws InvalidFormatException, IOException{
		String username = elib.getExcelRowdata("data", 1, 0);
		String password = elib.getExcelRowdata("data", 1, 1);
		String customername = elib.getExcelRowdata("data", 1, 2);
		//WebDriver driver = new FirefoxDriver();
		Driver.driver.get("http://user-vaio/login.do");
		Driver.driver.findElement(By.name("username")).sendKeys(username);
		Driver.driver.findElement(By.name("pwd")).sendKeys(password);
		Driver.driver.findElement(By.xpath("//input[@type='submit']")).click();
		wlib.WaitForTopageLoad();
		//verify text
		String WbXpath = "//td[contains(text(), 'Open Tasks')]";
		String ExpectedText = "Open Tasks"; 
	    boolean Status =wlib.VerifyText(WbXpath, ExpectedText);
	    Assert.assertTrue(Status, "default page is not verified");
	//Driver.driver.quit();
	
		
	}
}
