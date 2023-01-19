package com.crm.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Driver;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.crm.qa.base.TestBase;
/*
public class TestUtil extends TestBase{

	public static long PAGE_LOAD_TIMEOUT=20;
	public static long IMPLICIT_WAIT=10;
	public static String TESTDATA_SHEET_PATH="C:\\Users\\OJPTS\\eclipse-workspace\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\testData\\Data.xlsx";
	
	static Workbook book;
	static Sheet sheet;
	public void switchToFrame() {
		driver.switchTo().frame("mainpanel");
	}

	public static Object[][] getTestData(String sheetName){
	
		
		FileInputStream file=null;
		try {
			file=new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
	    book=new WorkbookFactory.create(file);
		}
		catch(InvalidFormatException e) {
			e.printStackTrace();
		}
		
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	   sheet=book.getSheet(sheetName);
	  Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	  for(int i=0;i<sheet.get)
	
		return data;
		
		/*
		FileInputStream file=new FileInputStream("C:\\Users\\OJPTS\\eclipse-workspace\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\testData\\Data.xlsx");
		XSSFWorkbook Data=new XSSFWorkbook(file);
		XSSFSheet sheet=Data.getSheet("Sheet1");
		int rowcount=sheet.getLastRowNum();
		int colcount=sheet.getRow(0).getLastCellNum();
		for(int i=0;i<rowcount;i++)
		{
			XSSFRow currentrow=sheet.getRow(i);
			for(int j=0;j<colcount;j++)
			{
				String value=currentrow.getCell(j).toString();
				System.out.print("  " +value);
			
			}
		
		
	}
	
}
*/
