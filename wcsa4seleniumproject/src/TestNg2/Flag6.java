package TestNg2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
  @Test (groups = "functional")
  public void ft1() {
	  Reporter.log("functional testing1",true);
  }
  
  @Test (groups = "integration")
  public void it1() {
	  Reporter.log("integration  testing1",true);
  }
  
  @Test (groups = "system")
  public void st1() {
	  Reporter.log("system testing1",true);
  }
  
 
  //-------------------------------------------------------------------------------------------------------------
  @Test (groups = "functional")
  public void ft2() {
	  Reporter.log("functional testing2",true);
  }
  
  @Test (groups = "integration")
  public void it2() {
	  Reporter.log("integration  testing2",true);
  }
  
  @Test (groups = "system")
  public void st2() {
	  Reporter.log("system testing2",true);
  }
  
  //----------------------------------------------------------------------------------------------------------------
  
  @Test (groups = "functional")
  public void ft3() {
	  Reporter.log("functional testing3",true);
  }
  
  @Test (groups = "integration")
  public void it3() {
	  Reporter.log("integration  testing3",true);
  }
  
  @Test (groups = "system")
  public void st3() {
	  Reporter.log("system testing3",true);
  }
  
  //----------------------------------------------------------------------------------------------------------------
  
  @Test (groups = "functional")
  public void ft4() {
	  Reporter.log("functional testing4",true);
  }
  
  @Test (groups = "integration")
  public void it4() {
	  Reporter.log("integration  testing4",true);
  }
  
  @Test (groups = "system")
  public void st4() {
	  Reporter.log("system testing4",true);
  }
  
  //----------------------------------------------------------------------------------------------------------------
  
  @Test (groups = "functional")
  public void ft5() {
	  Reporter.log("functional testing5",true);
  }
  
  @Test (groups = "integration")
  public void it5() {
	  Reporter.log("integration  testing5",true);
  }
  
  @Test (groups = "system")
  public void st5() {
	  Reporter.log("system testing5",true);
  }
  
  //----------------------------------------------------------------------------------------------------------------------
  
  @Test (groups = "functional")
  public void ft6() {
	  Reporter.log("functional testing6",true);
  }
  
  @Test (groups = "integration")
  public void it6() {
	  Reporter.log("integration  testing6",true);
  }
  
  @Test (groups = "system")
  public void st6() {
	  Reporter.log("system testing6",true);
  }
  

  

  


}
