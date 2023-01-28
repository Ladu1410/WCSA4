package locator;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

import methodsOfWebDriver.Navigate;

public class NameLocator {
    public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.navigate().to("https://www.fifa.com");
		Thread.sleep(2000);
		 Navigation nav = driver.navigate();
		 nav.back();
		 Thread.sleep(2000);
		 nav.forward();
		 Thread.sleep(2000);
		 nav.refresh();
		 Thread.sleep(2000);
		 
		 Dimension dim = new Dimension(200,300);
		 driver.manage().window().setSize(dim);
		 Thread.sleep(2000);
		 
		  Point poi = new Point(20, 200);
		  driver.manage().window().setPosition(poi);
		  Thread.sleep(2000);
		  
		  driver.close();
	}
}
