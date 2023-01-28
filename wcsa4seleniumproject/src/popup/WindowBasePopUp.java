package popup;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowBasePopUp {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://ladu/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@class,\"content administration\")]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
	    Thread.sleep(3000);
		driver.findElement(By.xpath("(//td[@class=\"aligned_radio_button_cell\"])[2]")).click();
		Thread.sleep(2000);
		WebElement click = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		Thread.sleep(3000);
		Actions dclick = new Actions(driver);
		dclick.doubleClick(click).perform();
		Thread.sleep(3000);
		
		 Runtime.getRuntime().exec("./Autoit/s1.exe");
		 Thread.sleep(4000);
		 Runtime.getRuntime().exec("Autoit/s1.exe");
		 
		 Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name=\"formCustomReportLogo.logoOption\"])[3]")).click();
		Thread.sleep(2000);
		WebElement cl = driver.findElement(By.xpath("//input[@name=\"formCustomReportLogo.logo\"]"));
		Thread.sleep(2000);
		dclick.doubleClick(cl).perform();
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("Autoit/s2.exe");
		Thread.sleep(4000);
		Runtime.getRuntime().exec("Autoit/s2.exe");
	     
		 
	
	}

}
