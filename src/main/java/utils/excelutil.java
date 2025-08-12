package utils;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelutil {
	
	
	public static String getExceldata(String filepath, String sheetname,int row, int column) throws Exception
	{
		
		FileInputStream fis= new FileInputStream(filepath);
		Workbook wb= new XSSFWorkbook(fis);
		Sheet sheet=wb.getSheet(sheetname);
		
		String cellvalue=sheet.getRow(row).getCell(column).toString();
		
		wb.close();
		
	
		return cellvalue;
	}

}
