package sychronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeExplicitlyWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		    driver.get("http://ladu/login.do");
		
		  WebDriverWait weit = new WebDriverWait(driver,Duration.ofSeconds(30));
		  Boolean cheak = weit.until(ExpectedConditions.titleContains("login"));
		  System.out.println(cheak);
		  
		  driver.findElement(By.name("username")).sendKeys("admin");
		  driver.findElement(By.name("pwd")).sendKeys("manager");
		  
		  driver.findElement(By.id("loginButton")).click();
		  
		  Boolean cheak1 = weit.until(ExpectedConditions.titleContains("actiTIME-enter time-track"));
		  System.out.println(cheak1);
	}

}
