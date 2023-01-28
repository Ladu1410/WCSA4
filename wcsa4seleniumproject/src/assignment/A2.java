package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ladu/administration/userlist.do");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value=\"Create New User\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys("test engineer1");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name=\"firstName\"]")).sendKeys("Dilip1");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name=\"lastName\"]")).sendKeys("sawant2");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name=\"passwordText\"]")).sendKeys("9890");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='passwordTextRetype']")).sendKeys("9890");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name=\"workdayDurationStr\"]")).sendKeys(" ");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		Thread.sleep(8000);
		driver.close();
}
}
