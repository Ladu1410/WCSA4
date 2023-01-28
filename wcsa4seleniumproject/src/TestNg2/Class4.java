package TestNg2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class4 {
	static WebDriver driver;
	  @Test (description = "this test case for Automation")
	  public void Automation() 
	  {
		  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get("https://www.google.com");
		  driver.switchTo().activeElement().sendKeys("Automation");
  }
}
