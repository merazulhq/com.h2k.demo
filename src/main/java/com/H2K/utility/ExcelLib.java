package com.H2K.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLib {
	XSSFWorkbook wb;
	public ExcelLib(String path){
		try {
			File src = new File(path);
			FileInputStream fi= new FileInputStream(src);
			 wb = new XSSFWorkbook(fi);
		}catch (Exception e) {
			System.out.println("exception is "+e.getMessage());
		}
	}
public int getRowcount(int sheetnumber) {
int count=	wb.getSheetAt(sheetnumber).getLastRowNum()+1;
return count;
}
public String getCelldata(int sheetnumber,int row,int col) {
	
String celldata=	wb.getSheetAt(sheetnumber).getRow(row).getCell(col).toString();
return celldata;
}
}
