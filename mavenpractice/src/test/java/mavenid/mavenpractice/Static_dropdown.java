package mavenid.mavenpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Static_dropdown   {

	public static void main(String[] args) {

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

driver.get("https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1");

WebElement day = driver.findElement(By.cssSelector("select#reg_dtofbirth_day"));
day.click();
Select select = new Select( day);
select.selectByValue("3");


                 WebElement month = driver.findElement(By.cssSelector("select#reg_dtofbirth_month"));
month.click();
            Select select1 = new Select(month) ;    
              select1.selectByIndex(10) ;  
                 
                 
                 
	}

}
