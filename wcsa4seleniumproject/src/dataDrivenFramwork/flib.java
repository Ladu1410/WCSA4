package dataDrivenFramwork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class flib {
	public String demo(String a,String b,int c,int d) throws IOException
	{
		FileInputStream fis = new FileInputStream(a);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(b);
		Row row = sheet.getRow(c);
		Cell cell = row.getCell(d);
		String data = cell.getStringCellValue();
		return data;
		
	}
	
	//go to last Rowcount
	public int test(String n,String m) throws EncryptedDocumentException, IOException
	{
		FileInputStream fil = new FileInputStream(n);
		Workbook at = WorkbookFactory.create(fil);
		Sheet shee = at.getSheet(m);
		int rc = shee.getLastRowNum();
		return rc;
		
	}
		
	}


