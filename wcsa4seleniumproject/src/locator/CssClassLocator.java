package locator;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssClassLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ladu/login.jsp");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		Thread.sleep(2000);
		
        Thread.sleep(2000);
        driver.close();
	}

}
