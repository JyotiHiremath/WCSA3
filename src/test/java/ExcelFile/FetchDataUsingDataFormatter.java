package ExcelFile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataUsingDataFormatter {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver","/Users/namita/jyoti/11/chromedriver");
		
		// Step 1: Convert physical file to java readable object
				FileInputStream fis = new FileInputStream("./src/main/resources/TestDataExcel.xlsx");

				// Step 2: Open workbook
				Workbook wb = WorkbookFactory.create(fis);
				
				
				   DataFormatter df=new DataFormatter();
				   
//				   Sheet sheet = wb.getSheet("Sheet1");
//					Row row = sheet.getRow(3);
//					Cell cell = row.getCell(0);
//					
//					System.out.println(df.formatCellValue(cell));
				   
				   
				   
			System.out.println(df.formatCellValue(wb.getSheet("sheet1").getRow(3).getCell(0)));
				wb.close();


	}

}
