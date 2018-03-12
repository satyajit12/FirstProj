  package com.actitime.genericLib;

import java.io.FileInputStream;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excellib {
	//String filepath = "Satyajit.xlsx";
	//public static void main(String[] args) {
		String filepath = "C:\\Users\\SATYAJIT\\Desktop\\Satyajit.xlsx";
public String getExcelRowdata (String sheetname,int rownum,int colnum) throws InvalidFormatException, IOException
		{
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		Row row = sh.getRow(rownum);
		String data = row.getCell(colnum).getStringCellValue();
		return data;
			
		}
public int GetRowCount(String Sheetname) throws InvalidFormatException, IOException{
	   FileInputStream fis = new FileInputStream(filepath);
	   Workbook wb = WorkbookFactory.create(fis);
	   Sheet sh = wb.getSheet(Sheetname);
	   int rowcount = sh.getLastRowNum()+1;
	   return rowcount;
}
	
public  void setExcelRowdata(String sheetname,int rownum,int colnum,String writedata) throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		Row row = sh.getRow(rownum);
		Cell cel = row.createCell(colnum);
		cel.setCellType(cel.CELL_TYPE_STRING);
		cel.setCellValue(writedata);
		FileOutputStream fos = new FileOutputStream(filepath);
		wb.write(fos);
		
		
	}

}
