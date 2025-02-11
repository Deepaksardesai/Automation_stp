package action;




import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import mavenid.mavenpractice.Base;

public class Practice1  {

	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		  Actions act =   new Actions(driver);

		  
		WebElement miniTV = driver.findElement(By.xpath("//a[text()=\"Amazon miniTV\"]"));
		  
		  act.moveToElement(miniTV).perform();
		 WebElement sell = driver.findElement(By.xpath("//a[text()=\"Sell\"]"));
		 act.moveToElement(sell).contextClick().build().perform();
		 
		 
	}

}
