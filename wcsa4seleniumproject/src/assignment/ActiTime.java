package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         driver.get("http://ladu/login.do");
         driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("admin");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("manager");
         driver.findElement(By.id("loginButton")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("(//a[@style=\"border-width: 0\"])[1]")).click();
          driver.findElement(By.xpath("//a[.='Projects & Customers']")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("//input[@onclick=\"addCustomer(this.form)\"]")).click();
          driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("SBI1");
          Thread.sleep(2000);
          driver.findElement(By.xpath("//input[@name=\"createCustomerSubmit\"]")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("//input[@onclick=\"addProject(this.form)\"]")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("//select[@name=\"customerId\"]")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("//option[.='SBI1']")).click();
          driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys("Web Aplication");
          Thread.sleep(2000);
          driver.findElement(By.xpath("//input[@name=\"createProjectSubmit\"]")).click();
          Thread.sleep(2000);
         driver.findElement(By.xpath("//a[@class=\"content users\"]")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@value=\"Create New User\"]")).click();
         driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("manager");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@name=\"passwordText\"]")).sendKeys("5013");
         driver.findElement(By.xpath("//input[@name=\"passwordTextRetype\"]")).sendKeys("5013");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("dilip");
         driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("sawant");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@name=\"overtimeTracking\"]")).click();
         driver.findElement(By.xpath("//input[@name=\"rightGranted[12]\"]")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@name=\"rightGranted[2]\"]")).click();
         driver.findElement(By.xpath("//input[@name=\"rightGranted[1]\"]")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@name=\"rightGranted[5]\"]")).click();
         driver.findElement(By.xpath("//input[@name=\"rightGranted[7]\"]")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@name=\"rightGranted[10]\"]")).click();
         driver.findElement(By.xpath("//input[@name=\"rightGranted[11]\"]")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//a[@class=\"logout\"]")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("manager");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("5013");
         driver.findElement(By.id("loginButton")).click();
         
         driver.findElement(By.xpath("//a[@class=\"content users\"]")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@value=\"Create New User\"]")).click();
         driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("test engg");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@name=\"passwordText\"]")).sendKeys("5012");
         driver.findElement(By.xpath("//input[@name=\"passwordTextRetype\"]")).sendKeys("5012");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("vishal");
         driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("sawant");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@name=\"overtimeTracking\"]")).click();
         driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
         
	}

}
