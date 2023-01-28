package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import methodsOfWebDriver.Get;

public class instagramLogInPage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		driver.findElement(By.id(null)).sendKeys(args);
		Thread.sleep(2000);
		driver.findElement(By.id(null)).sendKeys(args);
		Thread.sleep(2000);
		driver.findElement(By.id(null)).sendKeys(args);
		
		
		
	}

}
