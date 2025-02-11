package action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop  {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://jqueryui.com/droppable/");
		 Actions action = new Actions(driver);
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		driver.switchTo().frame(frame1);
		Thread.sleep(2000);
		WebElement source = driver.findElement(By.xpath("//div[@class=\"ui-widget-content ui-draggable ui-draggable-handle\"]"));
		
	WebElement target = driver.findElement(By.xpath("//div[@class=\"ui-widget-header ui-droppable\"]"));
	
	action.dragAndDrop(source, target).build().perform();
	
	
	}

}
