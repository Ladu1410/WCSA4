package methodsOfWebDriver;

import java.awt.Point;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.facebook.com");
		driver.manage().window().maximize();
	    Dimension dim = new Dimension(230, 320);
		driver.manage().window().setSize(dim);
		Thread.sleep(2000);
	    org.openqa.selenium.Point po = new org.openqa.selenium.Point(250, 230);
		driver.manage().window().setPosition(po);
		 Thread.sleep(2000);
		driver.close();
		
		
	}

}
