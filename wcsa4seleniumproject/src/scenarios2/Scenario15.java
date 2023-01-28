package scenarios2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario15 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("")).click();
		WebElement target = driver.findElement(By.xpath(""));
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
