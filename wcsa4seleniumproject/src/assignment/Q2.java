package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {
	public static void main(String[] args) throws InterruptedException {
		//how to close parent & child browser without using quit(); method
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		 
		 driver.get("http://omayo.blogspot.com/");
		 driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		 
		 
		 Set<String> allHandle = driver.getWindowHandles();
		 System.out.println(allHandle);
		 Thread.sleep(2000);
		 for (String a:allHandle)
		{
			driver.switchTo().window(a).close();
		
		}
		  
	}
}
