package webtable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTable_CapturingCompleWebTableData extends Basetest {


public void capturingCompleWebTableDataTest() throws IOException
{

	// First Row of First Cell Property
			// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
			
			// Last Row of Last Cell Property
			// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
			
	String xpathExpression1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
	String xpathExpression2="]/td[";
	String xpathExpression3="]";
			

	FileInputStream testDataFile = new FileInputStream("./src/com/Excelfiles/TIME.xlsx");
	XSSFWorkbook workBook = new XSSFWorkbook(testDataFile);
	XSSFSheet testDataSheet = workBook.getSheet("Sheet1");


			// to goto every Row of the WebTable
			for(int rowIndex=1;rowIndex<=36;rowIndex++)
			{
				// Creating a new Row in the Sheet
				Row newRow=testDataSheet.createRow(rowIndex-1);
				
				// To goto every Row of all the Cells
				for(int rowOfCell=1;rowOfCell<=8;rowOfCell++)
				{
					// creating a Row of  New Cell
					Cell newRowOfNewCell=newRow.createCell(rowOfCell-1);
					
					By testDataXpathExpressionLocator=By.xpath(xpathExpression1+rowIndex+xpathExpression2+rowOfCell+xpathExpression3);
					WebElement testData=driver.findElement(testDataXpathExpressionLocator);
					String testData_Text=testData.getText();
					
					newRowOfNewCell.setCellValue(testData_Text);
					
					System.out.print(testData_Text+"  ");
					
			FileOutputStream fileOutPut = new FileOutputStream("./src/com/Excelfiles/TIME.xlsx");
					workBook.write(fileOutPut);
					
				}
				System.out.println();
			}
				
		}
		
		public static void main(String[] args) throws IOException {
			WebTable_CapturingCompleWebTableData  tableData = new WebTable_CapturingCompleWebTableData ();
			tableData.Setup();
			tableData.capturingCompleWebTableDataTest();
			tableData.teardown();
			
		}
		
		
		
	}







