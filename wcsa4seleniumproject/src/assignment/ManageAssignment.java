package assignment;

import java.awt.Point;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

import methodsOfWebDriver.Navigate;

public class ManageAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(2000);

		Navigation nev = driver.navigate();
		nev.back();
		Thread.sleep(2000);

		nev.forward();
		Thread.sleep(2000);

		nev.refresh();
		Thread.sleep(2000);

		Dimension sho = new Dimension(250, 350);
		driver.manage().window().setSize(sho);

		org.openqa.selenium.Point poi = new org.openqa.selenium.Point(25, 250);
		driver.manage().window().setPosition(poi);

		driver.close();

	}

}
