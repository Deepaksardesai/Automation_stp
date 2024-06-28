package packag01;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.internal.annotations.ITest;

import mavenid.mavenpractice.Base;
import testlistner.Itest_bbb;
@Listeners(Itest_bbb.class)
public class For_listener extends Base {
	
	
@BeforeSuite
	public void men   () {
	
	
}
  @Test
  public void f() {
	  
	  
	 
  }
}
