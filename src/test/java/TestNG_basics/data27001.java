package TestNG_basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class data27001 {
	
	@DataProvider  /*Name for Data provider method to use inside test case*/
     public String[][] datas() throws IOException {
		
		/* To store the path of file  */
		File file = new File("C:\\Users\\Whynew.in\\eclipse-workspace\\Seleniummavasession\\datas work sheet.xlsx");
		
            /*To read the path of file */
		FileInputStream files = new FileInputStream(file) ;
		  /*To read the excel */
		XSSFWorkbook workbook = new XSSFWorkbook(files);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int NoOfRows = sheet.getPhysicalNumberOfRows();
		int NoOfCells =sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[NoOfRows][NoOfCells];
		
		
		for (int i=0; i<NoOfRows-1; i++) {
			
			for (int j=0; j<NoOfCells; j++){
			
			DataFormatter datasss = new DataFormatter();
			
			data[i][j] = datasss.formatCellValue(sheet.getRow(i+1).getCell(j));
		}
		
		
		workbook.close();
		files.close();
		
		}
		return data;
		
		
		
	}
	
	
}
