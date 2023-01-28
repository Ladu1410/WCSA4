package methodsOfWebDriver;

//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oppo.com");
	    String currenturl = driver.getCurrentUrl();
	    Thread.sleep(2000);
	    System.out.println(currenturl);
	    Thread.sleep(2000);
	    driver.close();
		
	}

}
