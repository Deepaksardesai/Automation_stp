package database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import mavenid.mavenpractice.Base;

public class Linkedin  {

	public static void main(String[] args) throws Throwable {
		String host = "localhost";
		String portnumber="3306";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	driver.get("https://in.linkedin.com/");
	driver.findElement(By.xpath("//a[@class=\"nav__button-secondary btn-md btn-secondary-emphasis\"]")).click();
	
	
	Connection connect = DriverManager.getConnection("jdbc:mysql://"+ host+  " : " +portnumber+  "/june24",  "root","Askpass%#55" 
			);
	
    Statement cs = connect.createStatement();
	ResultSet result = cs.executeQuery("select email,password from linkedin where sr_no=3");
result.next();
System.out.println(result.getString("email"));
System.out.println(result.getString("password"));
	
	driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys(result.getString("email"));
	driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(result.getString("password"));
	}

}
