package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotByUsingTypeCasting {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("http://ladu/login.do");
	    
	    TakesScreenshot ts = (TakesScreenshot)driver;
	    
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    
	    File dest = new File("./screenshot/Screenshot2.png");
	    Files.copy(src,dest);
	}
	

}
