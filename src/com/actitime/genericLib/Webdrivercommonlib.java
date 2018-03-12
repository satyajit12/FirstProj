package com.actitime.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Webdrivercommonlib {
	
	
//impliciwait statement
public void WaitForTopageLoad(){
	Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
//explicitwait statement by linktext

public void WaitForLinkPresent(String linkName){
	WebDriverWait wait = new  WebDriverWait(Driver.driver, 20);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(linkName)));
}


//explicitwait statement by xpath
public void WaitForXpathPresent(String Xpath){
	
	WebDriverWait wait = new WebDriverWait(Driver.driver, 20);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath)));
}



//useage of function overloading in case of selectstatement

public void selectstatement( String selXpath,String value){
	WebElement selwb = Driver.driver.findElement(By.xpath(selXpath));
	Select sel = new Select(selwb);
	sel.selectByVisibleText(value);
}
public void selectstatement( String selXpath,int index){
	WebElement selwb = Driver.driver.findElement(By.xpath(selXpath));
	Select sel = new Select(selwb);
	sel.selectByIndex(index);
}

public boolean VerifyText(String WbXpath,String ExpectedText){
	boolean flag= false;
	String actText=Driver.driver.findElement(By.xpath(WbXpath)).getText();
	if(ExpectedText.equals(actText)){
		flag=true;
		System.out.println(ExpectedText +"text is verified");
		
	}else{
		System.out.println(ExpectedText +"text isnot verified");
	}
	return flag;
}
//handeling alert
public void AcceptAlert(){
	Alert alt = Driver.driver.switchTo().alert();
	System.out.println(alt.getText());
	alt.accept();;
}
public void CancalAlert(){
	Alert alt = Driver.driver.switchTo().alert();
	System.out.println(alt.getText());
	alt.dismiss();
}
	
	
	
	


		
	
	

}
