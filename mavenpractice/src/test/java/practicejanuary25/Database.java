package practicejanuary25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Database {
	

	
	
	
	

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		String host= "localhost";
	    String portnumber="3306";
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://in.linkedin.com/");
		driver.findElement(By.cssSelector("a[class='nav__button-secondary btn-secondary-emphasis btn-md']")).click();
		
		 Connection connect = DriverManager.getConnection("jdbc:Mysql://" + host+ ":"+ portnumber+ "/june24", "root", "Askpass%#55");

		  Statement cs = connect.createStatement();
		   
		   ResultSet result = cs.executeQuery("select email, password from Linkedin  where sr_no=2;");
		   result.next();
		  System.out.println(result.getString("email"));
		  System.out.println(result.getString("password"));
		  
		  driver.findElement(By.cssSelector("input[id='username']")).sendKeys(result.getString("email"));
		  
		  driver.findElement(By.cssSelector("input[id='password']")).sendKeys(result.getString("password"));
	
	}

}
