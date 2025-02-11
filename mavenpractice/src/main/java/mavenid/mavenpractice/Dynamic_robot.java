package mavenid.mavenpractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Dynamic_robot {

	
public static Actions action;
	
	public static WebDriver driver;
	public static String projectpath= System.getProperty("user.dir");
	
	
	public static void launch_browser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			
			
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			
		}else if(browser.equalsIgnoreCase("edge")){
			driver= new EdgeDriver();
			
			
			
		}
				
			System.out.println("the browser launched is:"+browser);
				
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	}

public static void hiturl(String url) {
	
	
	driver.get("https://www.ilovepdf.com/word_to_pdf");
	System.out.println(driver.getTitle());
	
		
	
}

public static void upload_file(String locators,String path) throws Throwable {
	
	driver.findElement(By.xpath(locators)).click();
	StringSelection ss= new StringSelection(path);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	Robot r = new Robot();
	r.delay(3000);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);


	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);

	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);

}


}