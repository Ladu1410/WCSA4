package methodOfWebelement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	   WebDriver	driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get("file:///D:/html/multipleDropdown.html");
	   WebElement sel = driver.findElement(By.id("menu"));
	   Select sel1 = new Select(sel);
	    List<WebElement> opt = sel1.getOptions();
	    for (int i = 0; i < opt.size(); i++) 
	    {
			WebElement opt1 = opt.get(i);
			String v = opt1.getText();
			System.out.println(v);
			Thread.sleep(2000);
		}
	}

}
