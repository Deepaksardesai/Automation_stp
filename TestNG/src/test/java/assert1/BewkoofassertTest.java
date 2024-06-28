package assert1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import mavenid.mavenpractice.Base;

public class BewkoofassertTest extends Base {
  @Test
  public void f() {
	  launch_browser("chrome");
	  hiturl("bewkoof");
	  
	  String expected_url = "https://www.bewakoof.com/";
	  String actual_url ="https://www.bewakoof.co";
	  
	  SoftAssert sa = new SoftAssert();
	  
	  sa.assertEquals(actual_url, expected_url);
	  System.out.println("the current url is actual ");
  }
}
