package action;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loopdropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

driver.get("https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1\"");

driver.findElement(By.xpath("//a[@class=\"chzn-single chzn-default\"]")).click();


List<WebElement> cast = driver.findElements(By.xpath("//ul[@class='chzn-results']//child::li"));


System.out.println(cast.size());	
		
for(int a =0; a<=cast.size(); a++) {
	
	if(cast.get(a).getText().equalsIgnoreCase("Lingayat")){
		
		cast.get(a).click();
	}
}



	}

}
