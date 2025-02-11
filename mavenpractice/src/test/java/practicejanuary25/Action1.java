package practicejanuary25;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Action1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	
	driver.get("https://www.amazon.in");
	
	WebElement enter = driver.findElement(By.xpath("//input[@placeholder='Type characters']"));
	
		
		enter.click();
		enter.sendKeys("nnnnndndnd");
		
		Actions act = new Actions(driver);
	
		WebElement sea = driver.findElement(By.xpath("//div[@class='a-column a-span6 a-span-last a-text-right']"));
act.moveToElement(sea).doubleClick().build().perform();
	}

}
