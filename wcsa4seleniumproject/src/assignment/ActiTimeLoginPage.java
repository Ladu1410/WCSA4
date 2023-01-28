package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLoginPage {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(null);
	Thread.sleep(3000);
	driver.findElement(By.xpath("")).sendKeys("Admin");
	Thread.sleep(3000);
	driver.findElement(By.xpath("")).sendKeys("admin123");
	Thread.sleep(3000);
	driver.findElement(By.xpath("")).click();
	driver.quit();
	

	}

}
