package practicejanuary25;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentreports1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	                String projectpath = System.getProperty("user.dir");
		ExtentSparkReporter esr = new ExtentSparkReporter(projectpath + "\\reports1\\ amazonreport");
		
		esr.config().setDocumentTitle("amazonhomepage");
		esr.config().setReportName("amazonreport");
		esr.config().setTheme(Theme.DARK);
		
		ExtentReports er = new ExtentReports();
		
		er.attachReporter(esr);
		er.setSystemInfo("browser", "chrome");
		er.setSystemInfo("os", "windows10");
		er.setSystemInfo("tester", "Deepak");
		ExtentTest et = er.createTest("search_amazon");
		et.log(Status.INFO, "searchfuntionality");
		et.log(Status.PASS, "pass the result");
		
		
	ExtentSparkReporter esr1 = new ExtentSparkReporter(projectpath + "\\reports1\\ amazonreport2");
		
	esr1.config().setDocumentTitle("amazonhomepage1");
		esr1.config().setReportName("amazonreport1");
		esr1.config().setTheme(Theme.DARK);
		
		ExtentReports er1 = new ExtentReports();
		
		er1.attachReporter(esr1);
		er1.setSystemInfo("browser", "chrome");
		er1.setSystemInfo("os", "windows10");
		er1.setSystemInfo("tester", "Deepak");
		ExtentTest et1 = er1.createTest("find_search");
		et1.log(Status.INFO, "searchfuntionality");
		et1.log(Status.PASS, "pass the result");
		
		
		
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//div[@id='nav-search']")).click();
		
		er.flush();
		
		er1.flush();
	}

}
