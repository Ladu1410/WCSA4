package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.puma.com/in/en?gclid=Cj0KCQiA1sucBhDgARIsAFoytUvf7jebuVc1Fcu6xuDrZv-snQrhRadUkaWFFeUkpJWfgtSK4c6FYIAaAgotEALw_wcB&utm_aud=OTH&utm_campaign=BS_GGL_SEA_TXT_OTH_Brand_New&utm_medium=BS&utm_obj=OLC&utm_source=GGL");
		
		
	}

}
