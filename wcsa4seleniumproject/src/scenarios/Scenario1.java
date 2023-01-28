package scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		WebElement drop = driver.findElement(By.xpath("//p[.='Drag me to my target']"));
		WebElement drag = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(drop, drag).perform();
		
	}

}
