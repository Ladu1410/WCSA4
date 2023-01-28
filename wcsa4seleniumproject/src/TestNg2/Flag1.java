package TestNg2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
  @Test (description = "this test for sql")
  public void sql() {
	  
	  Reporter.log("this is Sql");
  }
  
  @Test (enabled = false)
  public void java()
  {
	  Reporter.log("this is java");
  }
}
