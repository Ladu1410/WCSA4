package methodOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     driver.get("https://www.google.com/");
	     WebElement sen = driver.findElement(By.xpath("//input[@class=\"gLFyf\"]"));
	     sen.sendKeys("fifa");
	     WebElement click = driver.findElement(By.xpath("//span[@class=\"ExCKkf z1asCe rzyADb\"]"));
	     click.click();
	     
	}

}
