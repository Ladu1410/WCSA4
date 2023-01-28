package TestNg2;

import org.junit.AfterClass;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NoAnnotation {
  @Test
  public void test1() {
	  Reporter.log("test 1");
  }
  @BeforeClass
  public void beforeclass()
  {
	  Reporter.log("Before the class");
  }
  @BeforeTest
  public void beforetest()
  {
	  Reporter.log("Before the test");
  }
  
  @AfterClass
  public void afterclass()
  {
	  Reporter.log("Acter the class");
  }
  
  @AfterTest
  public void aftertest()
  {
	  Reporter.log("After the test");
  }
  
  @AfterMethod
  public void aftermethod()
  {
	  Reporter.log("After the method");
  }
  
  @BeforeMethod
  public void beforemethod()
  {
	  Reporter.log("Before the method");
  }
  
  @Test
  public void test2()
  {
	  Reporter.log("test2");
  }
  
  @BeforeSuite
  public void beforesuite()
  {
	  Reporter.log("Before the suite");
  }
  
  @AfterSuite
  public void aftersuite()
  {
	  Reporter.log("After the suite");
  }
}
