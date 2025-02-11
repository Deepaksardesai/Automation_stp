package practicejanuary25;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Executor {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://www.railyatri.in/");
		WebElement search = driver.findElement(By.xpath("//input[@id='search_status']"));
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File ("./screenshot/january25.png");
		FileHandler.copy(source, target);
		search.click();
		search.sendKeys("1206");
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		
		File source1 = ts1.getScreenshotAs(OutputType.FILE);
		File target1 = new File("./screenshot/aftersearch.png");
		FileHandler.copy(source1, target1);
		
		//using executor
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		
		TakesScreenshot ts2 = (TakesScreenshot) driver;
		File source2 = ts2.getScreenshotAs(OutputType.FILE);
		File target2 = new File("./screenshot.afterscroll.png");
		FileHandler.copy(source2, target2);
	

		
	}

}
