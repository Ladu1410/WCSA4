package pageObjectModel;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import keyWordDrivenFramwork.flib;

public class BaseTest implements IAutoConstant{
	
	static WebDriver driver;
	public void openbrowser() throws IOException
	{
		
	   flib fs = new flib();
	   
	   String browservalue = fs.readPropertyData(PROP_PATH,"Broser");
	   String url = fs.readPropertyData(PROP_PATH, "url");
	   
	   if(browservalue.equals("chrome"))
	   {
		  System.setProperty(CHROME_KEY, CHROME_VALUE) ;
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.get(url);
	   }
	   
	   else if (browservalue.equals("firefox"))
	   {
		   System.setProperty(GECKO_KEY, GECKO_VALUE) ;
			  driver=new FirefoxDriver();
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			  driver.get(url);
	   }
	   
	   else
	   {
		   System.out.println("enter the valid browserValue!!!");
	   }
	}
	public void closebrowser()
	{
		driver.quit();
	}

}
