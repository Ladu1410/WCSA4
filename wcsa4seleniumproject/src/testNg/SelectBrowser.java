package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectBrowser {
	WebDriver driver;

	
	@Test
	@Parameters("browserValue")
	public void demo(String browser,String url) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} 
		
		else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
		}
		
		else {
			Reporter.log("enter valid browservalue", true);
		}
	}
}
