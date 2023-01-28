package methodOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");		
		WebElement username = driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]"));
        username.sendKeys("dilip");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy _9npi\"]"));
		password.sendKeys("123456");
		username.clear();
		Thread.sleep(2000);
		password.clear();
		driver.close();
	}

}
