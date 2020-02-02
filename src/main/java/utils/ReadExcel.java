package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static String[][] readExcel() throws IOException {
		XSSFWorkbook wbook = new XSSFWorkbook("./data/TC001_CreateLead.xlsx");
		XSSFSheet wsheet = wbook.getSheetAt(0);
		int colCount = wsheet.getRow(0).getLastCellNum();
		int rowCount = wsheet.getLastRowNum();
		String[][] data = new String[rowCount][colCount];
		
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = wsheet.getRow(i);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				data[i-1][j]=value;
				System.out.println(data);
			}
			System.out.println();
			
		}
		wbook.close();
		return data;
	}



}
