package calender;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import mavenid.mavenpractice.Base;

public class Practice1 {

    public static void main(String[] args) throws InterruptedException {
     
    WebDriver driver = new ChromeDriver();
    
    driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    	
    	driver.get("https://www.railyatri.in/");
   
    
    JavascriptExecutor js = (JavascriptExecutor) driver;
    
    js.executeScript("window.scrollBy(0,200)");
    
                WebElement calen = driver.findElement(By.xpath("//input[@class='span2 form-control date_in dtp_main tt_datepicker radiusLeft']"));
    Thread.sleep(2000);
                calen.click();
             int date = 25;   Thread.sleep(2000);
    while(true) {
               String month_year = driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]")).getText();
    System.out.println("the current month is printed :"+month_year);
   
    if(!(month_year.equalsIgnoreCase("April 2025"))) {
    		
    // next button click
    	
    	driver.findElement(By.xpath("(//th[@class=\"next\"] )[1]")).click();
    	}else {
    		
    		break;
    	}
    
    
    }
    
    
    
	}

}