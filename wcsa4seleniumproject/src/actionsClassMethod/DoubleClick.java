package actionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.xpath("(//td[@class=\"aligned_radio_button_cell\"])[2]")).click();
		Thread.sleep(2000);
		WebElement click = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		
		Actions dclick = new Actions(driver);
		dclick.doubleClick(click).perform();
		Thread.sleep(3000);
		driver.close();
		
	}

}
