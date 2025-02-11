package mavenid.mavenpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Dynamic_dropdown {

	

	

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		driver.get("https://www.railyatri.in/");
		// information about code
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		
		
	WebElement fromstation = driver.findElement(By.xpath("//input[@id='from_stn_input']"));
		
		fromstation.sendKeys("JAMMU");
	
  List<WebElement> form = driver.findElements(By.xpath("//ul[@id=\"ui-id-21\"]//child::li"));
   
   for(int x=0; x<=form.size(); x++) {
	   
	   if(form.get(x).getText().contains("JAMMU TAWI"));{
	   
		   form.get(x).click();
		   
   }
   
   }
   }
	}
