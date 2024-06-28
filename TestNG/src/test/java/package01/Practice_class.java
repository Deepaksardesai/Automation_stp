package package01;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice_class {
	
	@BeforeMethod
	public void g () {
		
		System.out.println("before method ");
	}
	
	
	@BeforeClass
	public void a () {
		
		System.out.println("before class ");
	}
	
	
  @Test
  
  
  public void f() {
	  System.out.println("this is the test 1");
	  

	  
  }
  @BeforeSuite
  public void b() {
	  System.out.println("before suite method ");
	  
  
  } @BeforeTest
  public void n()
  {
	  System.out.println("before test");
	  
  }
}
