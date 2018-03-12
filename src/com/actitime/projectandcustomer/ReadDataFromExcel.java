package com.actitime.projectandcustomer;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		FileInputStream fis = new FileInputStream("C:\\Users\\SATYAJIT\\Desktop\\Satyajit.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("data");
		Row row = sh.getRow(0);
		String data = row.getCell(2).getStringCellValue();
		System.out.println(data);
		}
		catch(Exception e){
			e.getMessage();
		}
	}

}
