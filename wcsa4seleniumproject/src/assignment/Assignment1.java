package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("htpps://www.flipkart.com");
	driver.findElement(By.name("")).sendKeys("9890758674");
	driver.findElement(By.name("")).sendKeys("518485654625");
	driver.findElement(By.id(null));
	}

}
