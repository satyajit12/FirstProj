package com.actitime.buisnesslib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Pagefactorydesign.ActiveProjectAndCustomer;
import Pagefactorydesign.AddNewCustomer;
import Pagefactorydesign.Common;
import Pagefactorydesign.EditCustomerInformation;
import Pagefactorydesign.Login;
import Pagefactorydesign.Opentask;

import com.actitime.genericLib.Driver;
import com.actitime.genericLib.Webdrivercommonlib;

public class ProjectAndCustomerLib extends Webdrivercommonlib {
	
	
	
	//call loginpage
	Login loginpage = PageFactory.initElements(Driver.driver, Login.class);
	//call opentask page
	Opentask opentaskpage = PageFactory.initElements(Driver.driver,Opentask.class );
	//call activeprojectandcustomerpage
	ActiveProjectAndCustomer ActiveProjectAndCustomerPage = PageFactory.initElements(Driver.driver, ActiveProjectAndCustomer.class);
	//call addnewcustomerpage
	AddNewCustomer AddNewCustomerPage = PageFactory.initElements(Driver.driver, AddNewCustomer.class);
	//call commonpage
	Common commonPage = PageFactory.initElements(Driver.driver, Common.class);
	//call customerverification
	EditCustomerInformation EditCustomerInformationPage = PageFactory.initElements(Driver.driver, EditCustomerInformation.class);
	
	
	
	
	//Login To Actitime
	    public void LoginToApp(String username, String password) throws InterruptedException{
	    //WebDriver driver = Driver.getdriver("firefox");
		//Driver.driver.get("http://user-vaio/login.do");
		//Driver.driver.get("http://localhost/login.do");
		System.out.println(username);
		System.out.println(password);
		
		WaitForTopageLoad();
		//driver.findElement(By.id("username")).sendKeys(username);
		loginpage.getUserNameEdit().sendKeys(username);
		//loginpage.getUserNameEdit().sendKeys(username);
		WaitForTopageLoad();
		loginpage.getPassWordEdit().sendKeys(password);
        WaitForTopageLoad();
		loginpage.getLoginBtnEdit().click();
		
		//Driver.driver.findElement(By.name("username")).sendKeys(username);
		//Driver.driver.findElement(By.name("pwd")).sendKeys(password);
		//Driver.driver.findElement(By.xpath("//input[@type='submit']")).click();
		//WaitForLinkPresent("Projects & Customers");
		WaitForTopageLoad();
	}
	    
	    
	
	 //Navigate To ProjectAndCustomerPage
	    public void ProjectAndCustomerPage(){
	    	//Opentask opentaskpage = PageFactory.initElements(Driver.driver,Opentask.class );

	    opentaskpage.getProjAndCustLink().click();
		//opentaskpage.getProjAndCustLink();

		//Driver.driver.findElement(By.linkText("Projects & Customers")).click();
		WaitForTopageLoad();
	}
	    
	    
	    
	
	 //click the customer add button for creation of customer
	    public void CreationOfCustomer(String customername){
	    ActiveProjectAndCustomerPage.getAddCustBtn().click();
	    	
		//Driver.driver.findElement(By.xpath("//input[@value='Add New Customer']")).click();
		WaitForTopageLoad();
		
		
		
		//create customer
		AddNewCustomerPage.getNameLink().sendKeys(customername);
		AddNewCustomerPage.getCreatCustBtn().click();
		//Driver.driver.findElement(By.name("name")).sendKeys(customername);
		//Driver.driver.findElement(By.xpath("//input[@name='createCustomerSubmit']")).click();
		WaitForTopageLoad();
	}
	    
	    
	  //Logout
        public void Logout(){
        	commonPage.getLoginImg().click();
	   // Driver.driver.findElement(By.xpath("//img[@class='logoutImg']")).click();
}
        
      //Select All the customer  
        public void CustomerInformation(String customername){
        	Select sel = new Select(ActiveProjectAndCustomerPage.getSelectNumber());
        	sel.selectByVisibleText("100");
        	Driver.driver.findElement(By.linkText(customername)).click();
    		
        	
        }
        
      //Customer Verification
        public void EditCustomerInformation(String customername ){
        	String expectedval = customername;
            String actualval = EditCustomerInformationPage.getCustomerverification().getText();
            Assert.assertEquals(actualval,expectedval , "+customer is not verified");
    		
        }



		
        
}
