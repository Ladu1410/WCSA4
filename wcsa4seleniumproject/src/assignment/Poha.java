package assignment;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Poha {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("poha");
		Thread.sleep(3000);
         List<WebElement> seg = driver.findElements(By.xpath("//div[@class=\"pcTkSc\"]"));
         Thread.sleep(3000);
         
         for (int i = 0; i <seg.size(); i++) {
        	 WebElement seg1 = seg.get(i);
        	 String opt = seg1.getText();
        	 Thread.sleep(3000);
        	 System.out.println(opt);
			
		}
		}
	}


