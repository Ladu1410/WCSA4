package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestone {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id=\"denyBtn\"]")).click();
		Thread.sleep(4000);
		
		driver.switchTo().frame("fc_widget");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"chat-icon\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"chat-fc-name\"]")).sendKeys("admin");
	}

}
