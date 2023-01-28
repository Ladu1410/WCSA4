package testngparellel;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG4 {
  @Test
  public void today() {
	  
	 long threadid = Thread.currentThread().getId();
	  Reporter.log("today method"+threadid+"is the thread",true);
  }
  
  @Test 
  public void tomorrrow() {
	  
	 long threadid = Thread.currentThread().getId();
	  Reporter.log("tomorrow method"+threadid+"is the thread",true);
  }
}
