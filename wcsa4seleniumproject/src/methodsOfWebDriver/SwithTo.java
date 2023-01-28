package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwithTo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("fifa" );
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='fifa world cup']")).click();
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		driver.close();
	}

}
