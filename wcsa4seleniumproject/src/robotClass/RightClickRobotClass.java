package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickRobotClass {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///D:/html/multipleDropdown.html");
		WebElement text = driver.findElement(By.id("menu"));
		Actions context = new Actions(driver);
		context.contextClick(text).perform();
		
		Robot act = new Robot();
		for(int a=0;a<9;a++)
		{
			act.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			act.keyRelease(KeyEvent.VK_DOWN);
			
		}
		
		act.keyPress(KeyEvent.VK_ENTER);
		act.keyRelease(KeyEvent.VK_ENTER);
	}

}
