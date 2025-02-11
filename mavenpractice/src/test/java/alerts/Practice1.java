package alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		

		driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
		
		Alert simplealert = driver.switchTo().alert();
		
		System.out.println(simplealert.getText());
		
		Thread.sleep(3000);
		simplealert.accept();
		
		//confirmatioalert
		
		driver.findElement(By.xpath("//a[text()=\"Alert with OK & Cancel \"]")).click();
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		
  Alert confirmationalert = driver.switchTo().alert();
		
  System.out.println(confirmationalert.getText());
  Thread.sleep(3000);
  confirmationalert.accept();
  
  driver.findElement(By.xpath("//a[text()=\"Alert with Textbox \"]")).click();
  
  driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
 Alert promtalert = driver.switchTo().alert();
 System.out.println(promtalert.getText());
 Thread.sleep(4000);
 promtalert.sendKeys("bluewhale");
 promtalert.accept();
 
 Thread.sleep(3000);
 

  
	}

}
