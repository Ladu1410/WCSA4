package actionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
	    
		WebElement select = driver.findElement(By.xpath("//a[@class=\"button button-orange\"  and (.=' BANK ')]"));
		Thread.sleep(2000);
		WebElement paste = driver.findElement(By.xpath("//ol[@class=\"field14 ui-droppable ui-sortable\"]"));
		Actions act = new Actions(driver);
		act.dragAndDrop(select, paste).perform();
		
		Thread.sleep(2000);
		WebElement sel = driver.findElement(By.xpath("//a[@class=\"button button-orange\"  and (.=' 5000')]"));
		Thread.sleep(2000);
		WebElement pas = driver.findElement(By.xpath("(//li[@class=\"placeholder\" ])[1]"));
		Actions act1 = new Actions(driver);
		act.dragAndDrop(sel, pas).perform();
	}

}
