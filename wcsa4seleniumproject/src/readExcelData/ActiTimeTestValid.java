package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeTestValid {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.get("http://ladu/login.do"); //ActiTime url
		  
		  Thread.sleep(2000);
		  FileInputStream fis = new FileInputStream("./data/ActiTime.xlsx");
		   Workbook ws = WorkbookFactory.create(fis);
		   Sheet sheet = ws.getSheet("valid");
		   Row row = sheet.getRow(1);
		   Cell a = row.getCell(0);
		   String username = a.getStringCellValue();
		   
		   FileInputStream fis1 = new FileInputStream("./data/ActiTime.xlsx");
		   Workbook ws1 = WorkbookFactory.create(fis1);
		   Sheet sheet1 = ws1.getSheet("valid");
		   Row row1 = sheet1.getRow(1);
		   Cell a1 = row1.getCell(1);
		   String password = a1.getStringCellValue();
		   
		   driver.findElement(By.name("username")).sendKeys(username);
		   Thread.sleep(2000);
		   driver.findElement(By.name("pwd")).sendKeys(password);
		   driver.findElement(By.id("loginButton")).click();
	}

}
