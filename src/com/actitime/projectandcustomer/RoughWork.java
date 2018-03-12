package com.actitime.projectandcustomer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.apache.xalan.lib.sql.ObjectArray;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RoughWork {

	public int Rowcount(String Sheet1) throws EncryptedDocumentException, InvalidFormatException, IOException{
		FileInputStream fis = new FileInputStream("C:\\Users\\SATYAJIT\\Desktop\\DemoDataprovider.xlsx");
        Workbook wb = new WorkbookFactory().create(fis);
        Sheet sh =  wb.getSheet(Sheet1);
        int rowcount = sh.getLastRowNum()+1;
        return rowcount;
	}
        
     public String Cellvalue(String Sheet1,int row,int cell) throws EncryptedDocumentException, InvalidFormatException, IOException{
    	 
    	 FileInputStream fis = new FileInputStream("C:\\Users\\SATYAJIT\\Desktop\\DemoDataprovider.xlsx");
         Workbook wb = new WorkbookFactory().create(fis);
         Sheet sh =  wb.getSheet(Sheet1);
         Row rw = sh.getRow(row);
         String Cellvalue = rw.getCell(cell).getStringCellValue();
    	 
    	 return Cellvalue;
     }
		
	
}
