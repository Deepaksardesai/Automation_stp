package extentreport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import mavenid.mavenpractice.Base;

public class Practice1 extends Base {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
	String 	projectpath= System.getProperty("user.dir");
		
		
ExtentSparkReporter es = new ExtentSparkReporter(projectpath +"\\  reports1\\see");
es.config().setDocumentTitle("doc");
es.config().setReportName("myreport");
es.config().setTheme(Theme.STANDARD);

ExtentReports et = new ExtentReports();
et.attachReporter(es);


et.setSystemInfo("browser", "chrome");
et.setSystemInfo("os", "windows");
et.setSystemInfo("tester", "deepak");
et.setSystemInfo("ecom ", "ebay");

    ExtentTest ct = et.createTest("ebay_search");

    ct.log(Status.INFO, "search ebay");
    
    ExtentTest ct1 = et.createTest("toys");
    ct1.log(Status.INFO,"locatsearch");
     ExtentTest ct2 = et.createTest("locate_ebay");
     ct2.log(Status.INFO,"locate_element");
   ExtentTest ct3 = et.createTest("entering_toys");
    ct3.log(Status.PASS, "pass the search functionality of ebay ");
    
    launch_browser("chrome");
    hiturl("ebay");
 WebElement search = driver.findElement(By.xpath("//input[@class=\"gh-tb ui-autocomplete-input\"]"));
    search.click();
    search.sendKeys("toys");
    takeascrennshot("search ebay");
  
    ct.addScreenCaptureFromPath(projectpath+"\\screenshot\\see.png");
  
    et.flush();
	}

}
