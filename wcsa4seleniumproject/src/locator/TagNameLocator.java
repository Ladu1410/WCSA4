package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		Thread.sleep(2000);
		driver.findElement(By.tagName("")).sendKeys(args);
		Thread.sleep(2000);
		driver.findElement(By.tagName(null)).sendKeys(args);
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
