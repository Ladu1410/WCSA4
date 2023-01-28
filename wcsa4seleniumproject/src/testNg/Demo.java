package testNg;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void demo() {
	 System.out.println("this is demo method");
	  Reporter.log("this is demo method");
  }
  
  @Test
  public void demo1()
  {
	  Reporter.log("this is demo1 method");
  }
  
  @Test
  public void demo2()
  {
	  Reporter.log("this is demo2 method");
  }
}
