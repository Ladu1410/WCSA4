package qsp;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Dimension size = new Dimension(250, 350);
		driver.manage().window().setSize(size);
		Thread.sleep(2000);

		Point point = new Point(25, 250);
		driver.manage().window().setPosition(point);
		driver.close();

	}

}
