package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp {
	static WebDriver driver;

	public static void main(String[] args) throws  InterruptedException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("which browser u want to open");
		String browserValue = sc.next();
		
		if (browserValue.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");// do avaid
																						// IllegalstateException
			driver = new ChromeDriver();// to launch chrome browser
			Options manage = driver.manage();
			Window window = manage.window();
			window.maximize();// maximize the window
			driver.get("https://www.instagram.com");// to launch web application.
			
				Thread.sleep(4000);// to provide delay 4 second
			
			
			driver.close();// to close parent window
		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver =new FirefoxDriver(); // to launch firefox broser
			driver.manage().window().maximize(); // to maximize browser
			driver.get("https://www.instagram.com");
			Thread.sleep(4000);
			driver.close();
		}
		else
		{
			System.out.println("enter the valid browser name");
		}
	}

}
