package packag01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.internal.annotations.ITest;

import mavenid.mavenpractice.Base;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;
import testlistner.Itest_bbb;
@Listeners(Itest_bbb.class)
public class Bewakoof extends Base {
  @Test
  public void Men_fashion () {
	  
	  
	  WebElement men = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
	  
	  action.moveToElement(men).build().perform();
	  
	  System.out.println("move to element");
	  
  }
  
  @Test
  public void women_fashion () {
	WebElement women = driver.findElement(By.xpath("//span[text()=\"Women's Fashion\"]"));
	  
	  action.moveToElement(women).build().perform();
	  System.out.println("move to women fashion");
	  
	  
	  
  }
 @Test  
 public void home_and_kithcen () {
	 
	WebElement home_kitchen = driver.findElement(By.xpath("//span[text()=\"Home & Kitchen\"]"));
	 
	action.moveToElement(home_kitchen).build().perform();
	System.out.println("move to home and kithen ");
 }

  @Test
  
  
  public void toy() {
	  
	WebElement toy = driver.findElement(By.xpath("//span[text()=\"Toys, Kids' Fashion & more\"]"));
	  action.moveToElement(toy).build().perform();
  }
  
  
  
  
  
  
}
