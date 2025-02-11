package practicejanuary25;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionmouse {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://jqueryui.com/droppable");
		
		 WebElement fra = driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
		driver.switchTo().frame(fra);
		WebElement drag = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
		
		WebElement drop = driver.findElement(By.cssSelector("div[class='ui-widget-header ui-droppable']"));
		
		Actions act = new Actions(driver);
		Thread.sleep(4000);
		
		act.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();
	}

}
