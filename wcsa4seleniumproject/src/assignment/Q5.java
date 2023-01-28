package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5 {
	public static void main(String[] args) {
		//how
		
		System.setProperty("webdriver.chrome.driver","./driver.chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 driver.get("http://omayo.blogspot.com/");
		 driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		  String parentTitle = driver.getTitle();
		  
		  Set<String> Allh = driver.getWindowHandles();
		  
		  for(String a:Allh)
		  {
			 String currentTitle = driver.switchTo().window(a).getTitle();
			 
			 System.out.println(currentTitle);
			 
			 if(!parentTitle.equals(currentTitle))
			 {
				 driver.manage().window().maximize();
			 }
			 else
			 {
				 driver.quit();
			 }
		  }
	}

}
