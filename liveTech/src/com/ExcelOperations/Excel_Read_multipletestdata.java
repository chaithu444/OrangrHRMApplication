package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_multipletestdata {

	public static void main(String[] args) throws IOException {
	 FileInputStream File = new FileInputStream("C:\\Selenium\\liveTech\\src\\com\\Excelfiles\\test.xlsx");
		XSSFWorkbook WorkBook= new XSSFWorkbook(File);
		XSSFSheet testDataSheet=WorkBook.getSheet("Sheet1");
		int rowsCount=testDataSheet.getLastRowNum();
		for(int rowIndex=0;rowIndex<=rowsCount;rowIndex++)
		{
			Row row=testDataSheet.getRow(rowIndex);
			int CellCount=row.getLastCellNum();
			for(int CellIndex=0;CellIndex<CellCount;CellIndex++) {
				Row activeRow=testDataSheet.getRow(rowIndex);
				Cell Activecell =activeRow .getCell(CellIndex);

				String testData= Activecell.getStringCellValue();
				System.out.print(testData+ " ");
				
			}
			System.out.println();
		}
		
	}		

	
	
		

	}


