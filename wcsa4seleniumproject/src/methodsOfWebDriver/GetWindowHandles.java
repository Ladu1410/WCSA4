package methodsOfWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		 
		 driver.get("http://omayo.blogspot.com/");
		 driver.findElement(By.xpath(""));
		 
		 String parenHandle = driver.getWindowHandle();
		 System.out.println(parenHandle);
		 System.out.println("****************************");
		 
		 Set<String> allHandle = driver.getWindowHandles();
		 System.out.println(allHandle);
		 
		 for (String a:allHandle)
		{
			System.out.println(a);
		
		}
		  

}
}