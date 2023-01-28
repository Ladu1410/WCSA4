package methodsOfWebDriver;

import org.openqa.selenium.Keys;
import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
public class CloseMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    Thread.sleep(4000);
        driver.navigate().to("http://www.google.co.in/");
        Thread.sleep(4000);
        driver.switchTo().activeElement().sendKeys("fifa ");
        
        driver.navigate().back();
         Thread.sleep(4000);
         driver.navigate().forward();
         Thread.sleep(4000);
         driver.navigate().refresh();
         driver.close();
	   
         
	}

}
