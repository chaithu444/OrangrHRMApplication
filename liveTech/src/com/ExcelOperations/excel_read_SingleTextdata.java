package com.ExcelOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_read_SingleTextdata {
	public static void main(String[] args) throws IOException {
		FileInputStream file= new FileInputStream("C:\\Selenium\\liveTech\\src\\com\\Excelfiles\\Book1.xlsx");
		XSSFWorkbook Workbook= new XSSFWorkbook(file);
		XSSFSheet sheet=Workbook.getSheet("Sheet1");
		
		 XSSFRow OfRow=sheet.getRow(0); XSSFCell ofcell=OfRow.getCell(0); String
		  testData= ofcell.getStringCellValue() ;
		  System.out.println(" The data in the row of a cell is:-" +testData);
		 
	//result we observe excel sheet//
		
		  Row newRow= sheet.createRow(2); Cell newRowofcell= newRow.createCell(3); Cell
		  newcell1=newRow.createCell(4); newRowofcell.setCellValue("livetech");
		  newRowofcell.setCellValue("srini"); newcell1.setCellValue("webdriver");
		  FileOutputStream fileoutput=new
		  FileOutputStream("C:\\Selenium\\liveTech\\src\\com\\Excelfiles\\Book1.xlsx");
		  Workbook.write(fileoutput);
		 
		
	}
}
