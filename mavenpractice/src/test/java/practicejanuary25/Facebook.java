package practicejanuary25;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.get("https://www.facebook.com/");
		
  WebElement username = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		
		username.click();
		
            username.sendKeys("sardeepu@gmail.com");
		
		
     WebElement password = driver.findElement(By.cssSelector("input[class='inputtext _55r1 _6luy _9npi']"));
        
     password.click();
     password.sendKeys("12@Raghav");
     
	}

}
