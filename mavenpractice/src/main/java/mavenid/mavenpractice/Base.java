package mavenid.mavenpractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Base {
	
	public static Actions action;
	public static JavascriptExecutor js;
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
	
	
	driver.get(url);
	System.out.println(driver.getTitle());
	
}
public static void takeascrennshot(String screenshot_name) throws Throwable {
	
	TakesScreenshot ts= (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	
	 File target = new File("./screenshot/"+ screenshot_name+".png");
	FileHandler.copy(source, target);
	
}
public static void screenshot (String filename) throws Throwable {
	
TakesScreenshot ts1= (TakesScreenshot) driver;
	
	File source1 = ts1.getScreenshotAs(OutputType.FILE);
	
	File target = new File(projectpath+"\\jeevansathi_screenshot\\"+filename+".png");
	FileHandler.copy(source1, target);
	
	
}

	
	

	
}

		
		

	
	
	
	
	
	
	
	
	
	
	

