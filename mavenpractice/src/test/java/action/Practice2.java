package action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice2 {

	public static void main(String[] args) {
		
		
		WebDriver driver = new  ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.get("https://www.jeevansathi.com/");
		
		Actions action = new Actions(driver);
		
		WebElement email = driver.findElement(By.cssSelector("input#email"));
		
	action.moveToElement(email).click().sendKeys("wethepeople").build().perform();
	
	action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	
	action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	
	action.keyDown(Keys.TAB).build().perform();
	action.keyDown(Keys.TAB).build().perform();
	action.keyDown(Keys.TAB).build().perform();
	
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
	}

}
