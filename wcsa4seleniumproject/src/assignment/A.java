package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ladu/tasks/otasklist.do");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("input[onclick=\"goToAddTasks()\"]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[class=\"item active\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[onclick=\"addProject(this.form)\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("select[name=\"customerId\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("web application");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
	}

}
