package keyWordDrivenFramwork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class flib {
	//is use to store generic reusable method....
	
	// read excel data 
	public void readExcelData(String excelData,String sheetname,int rowcount,int cellcount,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelData);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		Row row = sheet.getRow(rowcount);
		Cell cell = row.getCell(cellcount);
		
		cell.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(excelData);
		wb.write(fos);
		   
	} 
	// read the data from property file
	
	public String readPropertyData(String proppath,String keyvalue) throws IOException
	{
		FileInputStream fis = new FileInputStream(proppath);
		Properties prop = new Properties();
		prop.load(fis);
		String data = prop.getProperty(keyvalue);
		return data;
		
	}

}
