package scenarios;

import java.time.Duration;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario4 
{
  public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("");
	driver.findElement(By.xpath("")).sendKeys("");
		
	
}
}
