package scenarios2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario11 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class=\"deny-btn\"]")).click();
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//span[@data-p=\"offers,m\"]"));
		Actions act1 = new Actions(driver);
		for(int a=0;a<2;a++)
		{
		act1.moveToElement(target).perform();
		}
		/*/WebElement target1 = driver.findElement(By.xpath("class=\"page-front new-hp-ui with-white-header no-footer-top    p-auto-play   no-ticker\""));
		Actions act = new Actions(driver);
		act.moveToElement(target1).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		driver.close();/*/
		
	}

}
