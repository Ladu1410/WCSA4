package scenarios;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario2 {
	public static void main(String[] args) throws AWTException, InterruptedException  {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ebay.com/");
		driver.findElement(By.id("gh-ac")).sendKeys("apple watch");
		driver.findElement(By.xpath("//select[@aria-label=\"Select a category for search\"]")).click();
		WebElement act = driver.findElement(By.xpath("//select[@aria-label=\"Select a category for search\"]"));
		 Robot sel = new Robot();
		 for(int a=0;a<2;a++)
			{
				sel.keyPress(KeyEvent.VK_DOWN);
				Thread.sleep(2000);
				sel.keyRelease(KeyEvent.VK_DOWN);
				
			}
			
			sel.keyPress(KeyEvent.VK_ENTER);
			sel.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//input[@class=\"btn btn-prim gh-spr\"]")).click();
		
	}

}
