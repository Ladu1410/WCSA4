package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScorllLeft {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(2000,0);");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(-2000,0);");
		
	}

}
