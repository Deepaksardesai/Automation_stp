package robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import mavenid.mavenpractice.Base;

public class Practice1 extends Base {

	public static void main(String[] args) throws Throwable {
		
launch_browser("chrome");

hiturl("https://www.ilovepdf.com/word_to_pdf");

driver.findElement(By.xpath("//a[@id=\"pickfiles\"]")).click();

StringSelection ss = new StringSelection("\"D:\\stp\\wordfor practice\\pdf convertert file.docx\"");

Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
Robot r = new Robot();
r.delay(3000);
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_V);


r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_V);

r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);

	}

}
