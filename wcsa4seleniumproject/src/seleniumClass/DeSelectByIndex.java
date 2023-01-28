package seleniumClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectByIndex {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///D:/html/multipleDropdown.html");
		WebElement deselect = driver.findElement(By.id("menu"));
		Select de = new Select(deselect);
		for (int i = 0; i <5; i++) 
		{
			de.selectByIndex(i);
			Thread.sleep(2000);
		}
            de.deselectByIndex(2);
		
	}

}
