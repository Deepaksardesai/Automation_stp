package assert1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import mavenid.mavenpractice.Base;

public class Bewkoofassert extends Base {
  @Test
  public void f() {
	  
	  launch_browser("chrome");
	  hiturl("bewkoof");
	  String expected = "https://www.bewakoof.com/";
	  String actual = "https://www.bewakoof";
	  
	  
	  assertEquals(actual, expected);
  }
}
