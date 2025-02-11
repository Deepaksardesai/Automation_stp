package mavenid.mavenpractice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_handles  extends Base{

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
launch_browser("chrome");
takeascrennshot("Browser_lauch");
hiturl("https://www.naukri.com/");
takeascrennshot("naukari_homepage");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		takeascrennshot("scroll_at_bottom");
		
		
		driver.findElement(By.xpath("//a[@title=\"Careers\"]")).click();
		takeascrennshot("careers_sc");
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> id = windows.iterator();
		
		String parent_id = id.next();
		System.out.println("the parent id is "+ parent_id);
		
		String child_id = id.next();
		 
		System.out.println("the child id is"+child_id);
		
		driver.switchTo().window(child_id);
		System.out.println("shifted to child window");
		takeascrennshot("child_window");
		
		Thread.sleep(2000);

		
		driver.findElement(By.cssSelector("a#about-btn"));
		takeascrennshot("about_button");
		
		driver.switchTo().window(parent_id);
		System.out.println("back to parent window");
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_UP).build().perform();
		act.keyDown(Keys.PAGE_UP).build().perform();
		
		
		driver.quit();
}
}