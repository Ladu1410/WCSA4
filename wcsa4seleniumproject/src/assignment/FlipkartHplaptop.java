package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartHplaptop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class=\"_3704LK\"]")).sendKeys("hp laptop");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"_3879cV\"  and (.='Core i5')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"_2gmUFU _3V8rao\"   and   (.='Brand')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"_3879cV\"  and   (.='HP')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Operating System' ]/ancestor::div[@class=\"_213eRC _2ssEMF\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@class=\"_2iDkf8 t0pPfW\"]/descendant::div[.='Windows 10']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"_3879cV\" and (contains(text(),'4★ & above'))]")).click();
		
		
	}

}
