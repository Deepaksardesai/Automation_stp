package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Practice1 {

	public static void main(String[] args) throws IOException {
		String projectpath = System.getProperty("user.dir");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		
		driver.get("https://www.railyatri.in/");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target= new File("./Ryscreenshot/title_screenshot.png");
		FileHandler.copy(source, target);
		
		
		
		WebElement w = driver.findElement(By.xpath("//input[@class=\"form-control train_no_picker ui-autocomplete-input\"]"));
		
		w.click();
		w.sendKeys("mumbai");
		String projectpath1 = System.getProperty("user.dir");
		
		TakesScreenshot ts1 = (TakesScreenshot) driver;
	File source1 = ts1.getScreenshotAs(OutputType.FILE);
	File	target1= new File(projectpath1 +       "\\Ryscreenshot\\mumbai_screenshot.png");
	FileHandler.copy(source1, target1);
	
	
		driver.close();
	}

}
