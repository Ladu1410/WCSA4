package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4 {
	public static void main(String[] args) throws InterruptedException {
		
	//how to close child browser?
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	 
	 driver.get("http://omayo.blogspot.com/");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
	 
	   String parent = driver.getWindowHandle();
	   System.out.println(parent);
	   System.out.println("********************");
	   
	   Set<String> allHandle = driver.getWindowHandles();
	   Thread.sleep(2000);
	   
	   for (String a:allHandle) 
	   {
		   System.out.println(a);
		   
		   if (!parent.equals(a))
		   {
			   driver.switchTo().window(a).close();
			   
		   }
		   else
		   {
			   
		   }
		
	   }
	   
	 
	 
	}
}
