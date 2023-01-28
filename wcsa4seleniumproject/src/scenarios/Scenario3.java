package scenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[@class=\"deny-btn\"]")).click();
		WebElement act = driver.findElement(By.xpath("(//a[@title=\"Rings\"])[1]"));
		Actions sel = new Actions(driver);
		sel.moveToElement(act).perform();
		driver.findElement(By.xpath("(//a[@title=\"Diamond Rings\"])[1]")).click();
		List<WebElement> act1 = driver.findElements(By.xpath("//span[@class=\"new-price\"]"));
		Thread.sleep(2000);
		for (int i = 0; i <act1.size(); i++) 
		{
			WebElement price = act1.get(i);
			String v = price.getText();
			Thread.sleep(2000);
			System.out.println(v);
			
		}
		
		WebElement s = driver.findElement(By.xpath("//span[.=' Popular ']"));
		Actions se = new Actions(driver);
		
		for (int i = 0; i < 3; i++)
		{
			se.moveToElement(s).perform();
		}
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[.='Price Low to High ']")).clear();
		
	}

}
