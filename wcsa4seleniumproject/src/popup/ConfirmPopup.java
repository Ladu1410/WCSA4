package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("file:///D:/html/popup2.html");
	    
	    WebElement con = driver.findElement(By.xpath("//button[.='Click me! ']"));
	    con.click();
	    
	       Alert conform = driver.switchTo().alert();
	       // dismiss the popup
	      // conform.dismiss();
	       
	       // Accept the popup
	        //conform.accept();
	       
	       String c = conform.getText();
	       Thread.sleep(2000);
	       System.out.println(c);
	    
	  
	    
	}

}
