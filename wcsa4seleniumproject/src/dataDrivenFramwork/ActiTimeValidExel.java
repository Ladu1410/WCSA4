package dataDrivenFramwork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeValidExel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("http://ladu/login.do");
	    
	      flib fl = new flib();
	      int rc = fl.test("./data/ActiTime.xlsx","invalid");
	      
	      for(int s=0;s<=rc;s++)
	      {
	         String username = fl.demo("./data/ActiTime.xlsx","invalid" , s+1, 0);
	         
	         String password = fl.demo("./data/ActiTime.xlsx", "invalid", s, 1);
	         
	         
	         driver.findElement(By.name("username")).sendKeys(username);
	         driver.findElement(By.name("pwd")).sendKeys(password);
	         
	         Thread.sleep(2000);
	         driver.findElement(By.id("loginButton")).click();
	         
	         Thread.sleep(2000);
	         driver.findElement(By.name("username")).clear();
	          
	         System.out.print("username :" +username+"  ");
	         System.err.println("password :"+password+"   ");
	         
	         
	      }
	      
	      driver.quit();
	}

}
