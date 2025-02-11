package mavenid.mavenpractice;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import com.mysql.cj.protocol.Resultset;

public class Dynamic_database {
	
public static Actions action;
	
	public static WebDriver driver;
	public static String projectpath= System.getProperty("user.dir");
	public static String portnumber ="3306";
	public static String host = "localhost";
	public static ResultSet result;
	public static void launch_browser (String browser) {
		
		
		
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
	
	public static void takescreenshot(String ss_name) throws IOException {
		
		TakesScreenshot  ts =(TakesScreenshot) driver;
		
	    File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./Database_screenshot"+ss_name+".png");
		
		FileHandler.copy(source, target);
	}
	
	
	
	public static void database_connection (String database, String query ) throws Throwable {
		
		Connection connect = DriverManager.getConnection("jdbc:mysql://"   +host+  ":"  + portnumber+ "/"+ database, "root",
				"Askpass%#55");
		
		Statement cs = connect.createStatement();
		
		result =cs.executeQuery(query);
	result.next();
	
	}
		
		public static void database_coulumn(  String column , String locator     ) throws Throwable {
			System.out.println(result.getString(column));
			
		 driver.findElement(By.xpath(locator)).sendKeys(result.getString(column));
			
			
			
		}
		
	}
	
	
	
	
	
	


