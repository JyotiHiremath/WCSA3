package ExcelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class writeDataToExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		
		// Step 1: Convert physical file to java readable object
		FileInputStream fis = new FileInputStream("./src/main/resources/TestDataExcel.xlsx");

		// Step 2: Open workbook
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sheet=wb.getSheet("sheet1");
		
		//Creates new row by deleting the older values, should be given only when row doesn't have any data
		//Row row = sheet.createRow(3);
		
		//Get control over row
		Row row=sheet.getRow(1) ;
		

		//Creates new cell by deleting the older values
		Cell cell=row.createCell(2);
		
		

		//It sets the value into the cell
		cell.setCellValue("Hello");
		FileOutputStream fos= new FileOutputStream("./src/main/resources/TestDataExcel.xlsx");
         wb.write(fos);
		fos.flush();
		wb.close();
	}

}
