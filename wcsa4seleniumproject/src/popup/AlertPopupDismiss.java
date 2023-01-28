package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupDismiss {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("file:///D:/html/popup.html");
	    
	    WebElement button = driver.findElement(By.xpath("//button[.='Click me!']"));
	    button.click();
	    
	    // now switch ur control to pop up
	    
	      Alert al = driver.switchTo().alert();
	       Thread.sleep(4000);
	     //dismiss the Alert pop up
	      
	       al.dismiss();
	       

	} }
