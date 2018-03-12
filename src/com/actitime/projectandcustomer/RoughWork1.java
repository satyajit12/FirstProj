package com.actitime.projectandcustomer;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.apache.xalan.lib.sql.ObjectArray;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RoughWork1 {
RoughWork rj = new RoughWork();
@Test(dataProvider="data")

public void getData(String username,String pwd){
	//System.out.print(username);
	//System.out.println( pwd);
	
	
}

@DataProvider

public Object[][] data() throws EncryptedDocumentException, InvalidFormatException, IOException {
	int rowcount = rj.Rowcount("Sheet1");
	
		
	
	Object[][] objaary = new Object[rowcount][2];
	for(int i =0;i<rowcount;i++){
	objaary[i][0] = rj.Cellvalue("Sheet1", i, 0);
	objaary[i][1] = rj.Cellvalue("Sheet1", i, 1);
	
	
	}
	return objaary;
	}







}
