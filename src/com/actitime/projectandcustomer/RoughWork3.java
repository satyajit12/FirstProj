package com.actitime.projectandcustomer;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RoughWork3 {
static String Filepath = "C:\\Users\\SATYAJIT\\Desktop\\Signature standardization.docx";
	
	
	public static void fileupload(String Filepath){
	StringSelection srt = new StringSelection(Filepath);
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(srt, null);
    }
	
	public static void Fileattachment() throws AWTException {

		fileupload(Filepath);
		
		Robot rw = new Robot();
		rw.keyPress(KeyEvent.VK_CONTROL);
		rw.keyPress(KeyEvent.VK_V);
		rw.keyRelease(KeyEvent.VK_V);
		rw.keyRelease(KeyEvent.VK_CONTROL);
		rw.keyPress(KeyEvent.VK_ENTER);
		rw.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
	
	
	
	
	//public void gmailLogin() throws InterruptedException, AWTException{
		System.setProperty("webdriver.gecko.driver" , "C:\\Users\\SATYAJIT\\Desktop\\FireFoxDriver\\geckodriver.exe");

		//System.setProperty("webdriver.chrome.driver" , "C:\\Users\\SATYAJIT\\Desktop\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false#identifier");
		driver.getCurrentUrl();
		driver.findElement(By.id("Email")).sendKeys("biharisatyajit@gmail.com");
		driver.findElement(By.xpath(".//*[@id='next']")).click(); 
		Thread.sleep(3000);
		driver.findElement(By.id("Passwd")).sendKeys("9481981420");
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']")).click();
		Thread.sleep(5000);
		Fileattachment();
	//}
	
	
	
	//public static void main(String[] args) {
		// TODO Auto-generated method stub



	}
}
