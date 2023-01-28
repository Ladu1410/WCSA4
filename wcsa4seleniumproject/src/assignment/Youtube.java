package assignment;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
    public static void main(String[] args) throws InterruptedException {
	
    	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		List<WebElement> video = driver.findElements(By.xpath("//h3[@class=\"style-scope ytd-rich-grid-slim-media\"]"));
        List<WebElement> view = driver.findElements(By.xpath("//span[@class=\"inline-metadata-item style-scope ytd-video-meta-block\"]"));
        for (int i = 0; i < view.size(); i++) 
        {
        	for (int j = 1; j <=1; j++) 
        	{
				WebElement video1 = video.get(j);
				String video2 = video1.getText();
				Thread.sleep(2000);
				System.out.println("video name :" +video2);
			}
			WebElement view1 = view.get(i);
			String view2 = view1.getText();
			Thread.sleep(2000);
			System.out.println("video views : " +view2);
		}
    
    }
    
    
}
