package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotOfWebelement {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("http://ladu/login.do");
	    
	    WebElement web = driver.findElement(By.xpath("(//td[@valign=\"top\" ])[1]"));
	    
	    File scr = web.getScreenshotAs(OutputType.FILE);
	    File tk = new File("./screenshot/shot.png");
	    Files.copy(scr, tk);
	    
	}

}
