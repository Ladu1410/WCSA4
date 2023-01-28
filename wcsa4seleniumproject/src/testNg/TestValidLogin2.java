package testNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestValidLogin2 {
	
	static WebDriver driver;
  @Test
  @Parameters({"browser","url","usn","pass"})
  public void method1(String browserValue,String url,String username,String password) throws InterruptedException {
	  
	  
	  if(browserValue.equals("chrome"))
	  {
	  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get(url);
	  
	  driver.findElement(By.name("username")).sendKeys(username);
	  Thread.sleep(2000);
	  driver.findElement(By.name("pwd")).sendKeys(password);
	  Thread.sleep(2000);
	  driver.findElement(By.id("loginButton")).click();
	  }
	  
	  else if (browserValue.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get(url);
		  
		  driver.findElement(By.name("username")).sendKeys(username);
		  Thread.sleep(2000);
		  driver.findElement(By.name("pwd")).sendKeys(password);
		  Thread.sleep(2000);
		  driver.findElement(By.id("loginButton")).click();
	  }
	  
	  else
	  {
		  Reporter.log("use currect browser !!",true);
	  }
	  
	  
  }
}
