package scriptexecutor;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import mavenid.mavenpractice.Base;

public class Practice1  extends Base{

	public static void main(String[] args) throws Throwable {
		
		
		launch_browser("chrome");
		
		
		hiturl("amazon");
		
		WebElement se = driver.findElement(By.xpath(" //input[@id=\"twotabsearchtextbox\"]"));
		
		se.click();
		System.out.println("click on search button ");
		
		se.sendKeys("mobiles");
	  
	

	
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeAsyncScript("﻿﻿window.scroll(0,400)");


		
		
		driver.close();
		
		
	}

}
