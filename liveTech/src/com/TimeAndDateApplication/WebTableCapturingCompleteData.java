package com.TimeAndDateApplication;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Driver;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import webtable.Basetest;

public class WebTableCapturingCompleteData extends Basetest {

	public void CapturingCompleteDataTest() throws IOException {
		FileInputStream excelTestDataFile = new FileInputStream(
				"C:\\Selenium\\liveTech\\src\\com\\Excelfiles\\webtable.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(excelTestDataFile);
		XSSFSheet testDataSheet = workBook.getSheet("Sheet1");
		// WebElement TableElement=driver.findElement(webTableRowLocator);
		By table = By.className("tb-scroll");
		WebElement TableElement = driver.findElement(table);

		By webTableRowLocator = By.tagName("tr");

		List<WebElement> TotalRowsofCells = TableElement.findElements(webTableRowLocator);
		int rowofcell_count = TotalRowsofCells.size();
		for (int rowindex = 0; rowindex < rowofcell_count; rowindex++) {
			Row row = testDataSheet.createRow(rowindex);
			By rowofcell = By.tagName("td");

			List<WebElement> TotalRowofCells = TotalRowsofCells.get(rowindex).findElements(webTableRowLocator);
			int rowofcells_count = TotalRowofCells.size();
			for (int cellindex = 1; cellindex < rowofcells_count; cellindex++) {
				Cell cell = row.createCell(cellindex);
				String WebTableData = TotalRowsofCells.get(rowindex).getText();
				System.out.print(" " + WebTableData + " ");
				cell.setCellValue(WebTableData);
				System.out.println();
			}
			System.out.println();
	}
		FileOutputStream file1 = new FileOutputStream(
				"C:\\Selenium\\liveTech\\src\\com\\Excelfiles\\webtable.xlsx");
		workBook.write(file1);
}

	public static void main(String[] args) throws IOException {
		WebTableCapturingCompleteData obj = new WebTableCapturingCompleteData();
		obj.Setup();
		obj.CapturingCompleteDataTest();
		obj.teardown();
	}
}
