package qsp;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Dimension size = new Dimension(250,350);
		driver.manage().window().setSize(size);
		
		Thread.sleep(2200);
		
	   Point point1 = new Point(30, 250);
		driver.manage().window().setPosition(point1);
		driver.close();
	}
}