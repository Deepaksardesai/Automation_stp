package mavenid.mavenpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicdropdown2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.railyatri.in/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,200)");
		
		
	WebElement station = driver.findElement(By.xpath("//input[@id=\"from_stn_input\"]"));
		
		station.sendKeys("kolka");
		
		List<WebElement> from = driver.findElements(By.xpath("//ul[@id=\"ui-id-5\"]//child::li"));
		
	for(int a =0; a<=from.size(); a++) {
	try { if(from.get(a).getText().contains("KOLKATA CHITPUR"))
		
		{
			
			from.get(a).click();	}
		
	} catch (IndexOutOfBoundsException e) {
		
	}
	
	
			
			
		
	}
		
		
	}
}

