package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream file = new FileInputStream("./data/test data.xlsx");
		
		Workbook fil = WorkbookFactory.create(file);
		Sheet fi = fil.getSheet("IPL");
		Row f = fi.getRow(1);
		Cell cell = f.getCell(0);
		String a = cell.getStringCellValue();
		System.out.println(a);
		
	}

}
