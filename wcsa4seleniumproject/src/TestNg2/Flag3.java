package TestNg2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flag3 {
	static WebDriver driver;
  @Test (invocationCount = 10)
  public void flag3() {
	  
	  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get("");
	  driver.close();
  }
}
