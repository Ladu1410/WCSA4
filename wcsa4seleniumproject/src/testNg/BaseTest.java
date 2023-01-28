package testNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseTest {
	static WebDriver driver;
  
@BeforeMethod
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get("http://ladu/login.do");
	  
  }
  
  @AfterMethod
  public void tearDown()
  {
	  driver.quit();
  }
}
