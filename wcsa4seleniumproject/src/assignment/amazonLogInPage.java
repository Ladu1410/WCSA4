package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonLogInPage {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(null);
			Thread.sleep(2000);
			driver.findElement(By.id(null)).sendKeys(args);
			Thread.sleep(2000);
			driver.findElement(By.id(null)).sendKeys(args);
	}

}
