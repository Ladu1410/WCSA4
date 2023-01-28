package methodsOfWebDriver;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.fifa worldcup.com");
         driver.findElement(By.xpath("//a[.='open a poppup window")).click();
         Thread.sleep(2000);
         driver.quit();
	}   
}
