package ExcelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","/Users/namita/jyoti/11/chromedriver");
		// Step 1: Convert physical file to java readable object
				FileInputStream fis = new FileInputStream("./src/main/resources/TestDataExcel.xlsx");

				// Step 2: Open workbook
				Workbook wb = WorkbookFactory.create(fis);
				
				Sheet sheet=wb.getSheet("sheet1");
				
				//DataFormatter df = new DataFormatter();
				
//				System.out.println(sheet.getLastRowNum());
//				System.out.println(sheet.getRow(0).getLastCellNum());
				
			String[][] arr=new String[sheet.getLastRowNum()+1][sheet.getRow(2).getLastCellNum()];
			
			for(int  i=0; i<=sheet.getLastRowNum(); i++) {
				for(int j=0;j<sheet.getRow(2).getLastCellNum();j++) {
					arr[i][j]= sheet.getRow(i).getCell(j).getStringCellValue();
					
					
				}
			}
			
			for(int  i=0; i<=sheet.getLastRowNum(); i++) {
			
				for(int j=0;j<sheet.getRow(2).getLastCellNum();j++) {
					arr[i][j]= sheet.getRow(i).getCell(j).getStringCellValue();
					System.out.print(arr[i][j]+ "\t");
			
	}
				
				System.out.println();
			}
			wb.close();

}
}
