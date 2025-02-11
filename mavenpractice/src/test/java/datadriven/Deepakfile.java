package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deepakfile {

	public static void main(String[] args) throws Throwable {
	

		
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\OneDrive\\Documents");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		
		XSSFSheet sheet = workbook.getSheet("sheet2");
		
		
	XSSFRow row = sheet.getRow(1);
	
	XSSFCell cell = row.getCell(1);
	
	
	String cellvalue = cell.getStringCellValue();
	System.out.println(cellvalue);
	int rowcount = sheet.getLastRowNum();
	
	
WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	
	 driver.get("https://www.facebook.com/login/");
	
	driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys(cellvalue);
	

	
	}

}
