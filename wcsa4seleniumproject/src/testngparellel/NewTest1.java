package testngparellel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void demo() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get("www.google.com");
	  Thread.sleep(2000);
	  driver.close();
  }
}
