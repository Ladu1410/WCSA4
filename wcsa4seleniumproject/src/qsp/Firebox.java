package qsp;

//import java.sql.Driver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firebox {
	public static void main(String[] args) {
	     System.setProperty("webdriver.gecko.driver ","./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.instagram.com/");
	}

}
