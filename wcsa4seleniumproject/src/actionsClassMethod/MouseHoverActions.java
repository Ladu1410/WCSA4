package actionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.bluestone.com/");
	Thread.sleep(2000);
	driver.findElement(By.id("denyBtn")).click();
	
	WebElement mouse = driver.findElement(By.xpath("//a[@title=\"Watch Jewellery\"]"));
	Actions hover = new Actions(driver);
	hover.moveToElement(mouse).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@title=\"Band\"]")).click();
	Thread.sleep(3000);
	
}
}
